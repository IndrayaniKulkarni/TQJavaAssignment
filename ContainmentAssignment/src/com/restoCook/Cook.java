package com.restoCook;

public class Cook {
	
	private String name;
	private String qualification;
	private int age;
	private float experience;
	private double salary;
	static private int count;
	
	static 
	{
		count++;
	}
	Cook(){
		
	}
	
	Cook(String name, String qualification, int age, float experience, double salary) {
		this.name = name;
		this.qualification = qualification;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getQualification() {
		return qualification;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	public float getExperience() {
		return experience;
	}

	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

	public String toString() {
		return "Cook =" + name + ", " + qualification + ", " + age + ", " + experience
				+ ", " + salary + "]";
	}
	public int countCook() {
		return count;
	}


}
