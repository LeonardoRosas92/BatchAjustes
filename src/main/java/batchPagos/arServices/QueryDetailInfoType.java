
package batchPagos.arServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDetailInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDetailInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="freeUnitInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitInfoType"/>
 *           &lt;element name="balanceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceInfoType"/>
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
@XmlType(name = "QueryDetailInfoType", propOrder = {
    "freeUnitInfo",
    "balanceInfo"
})
public class QueryDetailInfoType {

    protected FreeUnitInfoType freeUnitInfo;
    protected BalanceInfoType balanceInfo;

    /**
     * Gets the value of the freeUnitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FreeUnitInfoType }
     *     
     */
    public FreeUnitInfoType getFreeUnitInfo() {
        return freeUnitInfo;
    }

    /**
     * Sets the value of the freeUnitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeUnitInfoType }
     *     
     */
    public void setFreeUnitInfo(FreeUnitInfoType value) {
        this.freeUnitInfo = value;
    }

    /**
     * Gets the value of the balanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInfoType }
     *     
     */
    public BalanceInfoType getBalanceInfo() {
        return balanceInfo;
    }

    /**
     * Sets the value of the balanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInfoType }
     *     
     */
    public void setBalanceInfo(BalanceInfoType value) {
        this.balanceInfo = value;
    }

}
