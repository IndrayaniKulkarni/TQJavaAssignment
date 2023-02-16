package com.singleInheritance;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
	
	Employee(){
		
	}
	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return "Employee =[" + empId + ", " + empName + ", " + salary + "]";
	}
	
	
}
