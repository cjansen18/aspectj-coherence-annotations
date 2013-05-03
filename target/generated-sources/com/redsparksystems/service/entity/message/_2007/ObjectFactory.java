//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.entity.message._2007;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redsparksystems.service.entity.message._2007 package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BehaviorVersion_QNAME = new QName("http://service.redsparksystems.com/entity/message/2007/", "behaviorVersion");
    private final static QName _ProcessingMode_QNAME = new QName("http://service.redsparksystems.com/entity/message/2007/", "processingMode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redsparksystems.service.entity.message._2007
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WFFaultList }
     * 
     */
    public WFFaultList createWFFaultList() {
        return new WFFaultList();
    }

    /**
     * Create an instance of {@link WFFault }
     * 
     */
    public WFFault createWFFault() {
        return new WFFault();
    }

    /**
     * Create an instance of {@link DataReferenceType }
     * 
     */
    public DataReferenceType createDataReferenceType() {
        return new DataReferenceType();
    }

    /**
     * Create an instance of {@link WFContext }
     * 
     */
    public WFContext createWFContext() {
        return new WFContext();
    }

    /**
     * Create an instance of {@link SessionType }
     * 
     */
    public SessionType createSessionType() {
        return new SessionType();
    }

    /**
     * Create an instance of {@link OriginatorType }
     * 
     */
    public OriginatorType createOriginatorType() {
        return new OriginatorType();
    }

    /**
     * Create an instance of {@link InitiatorType }
     * 
     */
    public InitiatorType createInitiatorType() {
        return new InitiatorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/entity/message/2007/", name = "behaviorVersion")
    public JAXBElement<Short> createBehaviorVersion(Short value) {
        return new JAXBElement<Short>(_BehaviorVersion_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingModeEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/entity/message/2007/", name = "processingMode")
    public JAXBElement<ProcessingModeEnum> createProcessingMode(ProcessingModeEnum value) {
        return new JAXBElement<ProcessingModeEnum>(_ProcessingMode_QNAME, ProcessingModeEnum.class, null, value);
    }

}
