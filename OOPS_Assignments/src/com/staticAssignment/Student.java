package com.staticAssignment;

public class Student {

	int id;
	String name;
	static private int count = 0;

	// instance block - for hit counter
	{
		count++;
	}

	public int getId() {
		return id;// can't recall whether just id or this.id //checked correct
	}

	public void setId(int id) {
		this.id = id;// here we are not using this. it's showing no effect on assignment
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.setId(11);
		s2.setId(21);
		System.out.println("ID of s1 student = " + s1.getId());
		System.out.println("ID of s1 student = " + s2.getId());
		
		System.out.println("\n\nNumber of Students = "+count);

	}

}
