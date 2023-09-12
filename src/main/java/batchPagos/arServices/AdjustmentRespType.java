
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adjustmentSerialNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/>
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/>
 *         &lt;element name="custKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustKeyType"/>
 *         &lt;element name="adjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="freeUnitAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo3Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentRespType", propOrder = {
    "adjustmentSerialNo",
    "acctKey",
    "custKey",
    "adjustmentInfo",
    "freeUnitAdjustmentInfo",
    "creditAdjustmentInfo",
    "lifeCycleChgInfo"
})
public class AdjustmentRespType {

    @XmlElement(required = true)
    protected String adjustmentSerialNo;
    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected String custKey;
    protected List<BalanceChgInfoType> adjustmentInfo;
    protected List<FreeUnitChgInfoType> freeUnitAdjustmentInfo;
    protected List<CreditChgInfoType> creditAdjustmentInfo;
    protected LifeCycleChgInfo3Type lifeCycleChgInfo;

    /**
     * Gets the value of the adjustmentSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentSerialNo() {
        return adjustmentSerialNo;
    }

    /**
     * Sets the value of the adjustmentSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentSerialNo(String value) {
        this.adjustmentSerialNo = value;
    }

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
     * Gets the value of the custKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustKey() {
        return custKey;
    }

    /**
     * Sets the value of the custKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustKey(String value) {
        this.custKey = value;
    }

    /**
     * Gets the value of the adjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfoType }
     * 
     * 
     */
    public List<BalanceChgInfoType> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<BalanceChgInfoType>();
        }
        return this.adjustmentInfo;
    }

    /**
     * Gets the value of the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitChgInfoType }
     * 
     * 
     */
    public List<FreeUnitChgInfoType> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<FreeUnitChgInfoType>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the creditAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditChgInfoType }
     * 
     * 
     */
    public List<CreditChgInfoType> getCreditAdjustmentInfo() {
        if (creditAdjustmentInfo == null) {
            creditAdjustmentInfo = new ArrayList<CreditChgInfoType>();
        }
        return this.creditAdjustmentInfo;
    }

    /**
     * Gets the value of the lifeCycleChgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo3Type }
     *     
     */
    public LifeCycleChgInfo3Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Sets the value of the lifeCycleChgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo3Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo3Type value) {
        this.lifeCycleChgInfo = value;
    }

}
