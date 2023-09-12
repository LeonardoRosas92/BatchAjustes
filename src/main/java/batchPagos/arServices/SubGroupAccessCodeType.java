
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubGroupAccessCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubGroupAccessCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="subGroupKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubGroupKeyType"/>
 *           &lt;element name="subGroupCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/>
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
@XmlType(name = "SubGroupAccessCodeType", propOrder = {
    "subGroupKey",
    "subGroupCode"
})
public class SubGroupAccessCodeType {

    protected String subGroupKey;
    protected String subGroupCode;

    /**
     * Gets the value of the subGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupKey() {
        return subGroupKey;
    }

    /**
     * Sets the value of the subGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupKey(String value) {
        this.subGroupKey = value;
    }

    /**
     * Gets the value of the subGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupCode() {
        return subGroupCode;
    }

    /**
     * Sets the value of the subGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupCode(String value) {
        this.subGroupCode = value;
    }

}
