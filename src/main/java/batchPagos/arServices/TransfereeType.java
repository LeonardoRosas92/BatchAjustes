
package batchPagos.arServices;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransfereeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransfereeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="handlingChargeAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/>
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/>
 *         &lt;element name="loanChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanChgInfoType" minOccurs="0"/>
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo2Type" minOccurs="0"/>
 *         &lt;element name="freeUnitChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransfereeType", propOrder = {
    "balanceChgInfo",
    "handlingChargeAmt",
    "currencyID",
    "loanChgInfo",
    "lifeCycleChgInfo",
    "freeUnitChgInfo",
    "creditChgInfo"
})
public class TransfereeType {

    protected List<BalanceChgInfoType> balanceChgInfo;
    protected Long handlingChargeAmt;
    protected BigInteger currencyID;
    protected LoanChgInfoType loanChgInfo;
    protected LifeCycleChgInfo2Type lifeCycleChgInfo;
    protected List<FreeUnitChgInfoType> freeUnitChgInfo;
    protected List<CreditChgInfoType> creditChgInfo;

    /**
     * Gets the value of the balanceChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfoType }
     * 
     * 
     */
    public List<BalanceChgInfoType> getBalanceChgInfo() {
        if (balanceChgInfo == null) {
            balanceChgInfo = new ArrayList<BalanceChgInfoType>();
        }
        return this.balanceChgInfo;
    }

    /**
     * Gets the value of the handlingChargeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandlingChargeAmt() {
        return handlingChargeAmt;
    }

    /**
     * Sets the value of the handlingChargeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandlingChargeAmt(Long value) {
        this.handlingChargeAmt = value;
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
     * Gets the value of the loanChgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoanChgInfoType }
     *     
     */
    public LoanChgInfoType getLoanChgInfo() {
        return loanChgInfo;
    }

    /**
     * Sets the value of the loanChgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanChgInfoType }
     *     
     */
    public void setLoanChgInfo(LoanChgInfoType value) {
        this.loanChgInfo = value;
    }

    /**
     * Gets the value of the lifeCycleChgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo2Type }
     *     
     */
    public LifeCycleChgInfo2Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Sets the value of the lifeCycleChgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo2Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo2Type value) {
        this.lifeCycleChgInfo = value;
    }

    /**
     * Gets the value of the freeUnitChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitChgInfoType }
     * 
     * 
     */
    public List<FreeUnitChgInfoType> getFreeUnitChgInfo() {
        if (freeUnitChgInfo == null) {
            freeUnitChgInfo = new ArrayList<FreeUnitChgInfoType>();
        }
        return this.freeUnitChgInfo;
    }

    /**
     * Gets the value of the creditChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditChgInfoType }
     * 
     * 
     */
    public List<CreditChgInfoType> getCreditChgInfo() {
        if (creditChgInfo == null) {
            creditChgInfo = new ArrayList<CreditChgInfoType>();
        }
        return this.creditChgInfo;
    }

}
