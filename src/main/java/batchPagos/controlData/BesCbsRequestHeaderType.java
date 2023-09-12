
package batchPagos.controlData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BesCbsRequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BesCbsRequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ownershipInfo" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsOwnershipInfoType" minOccurs="0"/>
 *         &lt;element name="operatorInfo" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsOperatorInfoType" minOccurs="0"/>
 *         &lt;element name="accessMode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaType" minOccurs="0"/>
 *         &lt;element name="msgLanguageCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaType" minOccurs="0"/>
 *         &lt;element name="timeFormat" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsTimeFormatType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BesCbsRequestHeaderType", propOrder = {
    "ownershipInfo",
    "operatorInfo",
    "accessMode",
    "msgLanguageCode",
    "timeFormat"
})
public class BesCbsRequestHeaderType {

    protected BesCbsOwnershipInfoType ownershipInfo;
    protected BesCbsOperatorInfoType operatorInfo;
    protected String accessMode;
    protected String msgLanguageCode;
    protected BesCbsTimeFormatType timeFormat;

    /**
     * Gets the value of the ownershipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsOwnershipInfoType }
     *     
     */
    public BesCbsOwnershipInfoType getOwnershipInfo() {
        return ownershipInfo;
    }

    /**
     * Sets the value of the ownershipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsOwnershipInfoType }
     *     
     */
    public void setOwnershipInfo(BesCbsOwnershipInfoType value) {
        this.ownershipInfo = value;
    }

    /**
     * Gets the value of the operatorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsOperatorInfoType }
     *     
     */
    public BesCbsOperatorInfoType getOperatorInfo() {
        return operatorInfo;
    }

    /**
     * Sets the value of the operatorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsOperatorInfoType }
     *     
     */
    public void setOperatorInfo(BesCbsOperatorInfoType value) {
        this.operatorInfo = value;
    }

    /**
     * Gets the value of the accessMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * Sets the value of the accessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMode(String value) {
        this.accessMode = value;
    }

    /**
     * Gets the value of the msgLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgLanguageCode() {
        return msgLanguageCode;
    }

    /**
     * Sets the value of the msgLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgLanguageCode(String value) {
        this.msgLanguageCode = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsTimeFormatType }
     *     
     */
    public BesCbsTimeFormatType getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsTimeFormatType }
     *     
     */
    public void setTimeFormat(BesCbsTimeFormatType value) {
        this.timeFormat = value;
    }

}
