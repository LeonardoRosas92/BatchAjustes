
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="subAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubAccessCodeType"/>
 *           &lt;element name="subGroupAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubGroupAccessCodeType"/>
 *           &lt;element name="custAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustAccessCodeType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerType", propOrder = {
    "subAccessCode",
    "subGroupAccessCode",
    "custAccessCode"
})
public class OwnerType {

    protected SubAccessCodeType subAccessCode;
    protected SubGroupAccessCodeType subGroupAccessCode;
    protected CustAccessCodeType custAccessCode;

    /**
     * Gets the value of the subAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCodeType }
     *     
     */
    public SubAccessCodeType getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Sets the value of the subAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCodeType }
     *     
     */
    public void setSubAccessCode(SubAccessCodeType value) {
        this.subAccessCode = value;
    }

    /**
     * Gets the value of the subGroupAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCodeType }
     *     
     */
    public SubGroupAccessCodeType getSubGroupAccessCode() {
        return subGroupAccessCode;
    }

    /**
     * Sets the value of the subGroupAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCodeType }
     *     
     */
    public void setSubGroupAccessCode(SubGroupAccessCodeType value) {
        this.subGroupAccessCode = value;
    }

    /**
     * Gets the value of the custAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCodeType }
     *     
     */
    public CustAccessCodeType getCustAccessCode() {
        return custAccessCode;
    }

    /**
     * Sets the value of the custAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCodeType }
     *     
     */
    public void setCustAccessCode(CustAccessCodeType value) {
        this.custAccessCode = value;
    }

}
