package com.hiearchicalInheritance;

import java.util.Scanner;

public class CustomerTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CustId = ");
		int id = sc.nextInt();
		System.out.println("CustName = ");
		String name = sc.next();
		System.out.println("Delivery charges = ");
		float charges = sc.nextFloat();
		GuestCustomer gc = new GuestCustomer(id, name, charges);
		System.out.println(gc);
		sc.close();

	}

}
