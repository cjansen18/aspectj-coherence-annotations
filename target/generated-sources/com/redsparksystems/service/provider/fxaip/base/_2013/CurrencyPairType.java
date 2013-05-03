//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.base._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * Represents a currency pair and whether or not it is in market convention
 * 
 * <p>Java class for CurrencyPair_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyPair_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeratorCurrency" type="{http://service.redsparksystems.com/base/2003/}CurrencyCode_Type"/>
 *         &lt;element name="denominatorCurrency" type="{http://service.redsparksystems.com/base/2003/}CurrencyCode_Type"/>
 *         &lt;element name="marketConvention" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyPair_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/base/2013/", propOrder = {
    "numeratorCurrency",
    "denominatorCurrency",
    "marketConvention"
})
public class CurrencyPairType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected String numeratorCurrency;
    @XmlElement(required = true)
    protected String denominatorCurrency;
    protected boolean marketConvention;

    /**
     * Gets the value of the numeratorCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeratorCurrency() {
        return numeratorCurrency;
    }

    /**
     * Sets the value of the numeratorCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeratorCurrency(String value) {
        this.numeratorCurrency = value;
    }

    /**
     * Gets the value of the denominatorCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominatorCurrency() {
        return denominatorCurrency;
    }

    /**
     * Sets the value of the denominatorCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominatorCurrency(String value) {
        this.denominatorCurrency = value;
    }

    /**
     * Gets the value of the marketConvention property.
     * 
     */
    public boolean isMarketConvention() {
        return marketConvention;
    }

    /**
     * Sets the value of the marketConvention property.
     * 
     */
    public void setMarketConvention(boolean value) {
        this.marketConvention = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("numeratorCurrency", numeratorCurrency).add("denominatorCurrency", denominatorCurrency).add("marketConvention", marketConvention).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeratorCurrency, denominatorCurrency, marketConvention);
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
        final CurrencyPairType o = ((CurrencyPairType) other);
        return ((Objects.equal(numeratorCurrency, o.numeratorCurrency)&&Objects.equal(denominatorCurrency, o.denominatorCurrency))&&Objects.equal(marketConvention, o.marketConvention));
    }

    public CurrencyPairType withNumeratorCurrency(String value) {
        setNumeratorCurrency(value);
        return this;
    }

    public CurrencyPairType withDenominatorCurrency(String value) {
        setDenominatorCurrency(value);
        return this;
    }

    public CurrencyPairType withMarketConvention(boolean value) {
        setMarketConvention(value);
        return this;
    }

}