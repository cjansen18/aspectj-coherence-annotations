//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.base._2003;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * An amount that recurs perodically.
 * 
 * <p>Java class for PeriodicAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicAmt_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://service.redsparksystems.com/base/2003/}Recurrence_Enum"/>
 *         &lt;element name="amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="currencyCode" type="{http://service.redsparksystems.com/base/2003/}CurrencyCode_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicAmt_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "frequency",
    "amt",
    "currencyCode"
})
public class PeriodicAmtType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected RecurrenceEnum frequency;
    @XmlElement(required = true)
    protected BigDecimal amt;
    protected String currencyCode;

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceEnum }
     *     
     */
    public RecurrenceEnum getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceEnum }
     *     
     */
    public void setFrequency(RecurrenceEnum value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("frequency", frequency).add("amt", amt).add("currencyCode", currencyCode).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(frequency, amt, currencyCode);
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
        final PeriodicAmtType o = ((PeriodicAmtType) other);
        return ((Objects.equal(frequency, o.frequency)&&Objects.equal(amt, o.amt))&&Objects.equal(currencyCode, o.currencyCode));
    }

    public PeriodicAmtType withFrequency(RecurrenceEnum value) {
        setFrequency(value);
        return this;
    }

    public PeriodicAmtType withAmt(BigDecimal value) {
        setAmt(value);
        return this;
    }

    public PeriodicAmtType withCurrencyCode(String value) {
        setCurrencyCode(value);
        return this;
    }

}
