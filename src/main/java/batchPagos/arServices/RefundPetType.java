
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundPetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundPetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/>
 *         &lt;element name="refundObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundObjType"/>
 *         &lt;element name="refundInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundInfoType" maxOccurs="unbounded"/>
 *         &lt;element name="refundChannel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundChannelType" minOccurs="0"/>
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
@XmlType(name = "RefundPetType", propOrder = {
    "refundSerialNo",
    "refundObj",
    "refundInfo",
    "refundChannel",
    "additionalProperty"
})
public class RefundPetType {

    protected String refundSerialNo;
    @XmlElement(required = true)
    protected RefundObjType refundObj;
    @XmlElement(required = true)
    protected List<RefundInfoType> refundInfo;
    protected RefundChannelType refundChannel;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Gets the value of the refundSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundSerialNo() {
        return refundSerialNo;
    }

    /**
     * Sets the value of the refundSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundSerialNo(String value) {
        this.refundSerialNo = value;
    }

    /**
     * Gets the value of the refundObj property.
     * 
     * @return
     *     possible object is
     *     {@link RefundObjType }
     *     
     */
    public RefundObjType getRefundObj() {
        return refundObj;
    }

    /**
     * Sets the value of the refundObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundObjType }
     *     
     */
    public void setRefundObj(RefundObjType value) {
        this.refundObj = value;
    }

    /**
     * Gets the value of the refundInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundInfoType }
     * 
     * 
     */
    public List<RefundInfoType> getRefundInfo() {
        if (refundInfo == null) {
            refundInfo = new ArrayList<RefundInfoType>();
        }
        return this.refundInfo;
    }

    /**
     * Gets the value of the refundChannel property.
     * 
     * @return
     *     possible object is
     *     {@link RefundChannelType }
     *     
     */
    public RefundChannelType getRefundChannel() {
        return refundChannel;
    }

    /**
     * Sets the value of the refundChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundChannelType }
     *     
     */
    public void setRefundChannel(RefundChannelType value) {
        this.refundChannel = value;
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
