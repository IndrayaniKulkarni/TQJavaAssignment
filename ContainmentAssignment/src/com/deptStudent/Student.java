package com.deptStudent;

public class Student {
	
	private int rollNo;
	private String name;
	private Department dept;
	
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Department getDept() {
		return dept;
	}
	
	
	public String toString() {
		return "Student [" + rollNo + ", " + name + ", " + dept + "]";
	}
	
	
	

}
