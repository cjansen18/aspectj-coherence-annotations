package com.redsparksystems.pof;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.tangosol.io.WrapperInputStream;
import com.tangosol.io.pof.ConfigurablePofContext;
import com.tangosol.util.Binary;
import com.tangosol.util.BinaryWriteBuffer;
import com.tangosol.util.ExternalizableHelper;
import com.redsparksystems.domain.PersonNoAnnotations;

/**
 * Utility class to consume the binary file created by the POFWriter, and deserialize the bonary back to an object.
 * 
 * @author a426156
 *
 */
public class POFReader {
	
	public static void main(String [] args) throws IOException{
		File localFile = new File("fopTestVersion1.bin");		
		assertTrue("Binary file not found, have you run the POFWriter?",localFile.exists());
		
		ConfigurablePofContext serializer = new ConfigurablePofContext(
				"com/redsparksystems/pof/pof-config.xml");
		
        FileInputStream in = new FileInputStream(localFile);
        BinaryWriteBuffer buf = new BinaryWriteBuffer((int) localFile.length());
        buf.getBufferOutput().writeStream(new WrapperInputStream(in));
        
        Binary deserializedBinary=buf.toBinary();
        
		PersonNoAnnotations personDeserialized = (PersonNoAnnotations) ExternalizableHelper
				.fromBinary(deserializedBinary, serializer);	
		
		//normally, a debug break point is placed at the below line to interrogate the personDeserialized object.
		assertTrue(personDeserialized!=null);
	}
}
