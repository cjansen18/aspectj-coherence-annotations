package com.redsparksystems.pof;

import com.tangosol.io.pof.ConfigurablePofContext;
import com.tangosol.util.Binary;
import com.tangosol.util.ExternalizableHelper;
import com.redsparksystems.domain.Person;
import com.redsparksystems.domain.PersonNoAnnotations;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Christopher M. Jansen 
 * Date: 4/19/13 
 * Time: 12:44 PM 
 * Red Spark Systems
 * 
 */
public class POFTest {

	ConfigurablePofContext serializer;

	@Before
	public void setup() {
		serializer = new ConfigurablePofContext(
				"com/redsparksystems/pof/pof-config.xml");
	}

	/**
	 * This method performs Coherence POF serialization using manually annotated classes
	 * 
	 * @see package com.redsparksystems.aspects.CoherencePortableObject (use this to
	 *      specify package/objects of interest to apply POF too)
	 * @see com/redsparksystems/pofTests/pof-config.xml (domain objects need to be
	 *      entered here)
	 */
	@Test
	public void testSerializationViaManuallyAppliedAnnotations() {
		Person person = new com.redsparksystems.domain.Person();

		person.setFirstName("Chris");
		person.setLastName("Jansen");
		person.setMiddleName("MyMiddleName");

		Binary binary = ExternalizableHelper.toBinary(person, serializer);

		Person personDeserialized = (Person) ExternalizableHelper.fromBinary(
				binary, serializer);

		assertEquals(personDeserialized.getFirstName(), person.getFirstName());
		assertEquals(personDeserialized.getMiddleName(), person.getMiddleName());
		assertEquals(personDeserialized.getLastName(), person.getLastName());
	}

	/**
	 * This method performs Coherence POF serialization using manually anntoated
	 * classes
	 */
	@Test
	public void testSerializationUsingAspects() {
		PersonNoAnnotations personNoAnnotations = new PersonNoAnnotations();

		personNoAnnotations.setFirstName("Jim");
		personNoAnnotations.setLastName("Julio");
		personNoAnnotations.setMiddleName("Theodore");

		Binary binary = ExternalizableHelper.toBinary(personNoAnnotations,
				serializer);

		PersonNoAnnotations personDeserialized = (PersonNoAnnotations) ExternalizableHelper
				.fromBinary(binary, serializer);

		assertEquals(personDeserialized.getFirstName(),
				personNoAnnotations.getFirstName());
		assertEquals(personDeserialized.getMiddleName(),
				personNoAnnotations.getMiddleName());
		assertEquals(personDeserialized.getLastName(),
				personNoAnnotations.getLastName());

	}

}
