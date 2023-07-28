package org.tnsif.hierarchicalinheritance;
//child class1
public class Tiramisu extends Android{
	
	//private data members
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}

//parameterized 
	public Tiramisu(String brandName, String slotType,int version) {
		super(brandName, slotType);
		this.version=version;
		
	}
	
}
