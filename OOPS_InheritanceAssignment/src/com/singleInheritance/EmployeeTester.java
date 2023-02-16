package com.singleInheritance;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("EmpId = ");
		int id = sc.nextInt();
		System.out.println("EmpName = ");
		String name = sc.next();
		System.out.println("Qualification = ");
		String qual = sc.next();
		Programmer rc = new Programmer(id, name, qual);
		System.out.println(rc);
		sc.close();

	}

}
