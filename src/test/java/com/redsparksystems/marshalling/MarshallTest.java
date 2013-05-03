package com.redsparksystems.marshalling;

import com.redsparksystems.domain.BogusMCATradeRequestType;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

/**
 * User: Christopher M. Jansen
 * Date: 4/9/13
 * Time: 3:24 PM
 * Red Spark Systems
 *
 */
@ContextConfiguration(locations={"MarshallTest-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MarshallTest {

	@Autowired
	Jaxb2Marshaller jaxbMarshaller;

	File localFile=null;

	@Test
	public void testMarshalling() throws IOException {
		BogusMCATradeRequestType bogusMCATradeRequestType=new BogusMCATradeRequestType();

		bogusMCATradeRequestType.setCoBankName("yoMommasBank");

		//marshall obj to XML
		localFile=new File("mcaTradeRequestType.xml");
		FileOutputStream outputStream = new FileOutputStream(localFile);
		StreamResult result = new StreamResult(outputStream);
		jaxbMarshaller.marshal(bogusMCATradeRequestType, result);

		FileInputStream fileInputStream
		= new FileInputStream(new File("mcaTradeRequestType.xml"));

		//unmarshall XML to obj
		BogusMCATradeRequestType unmarshalledMcaTradeRequestType=
				(BogusMCATradeRequestType) jaxbMarshaller.unmarshal(new StreamSource(fileInputStream));


		assertNotNull(bogusMCATradeRequestType.getCoBankName());
		assertEquals(unmarshalledMcaTradeRequestType.getCoBankName(), bogusMCATradeRequestType.getCoBankName());

		outputStream.flush();
		outputStream.close();
	}

	@After
	public void cleanup(){
		if(localFile.delete()){
			System.out.println(localFile.getName() + " has been successfully deleted!");
		}else{
			System.out.println(localFile.getName() + " has NOT been deleted!");
		}
	}


}
