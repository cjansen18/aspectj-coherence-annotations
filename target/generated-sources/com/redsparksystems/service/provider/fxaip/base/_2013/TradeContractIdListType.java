//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.base._2013;

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
 * A list of TradeContractId values
 * 
 * <p>Java class for TradeContractIdList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeContractIdList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://service.redsparksystems.com/provider/fxaip/base/2013/}tradeIdentifier" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeContractIdList_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/base/2013/", propOrder = {
    "tradeIdentifiers"
})
public class TradeContractIdListType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(name = "tradeIdentifier", namespace = "http://service.redsparksystems.com/provider/fxaip/base/2013/", required = true)
    protected List<TradeIdentifier> tradeIdentifiers;

    /**
     * Gets the value of the tradeIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getTradeIdentifiers() {
        if (tradeIdentifiers == null) {
            tradeIdentifiers = new ArrayList<TradeIdentifier>();
        }
        return this.tradeIdentifiers;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("tradeIdentifiers", tradeIdentifiers).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tradeIdentifiers);
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
        final TradeContractIdListType o = ((TradeContractIdListType) other);
        return Objects.equal(tradeIdentifiers, o.tradeIdentifiers);
    }

    public TradeContractIdListType withTradeIdentifiers(TradeIdentifier... values) {
        if (values!= null) {
            for (TradeIdentifier value: values) {
                getTradeIdentifiers().add(value);
            }
        }
        return this;
    }

    public TradeContractIdListType withTradeIdentifiers(Collection<TradeIdentifier> values) {
        if (values!= null) {
            getTradeIdentifiers().addAll(values);
        }
        return this;
    }

}
