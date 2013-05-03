//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.trading._2013;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;
import com.redsparksystems.service.provider.fxaip.base._2013.EntityType;
import com.redsparksystems.service.provider.fxaip.base._2013.SourceSystemType;


/**
 * Base for all trade requests
 * 
 * <p>Java class for TradeRequest_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeRequest_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerId" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}Entity_Type"/>
 *         &lt;element name="sourceReferenceId" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}ReferenceId_Type"/>
 *         &lt;element name="sourceSystem" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}SourceSystem_Type"/>
 *         &lt;element name="userId" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}Entity_Type" minOccurs="0"/>
 *         &lt;element name="externalRef1" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}ReferenceId_Type" minOccurs="0"/>
 *         &lt;element name="externalRef2" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}ReferenceId_Type" minOccurs="0"/>
 *         &lt;element name="flipExternalResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="salesCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="coverTradeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}AdditionalInfo_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeRequest_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/", propOrder = {
    "tradeId",
    "contractId",
    "contractSeq",
    "branch",
    "customerId",
    "sourceReferenceId",
    "sourceSystem",
    "userId",
    "externalRef1",
    "externalRef2",
    "flipExternalResponse",
    "salesCredit",
    "coverTradeId",
    "additionalInfo"
})
@XmlSeeAlso({
    MCATradeRequestType.class,
    FXSwapTradeRequestType.class,
    FXSpotFwdTradeRequestType.class,
    TradeDepositRequestType.class
})
@Portable
public abstract class TradeRequestType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @PortableProperty(9)
    protected BigInteger tradeId;
    @PortableProperty(0)
    protected String contractId;
    @PortableProperty(1)
    protected String contractSeq;
    @XmlElement(required = true)
    @PortableProperty(2)
    protected String branch;
    @XmlElement(required = true)
    @PortableProperty(3)
    protected EntityType customerId;
    @XmlElement(required = true)
    @PortableProperty(4)
    protected String sourceReferenceId;
    @XmlElement(required = true)
    @PortableProperty(7)
    protected SourceSystemType sourceSystem;
    @PortableProperty(8)
    protected EntityType userId;
    @PortableProperty(10)
    protected String externalRef1;
    @PortableProperty(11)
    protected String externalRef2;
    @PortableProperty(12)
    protected Boolean flipExternalResponse;
    @PortableProperty(5)
    protected Boolean salesCredit;
    @PortableProperty(13)
    protected String coverTradeId;
    @PortableProperty(6)
    protected AdditionalInfoType additionalInfo;

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTradeId(BigInteger value) {
        this.tradeId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSeq() {
        return contractSeq;
    }

    /**
     * Sets the value of the contractSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSeq(String value) {
        this.contractSeq = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setCustomerId(EntityType value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the sourceReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    /**
     * Sets the value of the sourceReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceReferenceId(String value) {
        this.sourceReferenceId = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSystemType }
     *     
     */
    public SourceSystemType getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSystemType }
     *     
     */
    public void setSourceSystem(SourceSystemType value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setUserId(EntityType value) {
        this.userId = value;
    }

    /**
     * Gets the value of the externalRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRef1() {
        return externalRef1;
    }

    /**
     * Sets the value of the externalRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRef1(String value) {
        this.externalRef1 = value;
    }

    /**
     * Gets the value of the externalRef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRef2() {
        return externalRef2;
    }

    /**
     * Sets the value of the externalRef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRef2(String value) {
        this.externalRef2 = value;
    }

    /**
     * Gets the value of the flipExternalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlipExternalResponse() {
        return flipExternalResponse;
    }

    /**
     * Sets the value of the flipExternalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlipExternalResponse(Boolean value) {
        this.flipExternalResponse = value;
    }

    /**
     * Gets the value of the salesCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalesCredit() {
        return salesCredit;
    }

    /**
     * Sets the value of the salesCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalesCredit(Boolean value) {
        this.salesCredit = value;
    }

    /**
     * Gets the value of the coverTradeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverTradeId() {
        return coverTradeId;
    }

    /**
     * Sets the value of the coverTradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverTradeId(String value) {
        this.coverTradeId = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfoType }
     *     
     */
    public AdditionalInfoType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfoType }
     *     
     */
    public void setAdditionalInfo(AdditionalInfoType value) {
        this.additionalInfo = value;
    }

    public TradeRequestType withTradeId(BigInteger value) {
        setTradeId(value);
        return this;
    }

    public TradeRequestType withContractId(String value) {
        setContractId(value);
        return this;
    }

    public TradeRequestType withContractSeq(String value) {
        setContractSeq(value);
        return this;
    }

    public TradeRequestType withBranch(String value) {
        setBranch(value);
        return this;
    }

    public TradeRequestType withCustomerId(EntityType value) {
        setCustomerId(value);
        return this;
    }

    public TradeRequestType withSourceReferenceId(String value) {
        setSourceReferenceId(value);
        return this;
    }

    public TradeRequestType withSourceSystem(SourceSystemType value) {
        setSourceSystem(value);
        return this;
    }

    public TradeRequestType withUserId(EntityType value) {
        setUserId(value);
        return this;
    }

    public TradeRequestType withExternalRef1(String value) {
        setExternalRef1(value);
        return this;
    }

    public TradeRequestType withExternalRef2(String value) {
        setExternalRef2(value);
        return this;
    }

    public TradeRequestType withFlipExternalResponse(Boolean value) {
        setFlipExternalResponse(value);
        return this;
    }

    public TradeRequestType withSalesCredit(Boolean value) {
        setSalesCredit(value);
        return this;
    }

    public TradeRequestType withCoverTradeId(String value) {
        setCoverTradeId(value);
        return this;
    }

    public TradeRequestType withAdditionalInfo(AdditionalInfoType value) {
        setAdditionalInfo(value);
        return this;
    }

}