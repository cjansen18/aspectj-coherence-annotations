//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.26 at 01:28:04 PM EDT 
//


package com.redsparksystems.service.provider.fxaip.gfx.trading._2013;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.common.base.Objects;
import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;
import com.redsparksystems.service.base._2003.CurrencyAmtType;
import com.redsparksystems.service.provider.fxaip.base._2013.BuySellIndicatorEnum;
import com.redsparksystems.service.provider.fxaip.base._2013.CurrencyTermEnum;
import com.redsparksystems.service.provider.fxaip.base._2013.TenorDateType;


/**
 * <p>Java class for SpotFwdLeg_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpotFwdLeg_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueDate" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}TenorDate_Type"/>
 *         &lt;element name="wfBuySellIndicator" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}BuySellIndicator_Enum"/>
 *         &lt;element name="currencyAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type"/>
 *         &lt;element name="ctrCurrencyAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type"/>
 *         &lt;element name="customerRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpotFwdAllInRate_Type"/>
 *         &lt;element name="marketRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpotFwdAllInRate_Type"/>
 *         &lt;element name="baseRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpotFwdAllInRate_Type"/>
 *         &lt;element name="referenceMidRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpotFwdAllInRate_Type"/>
 *         &lt;element name="spreadAmount" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpreadData_Type"/>
 *         &lt;element name="spreadRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpreadData_Type"/>
 *         &lt;element name="baseCurrencyAmount" type="{http://service.redsparksystems.com/base/2003/}CurrencyAmt_Type"/>
 *         &lt;element name="currencyTerm" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}CurrencyTerm_Enum"/>
 *         &lt;element name="baseCurrencyTerm" type="{http://service.redsparksystems.com/provider/fxaip/base/2013/}CurrencyTerm_Enum"/>
 *         &lt;element name="rateMarketConvention" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="baseRateMarketConvention" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="homeCurrencyMarketRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpotFwdAllInRate_Type"/>
 *         &lt;element name="homeCurrencyCustomerRate" type="{http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/}SpotFwdAllInRate_Type"/>
 *         &lt;element name="homeCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpotFwdLeg_Type", namespace = "http://service.redsparksystems.com/provider/fxaip/gfx/trading/2013/", propOrder = {
    "valueDate",
    "wfBuySellIndicator",
    "currencyAmount",
    "ctrCurrencyAmount",
    "customerRate",
    "marketRate",
    "baseRate",
    "referenceMidRate",
    "spreadAmount",
    "spreadRate",
    "baseCurrencyAmount",
    "currencyTerm",
    "baseCurrencyTerm",
    "rateMarketConvention",
    "baseRateMarketConvention",
    "homeCurrencyMarketRate",
    "homeCurrencyCustomerRate",
    "homeCurrencyAmount"
})
@Portable
public class SpotFwdLegType implements Serializable
{

    private final static long serialVersionUID = 17L;
    @XmlElement(required = true)
    @PortableProperty(0)
    protected TenorDateType valueDate;
    @XmlElement(required = true)
    @PortableProperty(1)
    protected BuySellIndicatorEnum wfBuySellIndicator;
    @XmlElement(required = true)
    @PortableProperty(2)
    protected CurrencyAmtType currencyAmount;
    @XmlElement(required = true)
    @PortableProperty(3)
    protected CurrencyAmtType ctrCurrencyAmount;
    @XmlElement(required = true)
    @PortableProperty(4)
    protected SpotFwdAllInRateType customerRate;
    @XmlElement(required = true)
    @PortableProperty(5)
    protected SpotFwdAllInRateType marketRate;
    @XmlElement(required = true)
    @PortableProperty(6)
    protected SpotFwdAllInRateType baseRate;
    @XmlElement(required = true)
    protected SpotFwdAllInRateType referenceMidRate;
    @XmlElement(required = true)
    @PortableProperty(7)
    protected SpreadDataType spreadAmount;
    @XmlElement(required = true)
    @PortableProperty(8)
    protected SpreadDataType spreadRate;
    @XmlElement(required = true)
    @PortableProperty(9)
    protected CurrencyAmtType baseCurrencyAmount;
    @XmlElement(required = true)
    @PortableProperty(10)
    protected CurrencyTermEnum currencyTerm;
    @XmlElement(required = true)
    protected CurrencyTermEnum baseCurrencyTerm;
    @PortableProperty(11)
    protected boolean rateMarketConvention;
    protected boolean baseRateMarketConvention;
    @XmlElement(required = true)
    protected SpotFwdAllInRateType homeCurrencyMarketRate;
    @XmlElement(required = true)
    protected SpotFwdAllInRateType homeCurrencyCustomerRate;
    @XmlElement(required = true)
    protected BigDecimal homeCurrencyAmount;

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

    /**
     * Gets the value of the wfBuySellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BuySellIndicatorEnum }
     *     
     */
    public BuySellIndicatorEnum getWfBuySellIndicator() {
        return wfBuySellIndicator;
    }

    /**
     * Sets the value of the wfBuySellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuySellIndicatorEnum }
     *     
     */
    public void setWfBuySellIndicator(BuySellIndicatorEnum value) {
        this.wfBuySellIndicator = value;
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
     * Gets the value of the ctrCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmtType }
     *     
     */
    public CurrencyAmtType getCtrCurrencyAmount() {
        return ctrCurrencyAmount;
    }

    /**
     * Sets the value of the ctrCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmtType }
     *     
     */
    public void setCtrCurrencyAmount(CurrencyAmtType value) {
        this.ctrCurrencyAmount = value;
    }

    /**
     * Gets the value of the customerRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public SpotFwdAllInRateType getCustomerRate() {
        return customerRate;
    }

    /**
     * Sets the value of the customerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public void setCustomerRate(SpotFwdAllInRateType value) {
        this.customerRate = value;
    }

    /**
     * Gets the value of the marketRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public SpotFwdAllInRateType getMarketRate() {
        return marketRate;
    }

    /**
     * Sets the value of the marketRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public void setMarketRate(SpotFwdAllInRateType value) {
        this.marketRate = value;
    }

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public SpotFwdAllInRateType getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public void setBaseRate(SpotFwdAllInRateType value) {
        this.baseRate = value;
    }

    /**
     * Gets the value of the referenceMidRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public SpotFwdAllInRateType getReferenceMidRate() {
        return referenceMidRate;
    }

    /**
     * Sets the value of the referenceMidRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public void setReferenceMidRate(SpotFwdAllInRateType value) {
        this.referenceMidRate = value;
    }

    /**
     * Gets the value of the spreadAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadDataType }
     *     
     */
    public SpreadDataType getSpreadAmount() {
        return spreadAmount;
    }

    /**
     * Sets the value of the spreadAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadDataType }
     *     
     */
    public void setSpreadAmount(SpreadDataType value) {
        this.spreadAmount = value;
    }

    /**
     * Gets the value of the spreadRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadDataType }
     *     
     */
    public SpreadDataType getSpreadRate() {
        return spreadRate;
    }

    /**
     * Sets the value of the spreadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadDataType }
     *     
     */
    public void setSpreadRate(SpreadDataType value) {
        this.spreadRate = value;
    }

    /**
     * Gets the value of the baseCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmtType }
     *     
     */
    public CurrencyAmtType getBaseCurrencyAmount() {
        return baseCurrencyAmount;
    }

    /**
     * Sets the value of the baseCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmtType }
     *     
     */
    public void setBaseCurrencyAmount(CurrencyAmtType value) {
        this.baseCurrencyAmount = value;
    }

    /**
     * Gets the value of the currencyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyTermEnum }
     *     
     */
    public CurrencyTermEnum getCurrencyTerm() {
        return currencyTerm;
    }

    /**
     * Sets the value of the currencyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyTermEnum }
     *     
     */
    public void setCurrencyTerm(CurrencyTermEnum value) {
        this.currencyTerm = value;
    }

    /**
     * Gets the value of the baseCurrencyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyTermEnum }
     *     
     */
    public CurrencyTermEnum getBaseCurrencyTerm() {
        return baseCurrencyTerm;
    }

    /**
     * Sets the value of the baseCurrencyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyTermEnum }
     *     
     */
    public void setBaseCurrencyTerm(CurrencyTermEnum value) {
        this.baseCurrencyTerm = value;
    }

    /**
     * Gets the value of the rateMarketConvention property.
     * 
     */
    public boolean isRateMarketConvention() {
        return rateMarketConvention;
    }

    /**
     * Sets the value of the rateMarketConvention property.
     * 
     */
    public void setRateMarketConvention(boolean value) {
        this.rateMarketConvention = value;
    }

    /**
     * Gets the value of the baseRateMarketConvention property.
     * 
     */
    public boolean isBaseRateMarketConvention() {
        return baseRateMarketConvention;
    }

    /**
     * Sets the value of the baseRateMarketConvention property.
     * 
     */
    public void setBaseRateMarketConvention(boolean value) {
        this.baseRateMarketConvention = value;
    }

    /**
     * Gets the value of the homeCurrencyMarketRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public SpotFwdAllInRateType getHomeCurrencyMarketRate() {
        return homeCurrencyMarketRate;
    }

    /**
     * Sets the value of the homeCurrencyMarketRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public void setHomeCurrencyMarketRate(SpotFwdAllInRateType value) {
        this.homeCurrencyMarketRate = value;
    }

    /**
     * Gets the value of the homeCurrencyCustomerRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public SpotFwdAllInRateType getHomeCurrencyCustomerRate() {
        return homeCurrencyCustomerRate;
    }

    /**
     * Sets the value of the homeCurrencyCustomerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotFwdAllInRateType }
     *     
     */
    public void setHomeCurrencyCustomerRate(SpotFwdAllInRateType value) {
        this.homeCurrencyCustomerRate = value;
    }

    /**
     * Gets the value of the homeCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeCurrencyAmount() {
        return homeCurrencyAmount;
    }

    /**
     * Sets the value of the homeCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeCurrencyAmount(BigDecimal value) {
        this.homeCurrencyAmount = value;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("valueDate", valueDate).add("wfBuySellIndicator", wfBuySellIndicator).add("currencyAmount", currencyAmount).add("ctrCurrencyAmount", ctrCurrencyAmount).add("customerRate", customerRate).add("marketRate", marketRate).add("baseRate", baseRate).add("referenceMidRate", referenceMidRate).add("spreadAmount", spreadAmount).add("spreadRate", spreadRate).add("baseCurrencyAmount", baseCurrencyAmount).add("currencyTerm", currencyTerm).add("baseCurrencyTerm", baseCurrencyTerm).add("rateMarketConvention", rateMarketConvention).add("baseRateMarketConvention", baseRateMarketConvention).add("homeCurrencyMarketRate", homeCurrencyMarketRate).add("homeCurrencyCustomerRate", homeCurrencyCustomerRate).add("homeCurrencyAmount", homeCurrencyAmount).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valueDate, wfBuySellIndicator, currencyAmount, ctrCurrencyAmount, customerRate, marketRate, baseRate, referenceMidRate, spreadAmount, spreadRate, baseCurrencyAmount, currencyTerm, baseCurrencyTerm, rateMarketConvention, baseRateMarketConvention, homeCurrencyMarketRate, homeCurrencyCustomerRate, homeCurrencyAmount);
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
        final SpotFwdLegType o = ((SpotFwdLegType) other);
        return (((((((((((((((((Objects.equal(valueDate, o.valueDate)&&Objects.equal(wfBuySellIndicator, o.wfBuySellIndicator))&&Objects.equal(currencyAmount, o.currencyAmount))&&Objects.equal(ctrCurrencyAmount, o.ctrCurrencyAmount))&&Objects.equal(customerRate, o.customerRate))&&Objects.equal(marketRate, o.marketRate))&&Objects.equal(baseRate, o.baseRate))&&Objects.equal(referenceMidRate, o.referenceMidRate))&&Objects.equal(spreadAmount, o.spreadAmount))&&Objects.equal(spreadRate, o.spreadRate))&&Objects.equal(baseCurrencyAmount, o.baseCurrencyAmount))&&Objects.equal(currencyTerm, o.currencyTerm))&&Objects.equal(baseCurrencyTerm, o.baseCurrencyTerm))&&Objects.equal(rateMarketConvention, o.rateMarketConvention))&&Objects.equal(baseRateMarketConvention, o.baseRateMarketConvention))&&Objects.equal(homeCurrencyMarketRate, o.homeCurrencyMarketRate))&&Objects.equal(homeCurrencyCustomerRate, o.homeCurrencyCustomerRate))&&Objects.equal(homeCurrencyAmount, o.homeCurrencyAmount));
    }

    public SpotFwdLegType withValueDate(TenorDateType value) {
        setValueDate(value);
        return this;
    }

    public SpotFwdLegType withWfBuySellIndicator(BuySellIndicatorEnum value) {
        setWfBuySellIndicator(value);
        return this;
    }

    public SpotFwdLegType withCurrencyAmount(CurrencyAmtType value) {
        setCurrencyAmount(value);
        return this;
    }

    public SpotFwdLegType withCtrCurrencyAmount(CurrencyAmtType value) {
        setCtrCurrencyAmount(value);
        return this;
    }

    public SpotFwdLegType withCustomerRate(SpotFwdAllInRateType value) {
        setCustomerRate(value);
        return this;
    }

    public SpotFwdLegType withMarketRate(SpotFwdAllInRateType value) {
        setMarketRate(value);
        return this;
    }

    public SpotFwdLegType withBaseRate(SpotFwdAllInRateType value) {
        setBaseRate(value);
        return this;
    }

    public SpotFwdLegType withReferenceMidRate(SpotFwdAllInRateType value) {
        setReferenceMidRate(value);
        return this;
    }

    public SpotFwdLegType withSpreadAmount(SpreadDataType value) {
        setSpreadAmount(value);
        return this;
    }

    public SpotFwdLegType withSpreadRate(SpreadDataType value) {
        setSpreadRate(value);
        return this;
    }

    public SpotFwdLegType withBaseCurrencyAmount(CurrencyAmtType value) {
        setBaseCurrencyAmount(value);
        return this;
    }

    public SpotFwdLegType withCurrencyTerm(CurrencyTermEnum value) {
        setCurrencyTerm(value);
        return this;
    }

    public SpotFwdLegType withBaseCurrencyTerm(CurrencyTermEnum value) {
        setBaseCurrencyTerm(value);
        return this;
    }

    public SpotFwdLegType withRateMarketConvention(boolean value) {
        setRateMarketConvention(value);
        return this;
    }

    public SpotFwdLegType withBaseRateMarketConvention(boolean value) {
        setBaseRateMarketConvention(value);
        return this;
    }

    public SpotFwdLegType withHomeCurrencyMarketRate(SpotFwdAllInRateType value) {
        setHomeCurrencyMarketRate(value);
        return this;
    }

    public SpotFwdLegType withHomeCurrencyCustomerRate(SpotFwdAllInRateType value) {
        setHomeCurrencyCustomerRate(value);
        return this;
    }

    public SpotFwdLegType withHomeCurrencyAmount(BigDecimal value) {
        setHomeCurrencyAmount(value);
        return this;
    }

}
