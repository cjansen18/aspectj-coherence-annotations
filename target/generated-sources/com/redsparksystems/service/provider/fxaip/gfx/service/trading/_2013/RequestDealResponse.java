//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.service.trading._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;
import com.redsparksystems.service.entity.message._2007.WFFaultList;
import com.redsparksystems.service.provider.fxaip.gfx.trading._2013.TradeDetailList;


/**
 * Response for RequestDeal request
 * 
 * <p>Java class for RequestDealResponse_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestDealResponse_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://service.redsparksystems.com/entity/message/2007/}WFFaultList" minOccurs="0"/>
 *         &lt;element ref="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}TradeDetailList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDealResponse_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/service/trading/2013/", propOrder = {
    "wfFaultList",
    "tradeDetailList"
})
@XmlRootElement(name = "requestDealResponse", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/service/core/2013/")
public class RequestDealResponse implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(name = "WFFaultList", namespace = "http://service.redsparksystems.com/entity/message/2007/")
    protected WFFaultList wfFaultList;
    @XmlElement(name = "TradeDetailList", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/")
    protected TradeDetailList tradeDetailList;

    /**
     * Gets the value of the wfFaultList property.
     * 
     * @return
     *     possible object is
     *     {@link WFFaultList }
     *     
     */
    public WFFaultList getWFFaultList() {
        return wfFaultList;
    }

    /**
     * Sets the value of the wfFaultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WFFaultList }
     *     
     */
    public void setWFFaultList(WFFaultList value) {
        this.wfFaultList = value;
    }

    /**
     * Gets the value of the tradeDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDetailList }
     *     
     */
    public TradeDetailList getTradeDetailList() {
        return tradeDetailList;
    }

    /**
     * Sets the value of the tradeDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDetailList }
     *     
     */
    public void setTradeDetailList(TradeDetailList value) {
        this.tradeDetailList = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("wfFaultList", wfFaultList).add("tradeDetailList", tradeDetailList).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wfFaultList, tradeDetailList);
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
        final RequestDealResponse o = ((RequestDealResponse) other);
        return (Objects.equal(wfFaultList, o.wfFaultList)&&Objects.equal(tradeDetailList, o.tradeDetailList));
    }

    public RequestDealResponse withWFFaultList(WFFaultList value) {
        setWFFaultList(value);
        return this;
    }

    public RequestDealResponse withTradeDetailList(TradeDetailList value) {
        setTradeDetailList(value);
        return this;
    }

}