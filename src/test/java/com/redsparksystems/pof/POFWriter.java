package com.redsparksystems.pof;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.tangosol.io.pof.ConfigurablePofContext;
import com.tangosol.util.Binary;
import com.tangosol.util.ExternalizableHelper;
import com.redsparksystems.domain.PersonNoAnnotations;

/**
 * Utility class to create a POF binary.  This will be consumed by the  POFReader class.
 * 
 * @author a426156
 *
 */
public class POFWriter {
		
	public static void main(String [] args) throws FileNotFoundException, IOException
	{
		ConfigurablePofContext serializer = new ConfigurablePofContext(
				"com/redsparksystems/pof/pof-config.xml");
		
		PersonNoAnnotations personNoAnnotations = new PersonNoAnnotations();

		personNoAnnotations.setFirstName("Jim");
		personNoAnnotations.setLastName("Celauro");
		personNoAnnotations.setMiddleName("Theodore");

		Binary binary = ExternalizableHelper.toBinary(personNoAnnotations,
				serializer);

		binary.writeTo(new FileOutputStream(new File("fopTestVersion1.bin")));
	}
	

}
