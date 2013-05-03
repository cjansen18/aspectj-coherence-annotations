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
 * Tax Identification should include both the taxIdNumber and type, however the type may not be known.
 * 
 * <p>Java class for RelaxedTaxId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelaxedTaxId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxIdNumber" type="{http://service.redsparksystems.com/base/2003/}TIN_Type"/>
 *         &lt;element name="taxIdType" type="{http://service.redsparksystems.com/base/2003/}TINType_Enum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelaxedTaxId_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "taxIdNumber",
    "taxIdType"
})
public class RelaxedTaxIdType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected String taxIdNumber;
    protected TINTypeEnum taxIdType;

    /**
     * Gets the value of the taxIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    /**
     * Sets the value of the taxIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNumber(String value) {
        this.taxIdNumber = value;
    }

    /**
     * Gets the value of the taxIdType property.
     * 
     * @return
     *     possible object is
     *     {@link TINTypeEnum }
     *     
     */
    public TINTypeEnum getTaxIdType() {
        return taxIdType;
    }

    /**
     * Sets the value of the taxIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TINTypeEnum }
     *     
     */
    public void setTaxIdType(TINTypeEnum value) {
        this.taxIdType = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("taxIdNumber", taxIdNumber).add("taxIdType", taxIdType).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(taxIdNumber, taxIdType);
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
        final RelaxedTaxIdType o = ((RelaxedTaxIdType) other);
        return (Objects.equal(taxIdNumber, o.taxIdNumber)&&Objects.equal(taxIdType, o.taxIdType));
    }

    public RelaxedTaxIdType withTaxIdNumber(String value) {
        setTaxIdNumber(value);
        return this;
    }

    public RelaxedTaxIdType withTaxIdType(TINTypeEnum value) {
        setTaxIdType(value);
        return this;
    }

}
