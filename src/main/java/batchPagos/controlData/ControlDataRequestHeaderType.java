
package batchPagos.controlData;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ControlDataRequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlDataRequestHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica24Type"/>
 *         &lt;element name="businessCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/>
 *         &lt;element name="messageUUID" type="{http://amx.com/mexico/telcel/esb/v1_2}MessageUUIDType"/>
 *         &lt;element name="additionalProperty" type="{http://amx.com/mexico/telcel/esb/v1_2}BesAdditionalPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://amx.com/mexico/telcel/esb/v1_2}DateTimeType"/>
 *         &lt;element name="sendBy" type="{http://amx.com/mexico/telcel/esb/v1_2}SenderType"/>
 *         &lt;element name="ipClient" type="{http://amx.com/mexico/telcel/esb/v1_2}IPv4AddressType" minOccurs="0"/>
 *         &lt;element name="ipServer" type="{http://amx.com/mexico/telcel/esb/v1_2}IPv4AddressType" minOccurs="0"/>
 *         &lt;element name="user" type="{http://amx.com/mexico/telcel/esb/v1_2}UserType" minOccurs="0"/>
 *         &lt;element name="besCbsRequestHeader" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsRequestHeaderType" minOccurs="0"/>
 *         &lt;element name="besCrmRequestHeader" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCrmRequestHeaderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlDataRequestHeaderType", propOrder = {
    "version",
    "businessCode",
    "messageUUID",
    "additionalProperty",
    "requestDate",
    "sendBy",
    "ipClient",
    "ipServer",
    "user",
    "besCbsRequestHeader",
    "besCrmRequestHeader"
})
public class ControlDataRequestHeaderType {

    @XmlElement(required = true)
    protected String version;
    protected String businessCode;
    @XmlElement(required = true)
    protected String messageUUID;
    protected List<BesAdditionalPropertyType> additionalProperty;
    @XmlElement(required = true)
    protected XMLGregorianCalendar requestDate;
    @XmlElement(required = true)
    protected String sendBy;
    protected String ipClient;
    protected String ipServer;
    protected String user;
    protected BesCbsRequestHeaderType besCbsRequestHeader;
    protected BesCrmRequestHeaderType besCrmRequestHeader;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the businessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Sets the value of the businessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    /**
     * Gets the value of the messageUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageUUID() {
        return messageUUID;
    }

    /**
     * Sets the value of the messageUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageUUID(String value) {
        this.messageUUID = value;
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
     * {@link BesAdditionalPropertyType }
     * 
     * 
     */
    public List<BesAdditionalPropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<BesAdditionalPropertyType>();
        }
        return this.additionalProperty;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the sendBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendBy() {
        return sendBy;
    }

    /**
     * Sets the value of the sendBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendBy(String value) {
        this.sendBy = value;
    }

    /**
     * Gets the value of the ipClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpClient() {
        return ipClient;
    }

    /**
     * Sets the value of the ipClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpClient(String value) {
        this.ipClient = value;
    }

    /**
     * Gets the value of the ipServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpServer() {
        return ipServer;
    }

    /**
     * Sets the value of the ipServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpServer(String value) {
        this.ipServer = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the besCbsRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsRequestHeaderType }
     *     
     */
    public BesCbsRequestHeaderType getBesCbsRequestHeader() {
        return besCbsRequestHeader;
    }

    /**
     * Sets the value of the besCbsRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsRequestHeaderType }
     *     
     */
    public void setBesCbsRequestHeader(BesCbsRequestHeaderType value) {
        this.besCbsRequestHeader = value;
    }

    /**
     * Gets the value of the besCrmRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmRequestHeaderType }
     *     
     */
    public BesCrmRequestHeaderType getBesCrmRequestHeader() {
        return besCrmRequestHeader;
    }

    /**
     * Sets the value of the besCrmRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmRequestHeaderType }
     *     
     */
    public void setBesCrmRequestHeader(BesCrmRequestHeaderType value) {
        this.besCrmRequestHeader = value;
    }

}
