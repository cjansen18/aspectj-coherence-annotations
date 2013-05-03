//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.trading._2013;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * A list of TradeDetails
 * 
 * <p>Java class for TradeDetailList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeDetailList_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}TradeDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDetailList_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/", propOrder = {
    "tradeDetails"
})
@XmlRootElement(name = "TradeDetailList", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/")
public class TradeDetailList implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(name = "TradeDetail", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/", required = true)
    protected List<TradeDetail> tradeDetails;

    /**
     * Gets the value of the tradeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeDetail }
     * 
     * 
     */
    public List<TradeDetail> getTradeDetails() {
        if (tradeDetails == null) {
            tradeDetails = new ArrayList<TradeDetail>();
        }
        return this.tradeDetails;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("tradeDetails", tradeDetails).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tradeDetails);
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
        final TradeDetailList o = ((TradeDetailList) other);
        return Objects.equal(tradeDetails, o.tradeDetails);
    }

    public TradeDetailList withTradeDetails(TradeDetail... values) {
        if (values!= null) {
            for (TradeDetail value: values) {
                getTradeDetails().add(value);
            }
        }
        return this;
    }

    public TradeDetailList withTradeDetails(Collection<TradeDetail> values) {
        if (values!= null) {
            getTradeDetails().addAll(values);
        }
        return this;
    }

}
