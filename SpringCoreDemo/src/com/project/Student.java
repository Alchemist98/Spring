package com.project;

public class Student {
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void displayInfo() {
		System.out.println("Hello "+sname);
	}
}
