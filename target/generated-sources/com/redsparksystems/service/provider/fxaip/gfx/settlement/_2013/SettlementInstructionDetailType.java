//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.settlement._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * TODO
 * 
 * <p>Java class for SettlementInstructionDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementInstructionDetail_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearingSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementText5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settlementText6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInstructionDetail_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", propOrder = {

})
public class SettlementInstructionDetailType implements Serializable
{

    private final static long serialVersionUID = 17L;
    protected String accountNumber;
    protected String bic;
    protected String clearingSystemCode;
    protected String settlementText1;
    protected String settlementText2;
    protected String settlementText3;
    protected String settlementText4;
    protected String settlementText5;
    protected String settlementText6;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the clearingSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingSystemCode() {
        return clearingSystemCode;
    }

    /**
     * Sets the value of the clearingSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingSystemCode(String value) {
        this.clearingSystemCode = value;
    }

    /**
     * Gets the value of the settlementText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementText1() {
        return settlementText1;
    }

    /**
     * Sets the value of the settlementText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementText1(String value) {
        this.settlementText1 = value;
    }

    /**
     * Gets the value of the settlementText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementText2() {
        return settlementText2;
    }

    /**
     * Sets the value of the settlementText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementText2(String value) {
        this.settlementText2 = value;
    }

    /**
     * Gets the value of the settlementText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementText3() {
        return settlementText3;
    }

    /**
     * Sets the value of the settlementText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementText3(String value) {
        this.settlementText3 = value;
    }

    /**
     * Gets the value of the settlementText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementText4() {
        return settlementText4;
    }

    /**
     * Sets the value of the settlementText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementText4(String value) {
        this.settlementText4 = value;
    }

    /**
     * Gets the value of the settlementText5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementText5() {
        return settlementText5;
    }

    /**
     * Sets the value of the settlementText5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementText5(String value) {
        this.settlementText5 = value;
    }

    /**
     * Gets the value of the settlementText6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementText6() {
        return settlementText6;
    }

    /**
     * Sets the value of the settlementText6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementText6(String value) {
        this.settlementText6 = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("accountNumber", accountNumber).add("bic", bic).add("clearingSystemCode", clearingSystemCode).add("settlementText1", settlementText1).add("settlementText2", settlementText2).add("settlementText3", settlementText3).add("settlementText4", settlementText4).add("settlementText5", settlementText5).add("settlementText6", settlementText6).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accountNumber, bic, clearingSystemCode, settlementText1, settlementText2, settlementText3, settlementText4, settlementText5, settlementText6);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass()!= other.getClass()) {
            return false;
        }
        final SettlementInstructionDetailType o = ((SettlementInstructionDetailType) other);
        return ((((((((Objects.equal(accountNumber, o.accountNumber)&&Objects.equal(bic, o.bic))&&Objects.equal(clearingSystemCode, o.clearingSystemCode))&&Objects.equal(settlementText1, o.settlementText1))&&Objects.equal(settlementText2, o.settlementText2))&&Objects.equal(settlementText3, o.settlementText3))&&Objects.equal(settlementText4, o.settlementText4))&&Objects.equal(settlementText5, o.settlementText5))&&Objects.equal(settlementText6, o.settlementText6));
    }

    public SettlementInstructionDetailType withAccountNumber(String value) {
        setAccountNumber(value);
        return this;
    }

    public SettlementInstructionDetailType withBic(String value) {
        setBic(value);
        return this;
    }

    public SettlementInstructionDetailType withClearingSystemCode(String value) {
        setClearingSystemCode(value);
        return this;
    }

    public SettlementInstructionDetailType withSettlementText1(String value) {
        setSettlementText1(value);
        return this;
    }

    public SettlementInstructionDetailType withSettlementText2(String value) {
        setSettlementText2(value);
        return this;
    }

    public SettlementInstructionDetailType withSettlementText3(String value) {
        setSettlementText3(value);
        return this;
    }

    public SettlementInstructionDetailType withSettlementText4(String value) {
        setSettlementText4(value);
        return this;
    }

    public SettlementInstructionDetailType withSettlementText5(String value) {
        setSettlementText5(value);
        return this;
    }

    public SettlementInstructionDetailType withSettlementText6(String value) {
        setSettlementText6(value);
        return this;
    }

}