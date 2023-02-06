/*
 * 2. Write a Java program to input basic salary of an employee and 
 * calculate its Gross salary according to following: 
 * Basic Salary <= 10000 : HRA = 20%, DA = 80% 
 * Basic Salary <= 20000 : HRA = 25%, DA = 90% 
 * Basic Salary >20000 : HRA = 30%, DA = 95% 
 */
package com.assignment02_ConditionalStatements;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the salary = ");
		double salary = sc.nextDouble();
		double hraSal = 0, daSal = 0;

		if (salary <= 10000) {
			hraSal = (salary* 0.20);
			daSal = (salary *0.80);
		} else if (salary <= 20000) {

			hraSal = (salary * 0.25);
			daSal = (salary * 0.90);
		} else if (salary > 20000) {
			hraSal = (salary * 0.30);
			daSal = (salary * 0.95);
		}
		
		double grossSal = hraSal + daSal + salary;
		System.out.println("\n Gross Salary for given basic salary = "+((float)grossSal));
		sc.close();

	}

}
