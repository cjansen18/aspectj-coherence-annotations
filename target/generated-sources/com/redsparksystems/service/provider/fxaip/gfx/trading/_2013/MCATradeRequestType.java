//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.trading._2013;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.common.base.Objects;
import com.redsparksystems.adapters.LocalDateAdapter;
import com.redsparksystems.service.base._2003.CurrencyAmtType;
import com.redsparksystems.service.provider.fxaip.base._2013.EntityType;
import com.redsparksystems.service.provider.fxaip.base._2013.SourceSystemType;
import com.redsparksystems.service.provider.fxaip.base._2013.TenorDateType;
import org.joda.time.LocalDate;


/**
 * Trade Request for booking a MCA (non-FX) contract
 * 
 * <p>Java class for MCATradeRequest_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCATradeRequest_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}TradeRequest_Type">
 *       &lt;sequence>
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="currencyAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type"/>
 *         &lt;element name="coBankFees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryInstructions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mcaType" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}McaType_Enum" minOccurs="0"/>
 *         &lt;element name="specialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}TenorDate_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCATradeRequest_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/", propOrder = {
    "dealDate",
    "currencyAmount",
    "coBankFees",
    "coBankName",
    "creditAccount",
    "debitAccount",
    "deliveryInstructions",
    "mcaType",
    "specialInstructions",
    "valueDate"
})
@XmlRootElement
public class MCATradeRequestType
    extends TradeRequestType
    implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dealDate;
    @XmlElement(required = true)
    protected CurrencyAmtType currencyAmount;
    protected BigDecimal coBankFees;
    protected String coBankName;
    protected String creditAccount;
    protected String debitAccount;
    protected Integer deliveryInstructions;
    protected McaTypeEnum mcaType;
    protected String specialInstructions;
    protected TenorDateType valueDate;

    /**
     * Gets the value of the dealDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealDate(LocalDate value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the currencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmtType }
     *     
     */
    public CurrencyAmtType getCurrencyAmount() {
        return currencyAmount;
    }

    /**
     * Sets the value of the currencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmtType }
     *     
     */
    public void setCurrencyAmount(CurrencyAmtType value) {
        this.currencyAmount = value;
    }

    /**
     * Gets the value of the coBankFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoBankFees() {
        return coBankFees;
    }

    /**
     * Sets the value of the coBankFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoBankFees(BigDecimal value) {
        this.coBankFees = value;
    }

    /**
     * Gets the value of the coBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoBankName() {
        return coBankName;
    }

    /**
     * Sets the value of the coBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoBankName(String value) {
        this.coBankName = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccount(String value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccount(String value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Sets the value of the deliveryInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryInstructions(Integer value) {
        this.deliveryInstructions = value;
    }

    /**
     * Gets the value of the mcaType property.
     * 
     * @return
     *     possible object is
     *     {@link McaTypeEnum }
     *     
     */
    public McaTypeEnum getMcaType() {
        return mcaType;
    }

    /**
     * Sets the value of the mcaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link McaTypeEnum }
     *     
     */
    public void setMcaType(McaTypeEnum value) {
        this.mcaType = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link TenorDateType }
     *     
     */
    public TenorDateType getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenorDateType }
     *     
     */
    public void setValueDate(TenorDateType value) {
        this.valueDate = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("tradeId", tradeId).add("contractId", contractId).add("contractSeq", contractSeq).add("branch", branch).add("customerId", customerId).add("sourceReferenceId", sourceReferenceId).add("sourceSystem", sourceSystem).add("userId", userId).add("externalRef1", externalRef1).add("externalRef2", externalRef2).add("flipExternalResponse", flipExternalResponse).add("salesCredit", salesCredit).add("coverTradeId", coverTradeId).add("additionalInfo", additionalInfo).add("dealDate", dealDate).add("currencyAmount", currencyAmount).add("coBankFees", coBankFees).add("coBankName", coBankName).add("creditAccount", creditAccount).add("debitAccount", debitAccount).add("deliveryInstructions", deliveryInstructions).add("mcaType", mcaType).add("specialInstructions", specialInstructions).add("valueDate", valueDate).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tradeId, contractId, contractSeq, branch, customerId, sourceReferenceId, sourceSystem, userId, externalRef1, externalRef2, flipExternalResponse, salesCredit, coverTradeId, additionalInfo, dealDate, currencyAmount, coBankFees, coBankName, creditAccount, debitAccount, deliveryInstructions, mcaType, specialInstructions, valueDate);
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
        final MCATradeRequestType o = ((MCATradeRequestType) other);
        return (((((((((((((((((((((((Objects.equal(tradeId, o.tradeId)&&Objects.equal(contractId, o.contractId))&&Objects.equal(contractSeq, o.contractSeq))&&Objects.equal(branch, o.branch))&&Objects.equal(customerId, o.customerId))&&Objects.equal(sourceReferenceId, o.sourceReferenceId))&&Objects.equal(sourceSystem, o.sourceSystem))&&Objects.equal(userId, o.userId))&&Objects.equal(externalRef1, o.externalRef1))&&Objects.equal(externalRef2, o.externalRef2))&&Objects.equal(flipExternalResponse, o.flipExternalResponse))&&Objects.equal(salesCredit, o.salesCredit))&&Objects.equal(coverTradeId, o.coverTradeId))&&Objects.equal(additionalInfo, o.additionalInfo))&&Objects.equal(dealDate, o.dealDate))&&Objects.equal(currencyAmount, o.currencyAmount))&&Objects.equal(coBankFees, o.coBankFees))&&Objects.equal(coBankName, o.coBankName))&&Objects.equal(creditAccount, o.creditAccount))&&Objects.equal(debitAccount, o.debitAccount))&&Objects.equal(deliveryInstructions, o.deliveryInstructions))&&Objects.equal(mcaType, o.mcaType))&&Objects.equal(specialInstructions, o.specialInstructions))&&Objects.equal(valueDate, o.valueDate));
    }

    public MCATradeRequestType withDealDate(LocalDate value) {
        setDealDate(value);
        return this;
    }

    public MCATradeRequestType withCurrencyAmount(CurrencyAmtType value) {
        setCurrencyAmount(value);
        return this;
    }

    public MCATradeRequestType withCoBankFees(BigDecimal value) {
        setCoBankFees(value);
        return this;
    }

    public MCATradeRequestType withCoBankName(String value) {
        setCoBankName(value);
        return this;
    }

    public MCATradeRequestType withCreditAccount(String value) {
        setCreditAccount(value);
        return this;
    }

    public MCATradeRequestType withDebitAccount(String value) {
        setDebitAccount(value);
        return this;
    }

    public MCATradeRequestType withDeliveryInstructions(Integer value) {
        setDeliveryInstructions(value);
        return this;
    }

    public MCATradeRequestType withMcaType(McaTypeEnum value) {
        setMcaType(value);
        return this;
    }

    public MCATradeRequestType withSpecialInstructions(String value) {
        setSpecialInstructions(value);
        return this;
    }

    public MCATradeRequestType withValueDate(TenorDateType value) {
        setValueDate(value);
        return this;
    }

    @Override
    public MCATradeRequestType withTradeId(BigInteger value) {
        setTradeId(value);
        return this;
    }

    @Override
    public MCATradeRequestType withContractId(String value) {
        setContractId(value);
        return this;
    }

    @Override
    public MCATradeRequestType withContractSeq(String value) {
        setContractSeq(value);
        return this;
    }

    @Override
    public MCATradeRequestType withBranch(String value) {
        setBranch(value);
        return this;
    }

    @Override
    public MCATradeRequestType withCustomerId(EntityType value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public MCATradeRequestType withSourceReferenceId(String value) {
        setSourceReferenceId(value);
        return this;
    }

    @Override
    public MCATradeRequestType withSourceSystem(SourceSystemType value) {
        setSourceSystem(value);
        return this;
    }

    @Override
    public MCATradeRequestType withUserId(EntityType value) {
        setUserId(value);
        return this;
    }

    @Override
    public MCATradeRequestType withExternalRef1(String value) {
        setExternalRef1(value);
        return this;
    }

    @Override
    public MCATradeRequestType withExternalRef2(String value) {
        setExternalRef2(value);
        return this;
    }

    @Override
    public MCATradeRequestType withFlipExternalResponse(Boolean value) {
        setFlipExternalResponse(value);
        return this;
    }

    @Override
    public MCATradeRequestType withSalesCredit(Boolean value) {
        setSalesCredit(value);
        return this;
    }

    @Override
    public MCATradeRequestType withCoverTradeId(String value) {
        setCoverTradeId(value);
        return this;
    }

    @Override
    public MCATradeRequestType withAdditionalInfo(AdditionalInfoType value) {
        setAdditionalInfo(value);
        return this;
    }

}