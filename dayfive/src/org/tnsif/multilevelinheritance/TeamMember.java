package org.tnsif.multilevelinheritance;

//child class1
public class TeamMember extends TeamLead {

	private int size;
	private int duration;
	
	//parameterized constructor
	public TeamMember(String deptName, String name, int empid, String leadName, int empID2, String projectName,
			int size,int duration) {
		
		super(deptName, name, empid, leadName, empID2, projectName);
		
		this.size=size;
		this.duration=duration;
	}
	
	//getters and setters
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
}
