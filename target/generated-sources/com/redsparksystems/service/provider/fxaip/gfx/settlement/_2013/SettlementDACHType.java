//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.settlement._2013;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;


/**
 * TODO
 * 
 * <p>Java class for SettlementDACH_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementDACH_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/}SettlementHeader_Type">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDACH_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/settlement/2013/", propOrder = {
    "accountNumber",
    "routingNumber"
})
public class SettlementDACHType
    extends SettlementHeaderType
    implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String routingNumber;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("reference1", reference1).add("reference2", reference2).add("reference3", reference3).add("description", description).add("detailOfCharges", detailOfCharges).add("accountNumber", accountNumber).add("routingNumber", routingNumber).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reference1, reference2, reference3, description, detailOfCharges, accountNumber, routingNumber);
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
        final SettlementDACHType o = ((SettlementDACHType) other);
        return ((((((Objects.equal(reference1, o.reference1)&&Objects.equal(reference2, o.reference2))&&Objects.equal(reference3, o.reference3))&&Objects.equal(description, o.description))&&Objects.equal(detailOfCharges, o.detailOfCharges))&&Objects.equal(accountNumber, o.accountNumber))&&Objects.equal(routingNumber, o.routingNumber));
    }

    public SettlementDACHType withAccountNumber(String value) {
        setAccountNumber(value);
        return this;
    }

    public SettlementDACHType withRoutingNumber(String value) {
        setRoutingNumber(value);
        return this;
    }

    @Override
    public SettlementDACHType withReference1(String value) {
        setReference1(value);
        return this;
    }

    @Override
    public SettlementDACHType withReference2(String value) {
        setReference2(value);
        return this;
    }

    @Override
    public SettlementDACHType withReference3(String value) {
        setReference3(value);
        return this;
    }

    @Override
    public SettlementDACHType withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SettlementDACHType withDetailOfCharges(DetailOfChargesEnum value) {
        setDetailOfCharges(value);
        return this;
    }

}