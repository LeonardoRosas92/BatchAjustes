
package batchPagos.arServices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountCreditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountCreditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditLimitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/>
 *         &lt;element name="creditLimitTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica30Type" minOccurs="0"/>
 *         &lt;element name="totalCreditAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="totalUsageAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="totalRemainAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/>
 *         &lt;element name="creditAmountInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditAmountInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreditType", propOrder = {
    "creditLimitType",
    "creditLimitTypeName",
    "totalCreditAmount",
    "totalUsageAmount",
    "totalRemainAmount",
    "currencyID",
    "creditAmountInfo"
})
public class AccountCreditType {

    protected String creditLimitType;
    protected String creditLimitTypeName;
    protected long totalCreditAmount;
    protected long totalUsageAmount;
    protected long totalRemainAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    protected List<CreditAmountInfoType> creditAmountInfo;

    /**
     * Gets the value of the creditLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitType() {
        return creditLimitType;
    }

    /**
     * Sets the value of the creditLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitType(String value) {
        this.creditLimitType = value;
    }

    /**
     * Gets the value of the creditLimitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitTypeName() {
        return creditLimitTypeName;
    }

    /**
     * Sets the value of the creditLimitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitTypeName(String value) {
        this.creditLimitTypeName = value;
    }

    /**
     * Gets the value of the totalCreditAmount property.
     * 
     */
    public long getTotalCreditAmount() {
        return totalCreditAmount;
    }

    /**
     * Sets the value of the totalCreditAmount property.
     * 
     */
    public void setTotalCreditAmount(long value) {
        this.totalCreditAmount = value;
    }

    /**
     * Gets the value of the totalUsageAmount property.
     * 
     */
    public long getTotalUsageAmount() {
        return totalUsageAmount;
    }

    /**
     * Sets the value of the totalUsageAmount property.
     * 
     */
    public void setTotalUsageAmount(long value) {
        this.totalUsageAmount = value;
    }

    /**
     * Gets the value of the totalRemainAmount property.
     * 
     */
    public long getTotalRemainAmount() {
        return totalRemainAmount;
    }

    /**
     * Sets the value of the totalRemainAmount property.
     * 
     */
    public void setTotalRemainAmount(long value) {
        this.totalRemainAmount = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyID(BigInteger value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the creditAmountInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditAmountInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditAmountInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditAmountInfoType }
     * 
     * 
     */
    public List<CreditAmountInfoType> getCreditAmountInfo() {
        if (creditAmountInfo == null) {
            creditAmountInfo = new ArrayList<CreditAmountInfoType>();
        }
        return this.creditAmountInfo;
    }

}
