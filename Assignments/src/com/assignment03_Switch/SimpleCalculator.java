/*
 * 4. Write a Java program to create Simple Calculator using switch case Menu Driven
 */
package com.assignment03_Switch;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		// Method 1
		/*
		 * int num1, num2; char op; Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * char menu; do {
		 * System.out.println("\nPlease enter operation line ( eg., 3-2 )"); num1 =
		 * sc.nextInt(); op = sc.next().charAt(0); num2 = sc.nextInt(); switch(op) {
		 * case '+' : System.out.println(num1 + " + " + num2 + " = "+
		 * (num1+num2));break; case '-': System.out.println(num1 + " - " + num2 + " = "+
		 * (num1-num2));break; case '*': System.out.println(num1 + " * " + num2 + " = "+
		 * (num1*num2));break; case '/': System.out.println(num1 + " / " + num2 + " = "+
		 * (num1/num2));break; case '%': System.out.println(num1 + " % " + num2 + " = "+
		 * (num1%num2));break; default: System.out.println("\n Invalid input...");break;
		 * 
		 * } System.out.println("\nDo you want to continue = "); menu =
		 * sc.next().charAt(0); }while(menu=='y'||menu=='Y'); sc.close();
		 */

		// Method 2
		int num1, num2, choice;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("\n Calculator ");
			System.out.println("\n   1. Addition");
			System.out.println("\n   2. Subtraction");
			System.out.println("\n   3. Multiplication");
			System.out.println("\n   4. Division");
			System.out.println("\n   5. Modulo");
			System.out.println("\n   6.Quit(gives reminder)");
			System.out.println("\n   Choice (number)= ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Two numbers please = ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.println("Two numbers please = ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.println("Two numbers please = ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				System.out.println("Two numbers please = ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 5:
				System.out.println("Two numbers please = ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;

			case 6:
				System.out.println("\n______________________________________");
				break;
			default:
				System.out.println("\n Invalid input...");
				break;
			}
		} while (choice != 6);

		sc.close();
	}

}