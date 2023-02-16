package com.hiearchicalInheritance;

public class GuestCustomer extends Customer{
	
	private float deliveryCharges;

	GuestCustomer(int custId, String custName, float deliveryCharges){
		super(custId,custName);
		this.deliveryCharges = deliveryCharges;
	}
    
	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}


	public String toString() {
		return "GuestCustomer ["+this.getCustId()+", "+this.getCustName()+", " + deliveryCharges + "]";
	}
	
	

}
