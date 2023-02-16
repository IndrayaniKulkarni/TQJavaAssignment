package com.singleInheritance;

public class Programmer extends Employee{
	
	private String qualification;
	
	Programmer(){
		
	}
	Programmer(int empId, String empName, String qualification){
		super(empId,empName);
		this.qualification = qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getQualification() {
		return qualification;
	}
	
	public String toString() {
		return "Programmer =["+this.getEmpId()+", "+this.getEmpName()+", "+ qualification + "]";
	}

	

}
