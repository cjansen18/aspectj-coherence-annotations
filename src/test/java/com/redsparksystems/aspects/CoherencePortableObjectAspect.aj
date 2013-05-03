package com.redsparksystems.aspects;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;

/**
 * User: Christopher M. Jansen
 * Date: 5/1/13
 * Time: 10:56 AM
 * Red Spark Systems
 */
public aspect CoherencePortableObjectAspect {


	/**
	 * Class level annotations. 
	 * !@Portable means 'only apply to classes currently without the @Portable annotation'.	
	 */
    declare @type: !@Portable com.redsparksystems.domain..* : @Portable;
	/**
	 * Class level annotations. 
	 * !@PortableProperty means 'only apply to fields currently without the @PortableProperty annotation'.
	 * Note: if a user manually applies an annotation with an index, it will be ignored if the PofForAll serializer is used.  	
	 */ 
    declare @field: !@PortableProperty * com.redsparksystems.domain..* : @PortableProperty;
}
