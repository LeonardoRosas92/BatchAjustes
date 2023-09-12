
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryInvoicePetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryInvoicePetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctAccessCodePayType"/>
 *         &lt;choice>
 *           &lt;element name="billCycleID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *           &lt;element name="invoiceNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *           &lt;element name="timePeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TimePeriodType"/>
 *           &lt;element name="numberOfBillCycle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/>
 *           &lt;element name="outstandingFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *           &lt;element name="openAmountOfAcctFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *           &lt;element name="queryAnacrFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *         &lt;/choice>
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoicePetType", propOrder = {
    "acctAccessCode",
    "billCycleID",
    "invoiceNo",
    "timePeriod",
    "numberOfBillCycle",
    "outstandingFlag",
    "openAmountOfAcctFlag",
    "queryAnacrFlag",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryInvoicePetType {

    @XmlElement(required = true)
    protected AcctAccessCodePayType acctAccessCode;
    protected String billCycleID;
    protected String invoiceNo;
    protected TimePeriodType timePeriod;
    protected Long numberOfBillCycle;
    protected String outstandingFlag;
    protected String openAmountOfAcctFlag;
    protected String queryAnacrFlag;
    protected Long totalRowNum;
    protected Long beginRowNum;
    protected Long fetchRowNum;

    /**
     * Gets the value of the acctAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAccessCodePayType }
     *     
     */
    public AcctAccessCodePayType getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Sets the value of the acctAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAccessCodePayType }
     *     
     */
    public void setAcctAccessCode(AcctAccessCodePayType value) {
        this.acctAccessCode = value;
    }

    /**
     * Gets the value of the billCycleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleID() {
        return billCycleID;
    }

    /**
     * Sets the value of the billCycleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleID(String value) {
        this.billCycleID = value;
    }

    /**
     * Gets the value of the invoiceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the value of the invoiceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the numberOfBillCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfBillCycle() {
        return numberOfBillCycle;
    }

    /**
     * Sets the value of the numberOfBillCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfBillCycle(Long value) {
        this.numberOfBillCycle = value;
    }

    /**
     * Gets the value of the outstandingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutstandingFlag() {
        return outstandingFlag;
    }

    /**
     * Sets the value of the outstandingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutstandingFlag(String value) {
        this.outstandingFlag = value;
    }

    /**
     * Gets the value of the openAmountOfAcctFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAmountOfAcctFlag() {
        return openAmountOfAcctFlag;
    }

    /**
     * Sets the value of the openAmountOfAcctFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAmountOfAcctFlag(String value) {
        this.openAmountOfAcctFlag = value;
    }

    /**
     * Gets the value of the queryAnacrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryAnacrFlag() {
        return queryAnacrFlag;
    }

    /**
     * Sets the value of the queryAnacrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryAnacrFlag(String value) {
        this.queryAnacrFlag = value;
    }

    /**
     * Gets the value of the totalRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Sets the value of the totalRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRowNum(Long value) {
        this.totalRowNum = value;
    }

    /**
     * Gets the value of the beginRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Sets the value of the beginRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeginRowNum(Long value) {
        this.beginRowNum = value;
    }

    /**
     * Gets the value of the fetchRowNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Sets the value of the fetchRowNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFetchRowNum(Long value) {
        this.fetchRowNum = value;
    }

}
