
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutStandingList2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutStandingList2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billCycleID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica10Type"/>
 *         &lt;element name="billCycleBeginTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/>
 *         &lt;element name="billCycleEndTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/>
 *         &lt;element name="dueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/>
 *         &lt;element name="outStandingDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingDetail2Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutStandingList2Type", propOrder = {
    "billCycleID",
    "billCycleBeginTime",
    "billCycleEndTime",
    "dueDate",
    "outStandingDetail"
})
public class OutStandingList2Type {

    @XmlElement(required = true)
    protected String billCycleID;
    @XmlElement(required = true)
    protected String billCycleBeginTime;
    @XmlElement(required = true)
    protected String billCycleEndTime;
    @XmlElement(required = true)
    protected String dueDate;
    @XmlElement(required = true)
    protected List<OutStandingDetail2Type> outStandingDetail;

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
     * Gets the value of the billCycleBeginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleBeginTime() {
        return billCycleBeginTime;
    }

    /**
     * Sets the value of the billCycleBeginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleBeginTime(String value) {
        this.billCycleBeginTime = value;
    }

    /**
     * Gets the value of the billCycleEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleEndTime() {
        return billCycleEndTime;
    }

    /**
     * Sets the value of the billCycleEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleEndTime(String value) {
        this.billCycleEndTime = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the outStandingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outStandingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutStandingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutStandingDetail2Type }
     * 
     * 
     */
    public List<OutStandingDetail2Type> getOutStandingDetail() {
        if (outStandingDetail == null) {
            outStandingDetail = new ArrayList<OutStandingDetail2Type>();
        }
        return this.outStandingDetail;
    }

}
