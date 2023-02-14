package com.restoCook;

import java.util.Scanner;

public class Registera {
	
	static Scanner sc = new Scanner(System.in);
	static void inputResto(Restaurant r) {
		System.out.println("Please enter details as -");
		System.out.println("Resto name -");
		r.setName(sc.next());
		System.out.println("Address -");
		r.setAddress(sc.next());
		System.out.println("Food register no.-");
		r.setFoodRegisterNo(sc.nextInt());
		System.out.println("Rating -");
		r.setRatings(sc.nextInt());
		System.out.println("Type -");
		r.setType(sc.next());
	}
	static void inputCook(Cook c) {
		System.out.println("Please enter details as -");
		System.out.println("Cook name -");
		c.setName(sc.next());
		System.out.println("Qualification -");
		c.setQualification(sc.next());
		System.out.println("Age -");
		c.setAge(sc.nextInt());
		System.out.println("Experience -");
		c.setExperience(sc.nextFloat());
		System.out.println("Salary -Rs.");
		c.setSalary(sc.nextDouble());
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    // lets say one resto and 
		//2 cooks
		
		Restaurant r = new Restaurant();
		inputResto(r);
		System.out.println(r.toString());
		Cook c1, c2;
		c1 = new Cook();
		c2 = new Cook();
		inputCook(c1);
		r.setCook(c1);
		System.out.println(c1.countCook());
		System.out.println(r.toString());
		inputCook(c2);
		r.setCook(c2);
		System.out.println(c2.countCook());
		System.out.println(r.toString());
		
		

	}

}
