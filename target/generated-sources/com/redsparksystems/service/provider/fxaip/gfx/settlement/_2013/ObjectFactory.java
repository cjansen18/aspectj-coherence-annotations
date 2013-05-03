//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.settlement._2013;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redsparksystems.service.provider.fxaip.gfx.settlement._2013 package.
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

    private final static QName _DDASettlement_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "DDA-Settlement");
    private final static QName _GLSettlement_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "GL-Settlement");
    private final static QName _BasicSettlementData_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "BasicSettlementData");
    private final static QName _MCASettlement_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "MCA-Settlement");
    private final static QName _WireSettlement_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "Wire-Settlement");
    private final static QName _DACHSettlement_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "DACH-Settlement");
    private final static QName _SingleSettlementData_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "SingleSettlementData");
    private final static QName _SettlementData_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "SettlementData");
    private final static QName _IISSettlement_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "IIS-Settlement");
    private final static QName _SwapSettlementData_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "SwapSettlementData");
    private final static QName _SettlementHeader_QNAME = new QName("http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", "settlementHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redsparksystems.service.provider.fxaip.gfx.settlement._2013
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SettlementStatusListType }
     * 
     */
    public SettlementStatusListType createSettlementStatusListType() {
        return new SettlementStatusListType();
    }

    /**
     * Create an instance of {@link SettlementDACHType }
     * 
     */
    public SettlementDACHType createSettlementDACHType() {
        return new SettlementDACHType();
    }

    /**
     * Create an instance of {@link SwapSettlementDataType }
     * 
     */
    public SwapSettlementDataType createSwapSettlementDataType() {
        return new SwapSettlementDataType();
    }

    /**
     * Create an instance of {@link SettlementWireType }
     * 
     */
    public SettlementWireType createSettlementWireType() {
        return new SettlementWireType();
    }

    /**
     * Create an instance of {@link SettlementGLType }
     * 
     */
    public SettlementGLType createSettlementGLType() {
        return new SettlementGLType();
    }

    /**
     * Create an instance of {@link SettlementDDAType }
     * 
     */
    public SettlementDDAType createSettlementDDAType() {
        return new SettlementDDAType();
    }

    /**
     * Create an instance of {@link SingleSettlementDataType }
     * 
     */
    public SingleSettlementDataType createSingleSettlementDataType() {
        return new SingleSettlementDataType();
    }

    /**
     * Create an instance of {@link SettlementIISType }
     * 
     */
    public SettlementIISType createSettlementIISType() {
        return new SettlementIISType();
    }

    /**
     * Create an instance of {@link SettlementMCAType }
     * 
     */
    public SettlementMCAType createSettlementMCAType() {
        return new SettlementMCAType();
    }

    /**
     * Create an instance of {@link BasicSettlementDataType }
     * 
     */
    public BasicSettlementDataType createBasicSettlementDataType() {
        return new BasicSettlementDataType();
    }

    /**
     * Create an instance of {@link SettlementInstructionType }
     * 
     */
    public SettlementInstructionType createSettlementInstructionType() {
        return new SettlementInstructionType();
    }

    /**
     * Create an instance of {@link SettlementDetailsType }
     * 
     */
    public SettlementDetailsType createSettlementDetailsType() {
        return new SettlementDetailsType();
    }

    /**
     * Create an instance of {@link SettlementInstructionDetailType }
     * 
     */
    public SettlementInstructionDetailType createSettlementInstructionDetailType() {
        return new SettlementInstructionDetailType();
    }

    /**
     * Create an instance of {@link SettlementInfoType }
     * 
     */
    public SettlementInfoType createSettlementInfoType() {
        return new SettlementInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementDDAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "DDA-Settlement", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "settlementHeader")
    public JAXBElement<SettlementDDAType> createDDASettlement(SettlementDDAType value) {
        return new JAXBElement<SettlementDDAType>(_DDASettlement_QNAME, SettlementDDAType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementGLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "GL-Settlement", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "settlementHeader")
    public JAXBElement<SettlementGLType> createGLSettlement(SettlementGLType value) {
        return new JAXBElement<SettlementGLType>(_GLSettlement_QNAME, SettlementGLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicSettlementDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "BasicSettlementData", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "SettlementData")
    public JAXBElement<BasicSettlementDataType> createBasicSettlementData(BasicSettlementDataType value) {
        return new JAXBElement<BasicSettlementDataType>(_BasicSettlementData_QNAME, BasicSettlementDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementMCAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "MCA-Settlement", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "settlementHeader")
    public JAXBElement<SettlementMCAType> createMCASettlement(SettlementMCAType value) {
        return new JAXBElement<SettlementMCAType>(_MCASettlement_QNAME, SettlementMCAType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementWireType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "Wire-Settlement", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "settlementHeader")
    public JAXBElement<SettlementWireType> createWireSettlement(SettlementWireType value) {
        return new JAXBElement<SettlementWireType>(_WireSettlement_QNAME, SettlementWireType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementDACHType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "DACH-Settlement", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "settlementHeader")
    public JAXBElement<SettlementDACHType> createDACHSettlement(SettlementDACHType value) {
        return new JAXBElement<SettlementDACHType>(_DACHSettlement_QNAME, SettlementDACHType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleSettlementDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "SingleSettlementData", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "SettlementData")
    public JAXBElement<SingleSettlementDataType> createSingleSettlementData(SingleSettlementDataType value) {
        return new JAXBElement<SingleSettlementDataType>(_SingleSettlementData_QNAME, SingleSettlementDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "SettlementData")
    public JAXBElement<SettlementDataType> createSettlementData(SettlementDataType value) {
        return new JAXBElement<SettlementDataType>(_SettlementData_QNAME, SettlementDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementIISType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "IIS-Settlement", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "settlementHeader")
    public JAXBElement<SettlementIISType> createIISSettlement(SettlementIISType value) {
        return new JAXBElement<SettlementIISType>(_IISSettlement_QNAME, SettlementIISType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwapSettlementDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "SwapSettlementData", substitutionHeadNamespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", substitutionHeadName = "SettlementData")
    public JAXBElement<SwapSettlementDataType> createSwapSettlementData(SwapSettlementDataType value) {
        return new JAXBElement<SwapSettlementDataType>(_SwapSettlementData_QNAME, SwapSettlementDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", name = "settlementHeader")
    public JAXBElement<SettlementHeaderType> createSettlementHeader(SettlementHeaderType value) {
        return new JAXBElement<SettlementHeaderType>(_SettlementHeader_QNAME, SettlementHeaderType.class, null, value);
    }

}