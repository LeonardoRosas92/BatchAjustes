
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/>
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loanChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanChgInfoType" minOccurs="0"/>
 *         &lt;element name="paymentBonus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}PaymentBonusType" minOccurs="0"/>
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo4Type" minOccurs="0"/>
 *         &lt;element name="outStandingList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRespType", propOrder = {
    "paymentSerialNo",
    "balanceChgInfo",
    "loanChgInfo",
    "paymentBonus",
    "lifeCycleChgInfo",
    "outStandingList"
})
public class PaymentRespType {

    @XmlElement(required = true)
    protected String paymentSerialNo;
    protected List<BalanceChgInfoType> balanceChgInfo;
    protected LoanChgInfoType loanChgInfo;
    protected PaymentBonusType paymentBonus;
    protected LifeCycleChgInfo4Type lifeCycleChgInfo;
    protected List<OutStandingListType> outStandingList;

    /**
     * Gets the value of the paymentSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSerialNo() {
        return paymentSerialNo;
    }

    /**
     * Sets the value of the paymentSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSerialNo(String value) {
        this.paymentSerialNo = value;
    }

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
     * Gets the value of the paymentBonus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentBonusType }
     *     
     */
    public PaymentBonusType getPaymentBonus() {
        return paymentBonus;
    }

    /**
     * Sets the value of the paymentBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentBonusType }
     *     
     */
    public void setPaymentBonus(PaymentBonusType value) {
        this.paymentBonus = value;
    }

    /**
     * Gets the value of the lifeCycleChgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo4Type }
     *     
     */
    public LifeCycleChgInfo4Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Sets the value of the lifeCycleChgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo4Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo4Type value) {
        this.lifeCycleChgInfo = value;
    }

    /**
     * Gets the value of the outStandingList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outStandingList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutStandingList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutStandingListType }
     * 
     * 
     */
    public List<OutStandingListType> getOutStandingList() {
        if (outStandingList == null) {
            outStandingList = new ArrayList<OutStandingListType>();
        }
        return this.outStandingList;
    }

}
