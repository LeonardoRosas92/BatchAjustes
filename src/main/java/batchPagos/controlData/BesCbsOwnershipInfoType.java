
package batchPagos.controlData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BesCbsOwnershipInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BesCbsOwnershipInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BEID" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsBEIDType"/>
 *         &lt;element name="BRID" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsBRIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BesCbsOwnershipInfoType", propOrder = {
    "beid",
    "brid"
})
public class BesCbsOwnershipInfoType {

    @XmlElement(name = "BEID", required = true)
    protected String beid;
    @XmlElement(name = "BRID")
    protected String brid;

    /**
     * Gets the value of the beid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEID() {
        return beid;
    }

    /**
     * Sets the value of the beid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEID(String value) {
        this.beid = value;
    }

    /**
     * Gets the value of the brid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRID() {
        return brid;
    }

    /**
     * Sets the value of the brid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRID(String value) {
        this.brid = value;
    }

}
