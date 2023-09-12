package batchPagos.webService;

import javax.xml.ws.Holder;

import batchPagos.controlData.ControlDataResponseHeaderType;
import batchPagos.controlData.DetailResponseType;
public class CbsResponse<T> {
	
	private Holder<ControlDataResponseHeaderType> responseControlData;
	private Holder<DetailResponseType> detailResponse;
	private Holder<T> responsePayload;
	
	public CbsResponse(Holder<ControlDataResponseHeaderType> responseControlData,
			Holder<DetailResponseType> detailResponse, Holder<T> responsePayload) {
		super();
		this.responseControlData = responseControlData;
		this.detailResponse = detailResponse;
		this.responsePayload = responsePayload;
	}

	public Holder<ControlDataResponseHeaderType> getResponseControlData() {
		return responseControlData;
	}

	public void setResponseControlData(Holder<ControlDataResponseHeaderType> responseControlData) {
		this.responseControlData = responseControlData;
	}

	public Holder<DetailResponseType> getDetailResponse() {
		return detailResponse;
	}

	public void setDetailResponse(Holder<DetailResponseType> detailResponse) {
		this.detailResponse = detailResponse;
	}

	public Holder<T> getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(Holder<T> responsePayload) {
		this.responsePayload = responsePayload;
	}

	@Override
	public String toString() {
		return "CrmResponse [responseControlData=" + responseControlData.value + ", detailResponse=" + detailResponse.value
				+ ", responsePayload=" + responsePayload.value + "]";
	}
}
