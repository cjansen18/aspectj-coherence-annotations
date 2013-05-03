package com.redsparksystems.pof.serializer;

import com.tangosol.io.Evolvable;
import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofSerializer;
import com.tangosol.io.pof.PofWriter;
import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.reflect.internal.AnnotationVisitor;
import com.tangosol.io.pof.reflect.internal.ClassMetadataBuilder;
import com.tangosol.io.pof.reflect.internal.TypeMetadata;
import com.tangosol.io.pof.reflect.internal.TypeMetadata.AttributeMetadata;
import com.tangosol.util.Binary;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * This annotation serializer is designed to work with the automatic indexing feature for Oracle's POF portable properties.
 * 
 * Assumption is that all attributes in a given class(es) are to be serialized by POF.  
 * 
 * Due to the fact that automatic indexing is being used, Oracle POF will assign indexes to portable properties in a given class.  Observed that these
 * indexes are assigned to attributes alpabetic order.  This causes a potential problem in backward compatiblity if 
 * data is deserialized using a different version of the POF object than was used for serialization.
 * 
 * To get around this, portable property indexes are being created within this class by taking a hashcode of the attributes name.  These hashcodes
 * are stored in a treemap, using the domain object class name as a key.
 * 
 * Side notes:
 * ===========
 * 1. This serializer needs to be specified in pof-config.xml for each class of interest.
 * 2. Be sure the aspects are properly configured for each class of interest too.
 * 
 * @author Christopher M. Jansen
 *
 * @param <T>
 */
public class AutomaticPofAnnotationSerializer<T>
        implements PofSerializer
{
    private TypeMetadata<T> m_tmd;
    //CMJ -added TreeMaps below
    private TreeMap<String, TreeMap<Integer, Object>> classTreeMap = new TreeMap<String, TreeMap<Integer, Object>>();    
    private TreeMap<Integer, Object> attributeTreeMap=new TreeMap<Integer, Object>();

    public AutomaticPofAnnotationSerializer(int nTypeId, Class<T> clz)
    {
        this(nTypeId, clz, false);
    }

    public AutomaticPofAnnotationSerializer(int nTypeId, Class<T> clz, boolean fAutoIndex)
    {
        if (clz == null)
        {
            throw new IllegalArgumentException("AutomaticPofAnnotationSerializer requires a class");
        }

        initialize(nTypeId, clz, fAutoIndex);
    }

    public void serialize(PofWriter out, Object o)
            throws IOException
    {
        boolean fEvolvable = o instanceof Evolvable;
        Evolvable evolvable = null;
        if (fEvolvable)
        {
            evolvable = (Evolvable)o;
            out.setVersionId(Math.max(evolvable.getDataVersion(), evolvable.getImplVersion()));
        }              
        
        // CMJ -commented out Oracle code from com.tangosol.io.pof.PofAnnotationSerializer
		//        com.tangosol.io.pof.reflect.internal.TypeMetadata.AttributeMetadata attr;
		//        for(Iterator iter = m_tmd.getAttributes(); iter.hasNext(); attr.getCodec().encode(out, attr.getIndex(), attr.get(o)))
		//            attr = (com.tangosol.io.pof.reflect.internal.TypeMetadata.AttributeMetadata)iter.next();
        
        //1. load all values into treeMap
        TreeMap<Integer, Object> localAttributeTreeMap=retrieveAttributeMapForClass(this.m_tmd);
        
        //2. iterate over treemap and encode values
        for(Map.Entry<Integer,Object> entry : localAttributeTreeMap.entrySet()) {
        	TypeMetadata.AttributeMetadata attr=(AttributeMetadata) entry.getValue();
        	//use TreeMap (entry key, which is the hash of the name)
        	if(attr!=null)
        		attr.getCodec().encode(out, entry.getKey(), attr.get(o));
        	}             

        Binary binRemainder = null;
        if (fEvolvable)
        {
            binRemainder = evolvable.getFutureData();
        }
        out.writeRemainder(binRemainder);
    }
    
    public Object deserialize(PofReader in)
            throws IOException
    {
        TypeMetadata tmd = this.m_tmd;
        Object value = tmd.newInstance();

        boolean fEvolvable = value instanceof Evolvable;
        Evolvable evolvable = null;
        if (fEvolvable)
        {
            evolvable = (Evolvable)value;
            evolvable.setDataVersion(in.getVersionId());
        }
        
        //CMJ -commented out Oracle code from com.tangosol.io.pof.PofAnnotationSerializer
		//        com.tangosol.io.pof.reflect.internal.TypeMetadata.AttributeMetadata attr;
		//        for(Iterator iter = tmd.getAttributes(); iter.hasNext(); attr.set(value, attr.getCodec().decode(in, attr.getIndex())))
		//            attr = (com.tangosol.io.pof.reflect.internal.TypeMetadata.AttributeMetadata)iter.next();
        
        
        //1. Obtain all of the attribute values from a treemap.  The numeric ordering of the encoding (in step #2 below) matters, hence the use of the treemap.        
        TreeMap<Integer, Object> localAttributeTreeMap=retrieveAttributeMapForClass(this.m_tmd);
        
        //2. iterate over treemap and encode values
        for(Map.Entry<Integer,Object> entry : localAttributeTreeMap.entrySet()) {
        	//TypeMetadata.AttributeMetadata attr=(AttributeMetadata) entry.getValue();
        	Integer key=(Integer) entry.getKey();
        	TypeMetadata.AttributeMetadata attr=(AttributeMetadata) entry.getValue();
        	//use TreeMap (entry key, which is the hash of the name)
        	if(attr!=null)
                attr.set(value, attr.getCodec().decode(in, key));
        }   

        Binary binRemainder = in.readRemainder();
        if (fEvolvable)
        {
            evolvable.setFutureData(binRemainder);
        }
        return value;
    }
    
    private TreeMap<Integer, Object> retrieveAttributeMapForClass(TypeMetadata<T> m_tmd){

    	String classNameOfInterest=m_tmd.newInstance().getClass().getName();

    	//1. - Check to see if this class has been dealt with already
    	if (!this.classTreeMap.containsKey(classNameOfInterest)) {
    		//1.a - Create a new attributeTreeMap, which will contain a list of attributes for this class.
    		TreeMap<Integer, Object> attributeTreeMap=new TreeMap<Integer, Object>();
    		for (Iterator iter = this.m_tmd.getAttributes(); iter.hasNext(); )
    		{
    			TypeMetadata.AttributeMetadata attr = (TypeMetadata.AttributeMetadata)iter.next();
    			//1.a.1 - Obtain a hashcode for each attribute using the attribute's name.  Assumption here is that we won't have 2 attributes with the same name in the same class.
    			attributeTreeMap.put(absoluteValueHash(attr.getName()), attr);
    		}
    		//1.b - Insert this attributeTreeMap into classTreeMap
    		classTreeMap.put(classNameOfInterest, attributeTreeMap);
    	}
    	
    	//2. At this point, we should have an attributeTreemap within the classTreeMap for the class of interest! 
    	return classTreeMap.get(classNameOfInterest);
    }
    
	private Integer absoluteValueHash(String localString){
		int hash=37;	
		hash = hash + (null == localString ? 0 : localString.hashCode());
		return (Math.abs(hash));
	}

    private void initialize(int nTypeId, Class<T> clz, boolean fAutoIndex)
    {
        Portable portable = (Portable)clz.getAnnotation(Portable.class);
        if (portable == null)
        {
            throw new IllegalArgumentException(String.format("Attempting to use %s for a class (%s) that has no %s annotation", new Object[] { getClass().getSimpleName(), clz.getName(), Portable.class.getSimpleName() }));
        }

        ClassMetadataBuilder builder = new ClassMetadataBuilder().setTypeId(nTypeId);

        builder.accept(new AnnotationVisitor(fAutoIndex), clz);
        this.m_tmd = builder.build();
    }
}