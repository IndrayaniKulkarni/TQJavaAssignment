package com.carDriver;

public class Driver {
	
	private String name;
	private String licenceNo;
	private float experience;

    
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	public String getLicenceNo() {
		return licenceNo;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	public float getExperience() {
		return experience;
	}

	public String toString() {
		return "Driver =" + name + ", " + licenceNo + ", " + experience + "]";
	}
	

}
