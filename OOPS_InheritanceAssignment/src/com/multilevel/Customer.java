//1. Write 3 programs for single inheritance. 
//Assume we have food delivery app which have customer which could be regular, guest, or 
//even premium
package com.multilevel;

public class Customer {
	
	private int custId;
	private String custName;
	private int contactNo;
	private String address;
	
	Customer(){
		
	}
	Customer(int custId, String custName){
		this.custId = custId;
		this.custName = custName;
	}
	Customer(int custId, String custName, int contactNo, String address){
		this.custId = custId;
		this.custName = custName;
		this.contactNo = contactNo;
		this.address = address;
	}
	
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getCustId() {
		return custId;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustName() {
		return custName;
	}
	
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getContactNo() {
		return contactNo;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return ("Customer = ["+custId+", "+custName+", "+contactNo+", "+address+"]");
	}

}
