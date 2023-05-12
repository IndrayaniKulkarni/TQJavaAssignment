package com.accessSpecifierExample;


public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
    
}

