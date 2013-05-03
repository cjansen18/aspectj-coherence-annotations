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
 * Defines an identiy mememto for cursors
 * 
 * <p>Java class for CursorKey_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CursorKey_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encodedKey" type="{http://service.redsparksystems.com/base/2003/}EncodedValue_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CursorKey_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "encodedKey"
})
public class CursorKeyType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected String encodedKey;

    /**
     * Gets the value of the encodedKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodedKey() {
        return encodedKey;
    }

    /**
     * Sets the value of the encodedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodedKey(String value) {
        this.encodedKey = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("encodedKey", encodedKey).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(encodedKey);
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
        final CursorKeyType o = ((CursorKeyType) other);
        return Objects.equal(encodedKey, o.encodedKey);
    }

    public CursorKeyType withEncodedKey(String value) {
        setEncodedKey(value);
        return this;
    }

}
