package com.tnsif.jdbc.mvc;

public class Student {

	private int id;
	private String sname;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getPer() {
		return price;
	}

	public void setPer(int price) {
		this.price = price;
	}

	public Student(int id, String sname, int price) {
		this.id = id;
		this.sname = sname;
		this.price = price;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + id + ", sname=" + sname + ", per=" + price + "]";
	}
}
