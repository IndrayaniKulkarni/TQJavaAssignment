/*
 * 9. WAP to show 3 different scenario in which null pointer exceptions generated, 
 * and handle that  exception.
 */
package com.exercise01;

class Person {
	int id;
	String name;

	public static Person details() {
		return null;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
}

public class Q9HandleNullPointerException {

	public static void main(String[] args) {
		//case 1
		/* Person p[] = new Person[4];
		try {
			p[0].id = 10;
			p[0].name = "Bertram";
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}*/
		
		//case 2
	/*	String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}*/
		
		//case 3
	/*	Person p = new Person();
		try{
			Person p2 = p.details();
			p2.toString();
		}
		catch(Exception e) {
			System.out.println(e);
		}*/
	}

}
