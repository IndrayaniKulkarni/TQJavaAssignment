package com.carDriver;

public class Car {
	private String carNo;
	private String brand;
	private String colour;
	private Driver driver;
	
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarNo() {
		return carNo;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Driver getDriver() {
		return driver;
	}
	
	
	public String toString() {
		return "Car =" + carNo + ", " + brand + ", " + colour + ", " + driver + "]";
	}

	
	
}
