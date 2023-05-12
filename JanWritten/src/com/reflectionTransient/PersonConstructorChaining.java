package com.reflectionTransient;

class Person {
	private String name;
	private int age;
	private String gender;

	public Person(String name) {
		this(name, 0);
	}

	public Person(String name, int age) {
		this(name, age, "unknown");
	}

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}

public class PersonConstructorChaining {
	public static void main(String[] args) {

		Person p = new Person("Delilah",29);
		System.out.println(p.toString());
	}
}
