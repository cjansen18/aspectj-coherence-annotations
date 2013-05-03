//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.base._2003;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * <p>Java class for DayOfTheWeekCodeList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayOfTheWeekCodeList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfTheWeekCode" type="{http://service.redsparksystems.com/base/2003/}DayOfTheWeekCode_Enum" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayOfTheWeekCodeList_Type", namespace = "http://service.redsparksystems.com/base/2003/", propOrder = {
    "dayOfTheWeekCodes"
})
public class DayOfTheWeekCodeListType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(name = "dayOfTheWeekCode", required = true)
    protected List<DayOfTheWeekCodeEnum> dayOfTheWeekCodes;

    /**
     * Gets the value of the dayOfTheWeekCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfTheWeekCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfTheWeekCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfTheWeekCodeEnum }
     * 
     * 
     */
    public List<DayOfTheWeekCodeEnum> getDayOfTheWeekCodes() {
        if (dayOfTheWeekCodes == null) {
            dayOfTheWeekCodes = new ArrayList<DayOfTheWeekCodeEnum>();
        }
        return this.dayOfTheWeekCodes;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("dayOfTheWeekCodes", dayOfTheWeekCodes).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dayOfTheWeekCodes);
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
        final DayOfTheWeekCodeListType o = ((DayOfTheWeekCodeListType) other);
        return Objects.equal(dayOfTheWeekCodes, o.dayOfTheWeekCodes);
    }

    public DayOfTheWeekCodeListType withDayOfTheWeekCodes(DayOfTheWeekCodeEnum... values) {
        if (values!= null) {
            for (DayOfTheWeekCodeEnum value: values) {
                getDayOfTheWeekCodes().add(value);
            }
        }
        return this;
    }

    public DayOfTheWeekCodeListType withDayOfTheWeekCodes(Collection<DayOfTheWeekCodeEnum> values) {
        if (values!= null) {
            getDayOfTheWeekCodes().addAll(values);
        }
        return this;
    }

}
