package com.singleInheritance;

import java.util.Scanner;

public class CustomerTester {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CustId = ");
		int id = sc.nextInt();
		System.out.println("CustName = ");
		String name = sc.next();
		System.out.println("Discount applicable = ");
		float dis = sc.nextFloat();
		RegularCustomer rc = new RegularCustomer(id,name,dis);
		System.out.println(rc);
		sc.close();

	}

}
