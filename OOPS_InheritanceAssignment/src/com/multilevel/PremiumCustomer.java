package com.multilevel;

public class PremiumCustomer extends RegularCustomer{
	
	private float subscription;
	

	PremiumCustomer(){
		
	}
	PremiumCustomer(int custId, String custName,float subscription){
		super(custId,custName);
		this.subscription = subscription;
	}
	public void setSubscription(float subscription) {
		this.subscription = subscription;
	}
	public float getSubscription() {
		return subscription;
	}

	public String toString() {
		return ("Premium Customer = ["+this.getCustId()+", "+this.getCustName()+", "+subscription+"]");
	}

}
