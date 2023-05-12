package com.accessSpecifierExample;


public class Student extends Person {
    int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

//    void display() {
//        super.display();
//        System.out.println("Roll No: " + rollNo);
//    }

	@Override
	public String toString() {
		return "Student ["+super.toString()+"rollNo=" + rollNo + "]";
	}
    
}
