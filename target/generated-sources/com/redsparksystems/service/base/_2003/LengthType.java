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
 * Length Measurement
 * 
 * <p>Java class for Length_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Length_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lengthValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="lengthUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Length_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "lengthValue",
    "lengthUnit"
})
public class LengthType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected BigDecimal lengthValue;
    @XmlElement(required = true)
    protected String lengthUnit;

    /**
     * Gets the value of the lengthValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLengthValue() {
        return lengthValue;
    }

    /**
     * Sets the value of the lengthValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLengthValue(BigDecimal value) {
        this.lengthValue = value;
    }

    /**
     * Gets the value of the lengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Sets the value of the lengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthUnit(String value) {
        this.lengthUnit = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("lengthValue", lengthValue).add("lengthUnit", lengthUnit).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lengthValue, lengthUnit);
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
        final LengthType o = ((LengthType) other);
        return (Objects.equal(lengthValue, o.lengthValue)&&Objects.equal(lengthUnit, o.lengthUnit));
    }

    public LengthType withLengthValue(BigDecimal value) {
        setLengthValue(value);
        return this;
    }

    public LengthType withLengthUnit(String value) {
        setLengthUnit(value);
        return this;
    }

}