package com.multilevel;

import java.util.Scanner;

public class CustomerTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("CustId = ");
		int id = sc.nextInt();
		System.out.println("CustName = ");
		String name = sc.next();
		System.out.println("Subscription = ");
		float subs = sc.nextFloat();
		PremiumCustomer pc = new PremiumCustomer(id, name, subs);
		System.out.println(pc);
		sc.close();

	}

}
