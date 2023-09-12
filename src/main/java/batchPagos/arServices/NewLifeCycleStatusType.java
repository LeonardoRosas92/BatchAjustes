
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewLifeCycleStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewLifeCycleStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/>
 *         &lt;element name="statusExpireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/>
 *         &lt;element name="statusIndex" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewLifeCycleStatusType", propOrder = {
    "statusName",
    "statusExpireTime",
    "statusIndex"
})
public class NewLifeCycleStatusType {

    @XmlElement(required = true)
    protected String statusName;
    @XmlElement(required = true)
    protected String statusExpireTime;
    @XmlElement(required = true)
    protected String statusIndex;

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the statusExpireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusExpireTime() {
        return statusExpireTime;
    }

    /**
     * Sets the value of the statusExpireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusExpireTime(String value) {
        this.statusExpireTime = value;
    }

    /**
     * Gets the value of the statusIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusIndex() {
        return statusIndex;
    }

    /**
     * Sets the value of the statusIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusIndex(String value) {
        this.statusIndex = value;
    }

}
