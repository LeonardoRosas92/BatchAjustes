
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleChgInfo3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleChgInfo3Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldLifeCycleStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OldLifeCycleStatusType" maxOccurs="unbounded"/>
 *         &lt;element name="newLifeCycleStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NewLifeCycleStatusType" maxOccurs="unbounded"/>
 *         &lt;element name="currentStatusIndex" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *         &lt;element name="chgValidity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleChgInfo3Type", propOrder = {
    "oldLifeCycleStatus",
    "newLifeCycleStatus",
    "currentStatusIndex",
    "chgValidity"
})
public class LifeCycleChgInfo3Type {

    @XmlElement(required = true)
    protected List<OldLifeCycleStatusType> oldLifeCycleStatus;
    @XmlElement(required = true)
    protected List<NewLifeCycleStatusType> newLifeCycleStatus;
    @XmlElement(required = true)
    protected String currentStatusIndex;
    protected int chgValidity;

    /**
     * Gets the value of the oldLifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldLifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OldLifeCycleStatusType }
     * 
     * 
     */
    public List<OldLifeCycleStatusType> getOldLifeCycleStatus() {
        if (oldLifeCycleStatus == null) {
            oldLifeCycleStatus = new ArrayList<OldLifeCycleStatusType>();
        }
        return this.oldLifeCycleStatus;
    }

    /**
     * Gets the value of the newLifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newLifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewLifeCycleStatusType }
     * 
     * 
     */
    public List<NewLifeCycleStatusType> getNewLifeCycleStatus() {
        if (newLifeCycleStatus == null) {
            newLifeCycleStatus = new ArrayList<NewLifeCycleStatusType>();
        }
        return this.newLifeCycleStatus;
    }

    /**
     * Gets the value of the currentStatusIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatusIndex() {
        return currentStatusIndex;
    }

    /**
     * Sets the value of the currentStatusIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatusIndex(String value) {
        this.currentStatusIndex = value;
    }

    /**
     * Gets the value of the chgValidity property.
     * 
     */
    public int getChgValidity() {
        return chgValidity;
    }

    /**
     * Sets the value of the chgValidity property.
     * 
     */
    public void setChgValidity(int value) {
        this.chgValidity = value;
    }

}
