package org.tnsif.hierarchicalinheritance;

public class Android {

	//private data members
	private String brandName;
	private String slotType;
	
	//getters and setters
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return slotType;
	}
	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}
	
	
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", slotType=" + slotType + "]";
	}
	
	//default
	public Android() {
		System.out.println("Android-Details");
	}
	
	//parameterized
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		this.slotType = slotType;
	}
	
	
}
