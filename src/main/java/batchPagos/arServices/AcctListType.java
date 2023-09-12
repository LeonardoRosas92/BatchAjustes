
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/>
 *         &lt;element name="balanceResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctBalanceType" maxOccurs="unbounded"/>
 *         &lt;element name="outStandingList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingList2Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberofDaysDebt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType" minOccurs="0"/>
 *         &lt;element name="accountCredit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AccountCreditType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctListType", propOrder = {
    "acctKey",
    "balanceResult",
    "outStandingList",
    "numberofDaysDebt",
    "accountCredit"
})
public class AcctListType {

    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected List<AcctBalanceType> balanceResult;
    protected List<OutStandingList2Type> outStandingList;
    protected Integer numberofDaysDebt;
    protected List<AccountCreditType> accountCredit;

    /**
     * Gets the value of the acctKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctKey() {
        return acctKey;
    }

    /**
     * Sets the value of the acctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctKey(String value) {
        this.acctKey = value;
    }

    /**
     * Gets the value of the balanceResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalanceType }
     * 
     * 
     */
    public List<AcctBalanceType> getBalanceResult() {
        if (balanceResult == null) {
            balanceResult = new ArrayList<AcctBalanceType>();
        }
        return this.balanceResult;
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
     * {@link OutStandingList2Type }
     * 
     * 
     */
    public List<OutStandingList2Type> getOutStandingList() {
        if (outStandingList == null) {
            outStandingList = new ArrayList<OutStandingList2Type>();
        }
        return this.outStandingList;
    }

    /**
     * Gets the value of the numberofDaysDebt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberofDaysDebt() {
        return numberofDaysDebt;
    }

    /**
     * Sets the value of the numberofDaysDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberofDaysDebt(Integer value) {
        this.numberofDaysDebt = value;
    }

    /**
     * Gets the value of the accountCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCreditType }
     * 
     * 
     */
    public List<AccountCreditType> getAccountCredit() {
        if (accountCredit == null) {
            accountCredit = new ArrayList<AccountCreditType>();
        }
        return this.accountCredit;
    }

}
