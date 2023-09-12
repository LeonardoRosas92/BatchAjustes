
package batchPagos.arServices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRefundLogRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRefundLogRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundLogInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundLogInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType"/>
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType"/>
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Entero10dType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRefundLogRespType", propOrder = {
    "refundLogInfo",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryRefundLogRespType {

    protected List<RefundLogInfoType> refundLogInfo;
    protected int totalRowNum;
    protected int beginRowNum;
    protected int fetchRowNum;

    /**
     * Gets the value of the refundLogInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refundLogInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundLogInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundLogInfoType }
     * 
     * 
     */
    public List<RefundLogInfoType> getRefundLogInfo() {
        if (refundLogInfo == null) {
            refundLogInfo = new ArrayList<RefundLogInfoType>();
        }
        return this.refundLogInfo;
    }

    /**
     * Gets the value of the totalRowNum property.
     * 
     */
    public int getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Sets the value of the totalRowNum property.
     * 
     */
    public void setTotalRowNum(int value) {
        this.totalRowNum = value;
    }

    /**
     * Gets the value of the beginRowNum property.
     * 
     */
    public int getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Sets the value of the beginRowNum property.
     * 
     */
    public void setBeginRowNum(int value) {
        this.beginRowNum = value;
    }

    /**
     * Gets the value of the fetchRowNum property.
     * 
     */
    public int getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Sets the value of the fetchRowNum property.
     * 
     */
    public void setFetchRowNum(int value) {
        this.fetchRowNum = value;
    }

}