
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryBalancePetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBalancePetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObjQDLType"/>
 *         &lt;element name="balanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/>
 *         &lt;element name="balanceBelongSubFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType" minOccurs="0"/>
 *         &lt;element name="accurateQuery" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalancePetType", propOrder = {
    "queryObj",
    "balanceType",
    "balanceBelongSubFlag",
    "accurateQuery"
})
public class QueryBalancePetType {

    @XmlElement(required = true)
    protected QueryObjQDLType queryObj;
    protected String balanceType;
    protected Integer balanceBelongSubFlag;
    protected Integer accurateQuery;

    /**
     * Gets the value of the queryObj property.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjQDLType }
     *     
     */
    public QueryObjQDLType getQueryObj() {
        return queryObj;
    }

    /**
     * Sets the value of the queryObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjQDLType }
     *     
     */
    public void setQueryObj(QueryObjQDLType value) {
        this.queryObj = value;
    }

    /**
     * Gets the value of the balanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Sets the value of the balanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Gets the value of the balanceBelongSubFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBalanceBelongSubFlag() {
        return balanceBelongSubFlag;
    }

    /**
     * Sets the value of the balanceBelongSubFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBalanceBelongSubFlag(Integer value) {
        this.balanceBelongSubFlag = value;
    }

    /**
     * Gets the value of the accurateQuery property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccurateQuery() {
        return accurateQuery;
    }

    /**
     * Sets the value of the accurateQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccurateQuery(Integer value) {
        this.accurateQuery = value;
    }

}
