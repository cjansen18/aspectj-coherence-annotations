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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import org.joda.time.LocalDate;


/**
 * Trade Deposit Request
 * 
 * <p>Java class for TradeDepositRequest_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeDepositRequest_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}TradeRequest_Type">
 *       &lt;sequence>
 *         &lt;element name="backOfficeFields" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}TradeBackOfficeInterfaceFields_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tradeNotes" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}TradeNotes_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastActivityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositPlacementIndicator">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type" minOccurs="0"/>
 *         &lt;element name="customerInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="marketInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="traderBook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeDepositRequest_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/", propOrder = {
    "backOfficeFields",
    "tradeNotes",
    "revisionDate",
    "lastActivityId",
    "dealDate",
    "valueDate",
    "maturityDate",
    "rateCode",
    "basis",
    "tenor",
    "depositPlacementIndicator",
    "currency",
    "currencyAmount",
    "customerInterestRate",
    "marketInterestRate",
    "traderBook",
    "updateUser",
    "updateTime"
})
@XmlRootElement
public class TradeDepositRequestType
    extends TradeRequestType
    implements Serializable
{

    private final static long serialVersionUID = 17L;
    protected List<TradeBackOfficeInterfaceFieldsType> backOfficeFields;
    protected List<TradeNotesType> tradeNotes;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate revisionDate;
    protected long lastActivityId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dealDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valueDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate maturityDate;
    protected String rateCode;
    protected String basis;
    protected String tenor;
    @XmlElement(required = true)
    protected String depositPlacementIndicator;
    protected String currency;
    protected CurrencyAmtType currencyAmount;
    protected BigDecimal customerInterestRate;
    protected BigDecimal marketInterestRate;
    protected String traderBook;
    protected String updateUser;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate updateTime;

    /**
     * Gets the value of the backOfficeFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backOfficeFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackOfficeFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeBackOfficeInterfaceFieldsType }
     * 
     * 
     */
    public List<TradeBackOfficeInterfaceFieldsType> getBackOfficeFields() {
        if (backOfficeFields == null) {
            backOfficeFields = new ArrayList<TradeBackOfficeInterfaceFieldsType>();
        }
        return this.backOfficeFields;
    }

    /**
     * Gets the value of the tradeNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeNotesType }
     * 
     * 
     */
    public List<TradeNotesType> getTradeNotes() {
        if (tradeNotes == null) {
            tradeNotes = new ArrayList<TradeNotesType>();
        }
        return this.tradeNotes;
    }

    /**
     * Gets the value of the revisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRevisionDate() {
        return revisionDate;
    }

    /**
     * Sets the value of the revisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionDate(LocalDate value) {
        this.revisionDate = value;
    }

    /**
     * Gets the value of the lastActivityId property.
     * 
     */
    public long getLastActivityId() {
        return lastActivityId;
    }

    /**
     * Sets the value of the lastActivityId property.
     * 
     */
    public void setLastActivityId(long value) {
        this.lastActivityId = value;
    }

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
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDate(LocalDate value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityDate(LocalDate value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the basis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasis() {
        return basis;
    }

    /**
     * Sets the value of the basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasis(String value) {
        this.basis = value;
    }

    /**
     * Gets the value of the tenor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenor() {
        return tenor;
    }

    /**
     * Sets the value of the tenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenor(String value) {
        this.tenor = value;
    }

    /**
     * Gets the value of the depositPlacementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositPlacementIndicator() {
        return depositPlacementIndicator;
    }

    /**
     * Sets the value of the depositPlacementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositPlacementIndicator(String value) {
        this.depositPlacementIndicator = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the customerInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerInterestRate() {
        return customerInterestRate;
    }

    /**
     * Sets the value of the customerInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerInterestRate(BigDecimal value) {
        this.customerInterestRate = value;
    }

    /**
     * Gets the value of the marketInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarketInterestRate() {
        return marketInterestRate;
    }

    /**
     * Sets the value of the marketInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarketInterestRate(BigDecimal value) {
        this.marketInterestRate = value;
    }

    /**
     * Gets the value of the traderBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderBook() {
        return traderBook;
    }

    /**
     * Sets the value of the traderBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderBook(String value) {
        this.traderBook = value;
    }

    /**
     * Gets the value of the updateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(LocalDate value) {
        this.updateTime = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("tradeId", tradeId).add("contractId", contractId).add("contractSeq", contractSeq).add("branch", branch).add("customerId", customerId).add("sourceReferenceId", sourceReferenceId).add("sourceSystem", sourceSystem).add("userId", userId).add("externalRef1", externalRef1).add("externalRef2", externalRef2).add("flipExternalResponse", flipExternalResponse).add("salesCredit", salesCredit).add("coverTradeId", coverTradeId).add("additionalInfo", additionalInfo).add("backOfficeFields", backOfficeFields).add("tradeNotes", tradeNotes).add("revisionDate", revisionDate).add("lastActivityId", lastActivityId).add("dealDate", dealDate).add("valueDate", valueDate).add("maturityDate", maturityDate).add("rateCode", rateCode).add("basis", basis).add("tenor", tenor).add("depositPlacementIndicator", depositPlacementIndicator).add("currency", currency).add("currencyAmount", currencyAmount).add("customerInterestRate", customerInterestRate).add("marketInterestRate", marketInterestRate).add("traderBook", traderBook).add("updateUser", updateUser).add("updateTime", updateTime).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tradeId, contractId, contractSeq, branch, customerId, sourceReferenceId, sourceSystem, userId, externalRef1, externalRef2, flipExternalResponse, salesCredit, coverTradeId, additionalInfo, backOfficeFields, tradeNotes, revisionDate, lastActivityId, dealDate, valueDate, maturityDate, rateCode, basis, tenor, depositPlacementIndicator, currency, currencyAmount, customerInterestRate, marketInterestRate, traderBook, updateUser, updateTime);
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
        final TradeDepositRequestType o = ((TradeDepositRequestType) other);
        return (((((((((((((((((((((((((((((((Objects.equal(tradeId, o.tradeId)&&Objects.equal(contractId, o.contractId))&&Objects.equal(contractSeq, o.contractSeq))&&Objects.equal(branch, o.branch))&&Objects.equal(customerId, o.customerId))&&Objects.equal(sourceReferenceId, o.sourceReferenceId))&&Objects.equal(sourceSystem, o.sourceSystem))&&Objects.equal(userId, o.userId))&&Objects.equal(externalRef1, o.externalRef1))&&Objects.equal(externalRef2, o.externalRef2))&&Objects.equal(flipExternalResponse, o.flipExternalResponse))&&Objects.equal(salesCredit, o.salesCredit))&&Objects.equal(coverTradeId, o.coverTradeId))&&Objects.equal(additionalInfo, o.additionalInfo))&&Objects.equal(backOfficeFields, o.backOfficeFields))&&Objects.equal(tradeNotes, o.tradeNotes))&&Objects.equal(revisionDate, o.revisionDate))&&Objects.equal(lastActivityId, o.lastActivityId))&&Objects.equal(dealDate, o.dealDate))&&Objects.equal(valueDate, o.valueDate))&&Objects.equal(maturityDate, o.maturityDate))&&Objects.equal(rateCode, o.rateCode))&&Objects.equal(basis, o.basis))&&Objects.equal(tenor, o.tenor))&&Objects.equal(depositPlacementIndicator, o.depositPlacementIndicator))&&Objects.equal(currency, o.currency))&&Objects.equal(currencyAmount, o.currencyAmount))&&Objects.equal(customerInterestRate, o.customerInterestRate))&&Objects.equal(marketInterestRate, o.marketInterestRate))&&Objects.equal(traderBook, o.traderBook))&&Objects.equal(updateUser, o.updateUser))&&Objects.equal(updateTime, o.updateTime));
    }

    public TradeDepositRequestType withBackOfficeFields(TradeBackOfficeInterfaceFieldsType... values) {
        if (values!= null) {
            for (TradeBackOfficeInterfaceFieldsType value: values) {
                getBackOfficeFields().add(value);
            }
        }
        return this;
    }

    public TradeDepositRequestType withBackOfficeFields(Collection<TradeBackOfficeInterfaceFieldsType> values) {
        if (values!= null) {
            getBackOfficeFields().addAll(values);
        }
        return this;
    }

    public TradeDepositRequestType withTradeNotes(TradeNotesType... values) {
        if (values!= null) {
            for (TradeNotesType value: values) {
                getTradeNotes().add(value);
            }
        }
        return this;
    }

    public TradeDepositRequestType withTradeNotes(Collection<TradeNotesType> values) {
        if (values!= null) {
            getTradeNotes().addAll(values);
        }
        return this;
    }

    public TradeDepositRequestType withRevisionDate(LocalDate value) {
        setRevisionDate(value);
        return this;
    }

    public TradeDepositRequestType withLastActivityId(long value) {
        setLastActivityId(value);
        return this;
    }

    public TradeDepositRequestType withDealDate(LocalDate value) {
        setDealDate(value);
        return this;
    }

    public TradeDepositRequestType withValueDate(LocalDate value) {
        setValueDate(value);
        return this;
    }

    public TradeDepositRequestType withMaturityDate(LocalDate value) {
        setMaturityDate(value);
        return this;
    }

    public TradeDepositRequestType withRateCode(String value) {
        setRateCode(value);
        return this;
    }

    public TradeDepositRequestType withBasis(String value) {
        setBasis(value);
        return this;
    }

    public TradeDepositRequestType withTenor(String value) {
        setTenor(value);
        return this;
    }

    public TradeDepositRequestType withDepositPlacementIndicator(String value) {
        setDepositPlacementIndicator(value);
        return this;
    }

    public TradeDepositRequestType withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public TradeDepositRequestType withCurrencyAmount(CurrencyAmtType value) {
        setCurrencyAmount(value);
        return this;
    }

    public TradeDepositRequestType withCustomerInterestRate(BigDecimal value) {
        setCustomerInterestRate(value);
        return this;
    }

    public TradeDepositRequestType withMarketInterestRate(BigDecimal value) {
        setMarketInterestRate(value);
        return this;
    }

    public TradeDepositRequestType withTraderBook(String value) {
        setTraderBook(value);
        return this;
    }

    public TradeDepositRequestType withUpdateUser(String value) {
        setUpdateUser(value);
        return this;
    }

    public TradeDepositRequestType withUpdateTime(LocalDate value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withTradeId(BigInteger value) {
        setTradeId(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withContractId(String value) {
        setContractId(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withContractSeq(String value) {
        setContractSeq(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withBranch(String value) {
        setBranch(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withCustomerId(EntityType value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withSourceReferenceId(String value) {
        setSourceReferenceId(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withSourceSystem(SourceSystemType value) {
        setSourceSystem(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withUserId(EntityType value) {
        setUserId(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withExternalRef1(String value) {
        setExternalRef1(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withExternalRef2(String value) {
        setExternalRef2(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withFlipExternalResponse(Boolean value) {
        setFlipExternalResponse(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withSalesCredit(Boolean value) {
        setSalesCredit(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withCoverTradeId(String value) {
        setCoverTradeId(value);
        return this;
    }

    @Override
    public TradeDepositRequestType withAdditionalInfo(AdditionalInfoType value) {
        setAdditionalInfo(value);
        return this;
    }

}