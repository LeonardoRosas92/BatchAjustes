package batchPagos.pojos;

import java.util.Date;

public class LayoutHuawei {
	String acountCode;
	String serviceNumber;
	String reasonCode;
	String adjustType;
	int opType;
	double amount;
	String amountFormat;
	String extTransID;
	String billCycleID;
	String acctBalanceID;
	String balanceType;
	String effDate;
	String expDate;
	String notifyFlag;
	String dueDate;
	String remark;
	String region;
	String invoiceNo;
	Long invoiceId;
	Date invoiceDate;
	boolean invoices;

	public LayoutHuawei() {
		super();
	}

	public LayoutHuawei(String acountCode, String serviceNumber, String reasonCode, String adjustType, int opType,
			double amount, String extTransID, String billCycleID, String acctBalanceID, String balanceType,
			String effDate, String expDate, String notifyFlag, String dueDate, String remark, String region,
			String invoiceNo, Date invoiceDate, Long invoiceId, String amountFormat, boolean invoices) {
		super();
		this.acountCode = acountCode;
		this.serviceNumber = serviceNumber;
		this.reasonCode = reasonCode;
		this.adjustType = adjustType;
		this.opType = opType;
		this.amount = amount;
		this.extTransID = extTransID;
		this.billCycleID = billCycleID;
		this.acctBalanceID = acctBalanceID;
		this.balanceType = balanceType;
		this.effDate = effDate;
		this.expDate = expDate;
		this.notifyFlag = notifyFlag;
		this.dueDate = dueDate;
		this.remark = remark;
		this.region = region;
		this.invoiceNo = invoiceNo;
		this.invoiceDate = invoiceDate;
		this.invoiceId = invoiceId;
		this.amountFormat = amountFormat;
		this.invoices = invoices;
	}



	public String getInvoiceNo() {
		return invoiceNo;
	}



	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}



	public Date getInvoiceDate() {
		return invoiceDate;
	}



	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}



	public String getAcountCode() {
		return acountCode;
	}

	public void setAcountCode(String acountCode) {
		this.acountCode = acountCode;
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getAdjustType() {
		return adjustType;
	}

	public void setAdjustType(String adjustType) {
		this.adjustType = adjustType;
	}

	public int getOpType() {
		return opType;
	}

	public void setOpType(int opType) {
		this.opType = opType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getExtTransID() {
		return extTransID;
	}

	public void setExtTransID(String extTransID) {
		this.extTransID = extTransID;
	}

	public String getBillCycleID() {
		return billCycleID;
	}

	public void setBillCycleID(String billCycleID) {
		this.billCycleID = billCycleID;
	}

	public String getAcctBalanceID() {
		return acctBalanceID;
	}

	public void setAcctBalanceID(String acctBalanceID) {
		this.acctBalanceID = acctBalanceID;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

	public String getEffDate() {
		return effDate;
	}

	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getNotifyFlag() {
		return notifyFlag;
	}

	public void setNotifyFlag(String notifyFlag) {
		this.notifyFlag = notifyFlag;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getAmountFormat() {
		return amountFormat;
	}

	public void setAmountFormat(String amountFormat) {
		this.amountFormat = amountFormat;
	}

	public boolean getInvoices() {
		return invoices;
	}

	public void setInvoices(boolean invoices) {
		this.invoices = invoices;
	}
	
	
	
}
