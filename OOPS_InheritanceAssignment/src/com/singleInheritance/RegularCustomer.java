
package com.singleInheritance;

public class RegularCustomer extends Customer{

	private float discount;

	RegularCustomer(){
		
	}
	RegularCustomer(int custId, String custName, float discount){
		super(custId,custName);
		this.discount = discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getDiscount() {
		return discount;
	}

	public String toString() {
		return ("Regular customer = ["+this.getCustId()+", "+this.getCustName()+", "+discount+"]");
	}
	
}
