
package batchPagos.controlData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://amx.com/mexico/telcel/esb/v1_2}CodeType"/>
 *         &lt;element name="severityLevel" type="{http://amx.com/mexico/telcel/esb/v1_2}SeverityType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://amx.com/mexico/telcel/esb/v1_2}DescriptionType"/>
 *         &lt;element name="actor" type="{http://amx.com/mexico/telcel/esb/v1_2}ActorType" minOccurs="0"/>
 *         &lt;element name="businessMeaning" type="{http://amx.com/mexico/telcel/esb/v1_2}MeaningType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailResponseType", propOrder = {
    "code",
    "severityLevel",
    "description",
    "actor",
    "businessMeaning"
})
public class DetailResponseType {

    @XmlElement(required = true)
    protected String code;
    protected Integer severityLevel;
    @XmlElement(required = true)
    protected String description;
    protected String actor;
    protected String businessMeaning;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the severityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverityLevel(Integer value) {
        this.severityLevel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActor(String value) {
        this.actor = value;
    }

    /**
     * Gets the value of the businessMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessMeaning() {
        return businessMeaning;
    }

    /**
     * Sets the value of the businessMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessMeaning(String value) {
        this.businessMeaning = value;
    }

}
