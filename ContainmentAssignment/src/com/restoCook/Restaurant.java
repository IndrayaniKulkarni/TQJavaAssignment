package com.restoCook;

public class Restaurant {
	
	private String name;
	private String address;
	private int foodRegisterNo;
	private int ratings;
	private String type;
	private Cook cook;
	
	Restaurant(){
		
	}
	
	Restaurant(String address, int foodRegisterNo, int ratings, String type) {
		this.address = address;
		this.foodRegisterNo = foodRegisterNo;
		this.ratings = ratings;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	public void setFoodRegisterNo(int foodRegisterNo) {
		this.foodRegisterNo = foodRegisterNo;
	}
	public int getFoodRegisterNo() {
		return foodRegisterNo;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public int getRatings() {
		return ratings;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}

	public void setCook(Cook cook) {
		this.cook = cook;
	}
	public Cook getCook() {
		return cook;
	}

	public String toString() {
		return "Restaurant =" + name + ", " + address + ", " + foodRegisterNo + ", "
				+ ratings + ", " + type + ", "+cook +"]";
	}

	

}
