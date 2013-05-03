//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.base._2003;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * <p>Java class for Ratio_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ratio_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leftSideAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type"/>
 *         &lt;element name="rightSideAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratio_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "leftSideAmount",
    "rightSideAmount"
})
public class RatioType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected CurrencyAmtType leftSideAmount;
    @XmlElement(required = true)
    protected CurrencyAmtType rightSideAmount;

    /**
     * Gets the value of the leftSideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmtType }
     *     
     */
    public CurrencyAmtType getLeftSideAmount() {
        return leftSideAmount;
    }

    /**
     * Sets the value of the leftSideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmtType }
     *     
     */
    public void setLeftSideAmount(CurrencyAmtType value) {
        this.leftSideAmount = value;
    }

    /**
     * Gets the value of the rightSideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmtType }
     *     
     */
    public CurrencyAmtType getRightSideAmount() {
        return rightSideAmount;
    }

    /**
     * Sets the value of the rightSideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmtType }
     *     
     */
    public void setRightSideAmount(CurrencyAmtType value) {
        this.rightSideAmount = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("leftSideAmount", leftSideAmount).add("rightSideAmount", rightSideAmount).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(leftSideAmount, rightSideAmount);
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
        final RatioType o = ((RatioType) other);
        return (Objects.equal(leftSideAmount, o.leftSideAmount)&&Objects.equal(rightSideAmount, o.rightSideAmount));
    }

    public RatioType withLeftSideAmount(CurrencyAmtType value) {
        setLeftSideAmount(value);
        return this;
    }

    public RatioType withRightSideAmount(CurrencyAmtType value) {
        setRightSideAmount(value);
        return this;
    }

}