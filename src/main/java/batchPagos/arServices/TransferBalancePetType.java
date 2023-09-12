
package batchPagos.arServices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferBalancePetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferBalancePetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *         &lt;element name="TransferorObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransferorObjType" minOccurs="0"/>
 *         &lt;element name="TransfereeObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransfereeObjType" minOccurs="0"/>
 *         &lt;element name="TransferorAcct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransferorAcctType" minOccurs="0"/>
 *         &lt;element name="TransfereeAcct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransfereeAcctType" minOccurs="0"/>
 *         &lt;element name="srcBalanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="srcBalanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/>
 *         &lt;element name="destBalanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/>
 *         &lt;element name="transferAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="transferHandleFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="transfeeHandleFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="freeUnitTransferorInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitTransferorInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditTransferorInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditTransferorInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/>
 *         &lt;element name="transferReasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/>
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBalancePetType", propOrder = {
    "transferType",
    "transferorObj",
    "transfereeObj",
    "transferorAcct",
    "transfereeAcct",
    "srcBalanceID",
    "srcBalanceType",
    "destBalanceType",
    "transferAmount",
    "transferHandleFee",
    "transfeeHandleFee",
    "freeUnitTransferorInfo",
    "creditTransferorInfo",
    "currencyID",
    "transferReasonCode",
    "remark",
    "additionalProperty"
})
public class TransferBalancePetType {

    @XmlElement(name = "TransferType", required = true)
    protected String transferType;
    @XmlElement(name = "TransferorObj")
    protected TransferorObjType transferorObj;
    @XmlElement(name = "TransfereeObj")
    protected TransfereeObjType transfereeObj;
    @XmlElement(name = "TransferorAcct")
    protected TransferorAcctType transferorAcct;
    @XmlElement(name = "TransfereeAcct")
    protected TransfereeAcctType transfereeAcct;
    protected Long srcBalanceID;
    protected String srcBalanceType;
    protected String destBalanceType;
    protected Long transferAmount;
    protected Long transferHandleFee;
    protected Long transfeeHandleFee;
    protected List<FreeUnitTransferorInfoType> freeUnitTransferorInfo;
    protected List<CreditTransferorInfoType> creditTransferorInfo;
    protected BigInteger currencyID;
    protected String transferReasonCode;
    protected String remark;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferType(String value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the transferorObj property.
     * 
     * @return
     *     possible object is
     *     {@link TransferorObjType }
     *     
     */
    public TransferorObjType getTransferorObj() {
        return transferorObj;
    }

    /**
     * Sets the value of the transferorObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorObjType }
     *     
     */
    public void setTransferorObj(TransferorObjType value) {
        this.transferorObj = value;
    }

    /**
     * Gets the value of the transfereeObj property.
     * 
     * @return
     *     possible object is
     *     {@link TransfereeObjType }
     *     
     */
    public TransfereeObjType getTransfereeObj() {
        return transfereeObj;
    }

    /**
     * Sets the value of the transfereeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfereeObjType }
     *     
     */
    public void setTransfereeObj(TransfereeObjType value) {
        this.transfereeObj = value;
    }

    /**
     * Gets the value of the transferorAcct property.
     * 
     * @return
     *     possible object is
     *     {@link TransferorAcctType }
     *     
     */
    public TransferorAcctType getTransferorAcct() {
        return transferorAcct;
    }

    /**
     * Sets the value of the transferorAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorAcctType }
     *     
     */
    public void setTransferorAcct(TransferorAcctType value) {
        this.transferorAcct = value;
    }

    /**
     * Gets the value of the transfereeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link TransfereeAcctType }
     *     
     */
    public TransfereeAcctType getTransfereeAcct() {
        return transfereeAcct;
    }

    /**
     * Sets the value of the transfereeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfereeAcctType }
     *     
     */
    public void setTransfereeAcct(TransfereeAcctType value) {
        this.transfereeAcct = value;
    }

    /**
     * Gets the value of the srcBalanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcBalanceID() {
        return srcBalanceID;
    }

    /**
     * Sets the value of the srcBalanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcBalanceID(Long value) {
        this.srcBalanceID = value;
    }

    /**
     * Gets the value of the srcBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcBalanceType() {
        return srcBalanceType;
    }

    /**
     * Sets the value of the srcBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcBalanceType(String value) {
        this.srcBalanceType = value;
    }

    /**
     * Gets the value of the destBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestBalanceType() {
        return destBalanceType;
    }

    /**
     * Sets the value of the destBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestBalanceType(String value) {
        this.destBalanceType = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferAmount(Long value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the transferHandleFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferHandleFee() {
        return transferHandleFee;
    }

    /**
     * Sets the value of the transferHandleFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferHandleFee(Long value) {
        this.transferHandleFee = value;
    }

    /**
     * Gets the value of the transfeeHandleFee property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransfeeHandleFee() {
        return transfeeHandleFee;
    }

    /**
     * Sets the value of the transfeeHandleFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransfeeHandleFee(Long value) {
        this.transfeeHandleFee = value;
    }

    /**
     * Gets the value of the freeUnitTransferorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitTransferorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitTransferorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitTransferorInfoType }
     * 
     * 
     */
    public List<FreeUnitTransferorInfoType> getFreeUnitTransferorInfo() {
        if (freeUnitTransferorInfo == null) {
            freeUnitTransferorInfo = new ArrayList<FreeUnitTransferorInfoType>();
        }
        return this.freeUnitTransferorInfo;
    }

    /**
     * Gets the value of the creditTransferorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditTransferorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditTransferorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferorInfoType }
     * 
     * 
     */
    public List<CreditTransferorInfoType> getCreditTransferorInfo() {
        if (creditTransferorInfo == null) {
            creditTransferorInfo = new ArrayList<CreditTransferorInfoType>();
        }
        return this.creditTransferorInfo;
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
     * Gets the value of the transferReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferReasonCode() {
        return transferReasonCode;
    }

    /**
     * Sets the value of the transferReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferReasonCode(String value) {
        this.transferReasonCode = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyType>();
        }
        return this.additionalProperty;
    }

}
