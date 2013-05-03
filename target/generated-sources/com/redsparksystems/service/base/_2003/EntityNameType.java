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
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * The name of an individual or business.
 * 
 * <p>Java class for EntityName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityName_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="format" type="{http://service.redsparksystems.com/base/2003/}NameFormat_Enum" minOccurs="0"/>
 *         &lt;element name="nameComponents" type="{http://service.redsparksystems.com/base/2003/}NameComponents_Type" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://service.redsparksystems.com/base/2003/}NameLineList_Type" minOccurs="0"/>
 *         &lt;element name="phoneticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityName_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "format",
    "nameComponents",
    "fullName",
    "phoneticName"
})
public class EntityNameType implements Serializable
{

    private final static long serialVersionUID = 17L;
    protected NameFormatEnum format;
    protected NameComponentsType nameComponents;
    protected NameLineListType fullName;
    protected String phoneticName;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link NameFormatEnum }
     *     
     */
    public NameFormatEnum getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameFormatEnum }
     *     
     */
    public void setFormat(NameFormatEnum value) {
        this.format = value;
    }

    /**
     * Gets the value of the nameComponents property.
     * 
     * @return
     *     possible object is
     *     {@link NameComponentsType }
     *     
     */
    public NameComponentsType getNameComponents() {
        return nameComponents;
    }

    /**
     * Sets the value of the nameComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameComponentsType }
     *     
     */
    public void setNameComponents(NameComponentsType value) {
        this.nameComponents = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link NameLineListType }
     *     
     */
    public NameLineListType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameLineListType }
     *     
     */
    public void setFullName(NameLineListType value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the phoneticName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticName() {
        return phoneticName;
    }

    /**
     * Sets the value of the phoneticName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticName(String value) {
        this.phoneticName = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("format", format).add("nameComponents", nameComponents).add("fullName", fullName).add("phoneticName", phoneticName).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(format, nameComponents, fullName, phoneticName);
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
        final EntityNameType o = ((EntityNameType) other);
        return (((Objects.equal(format, o.format)&&Objects.equal(nameComponents, o.nameComponents))&&Objects.equal(fullName, o.fullName))&&Objects.equal(phoneticName, o.phoneticName));
    }

    public EntityNameType withFormat(NameFormatEnum value) {
        setFormat(value);
        return this;
    }

    public EntityNameType withNameComponents(NameComponentsType value) {
        setNameComponents(value);
        return this;
    }

    public EntityNameType withFullName(NameLineListType value) {
        setFullName(value);
        return this;
    }

    public EntityNameType withPhoneticName(String value) {
        setPhoneticName(value);
        return this;
    }

}