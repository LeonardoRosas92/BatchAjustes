package batchPagos.pojos;

public class Region {
	String regionID;
	Long total;
	
	public Region(String regionID, Long total) {
		super();
		this.regionID = regionID;
		this.total = total;
	}

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	
}
