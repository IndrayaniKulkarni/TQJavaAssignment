/*
 * 3. Write a Java program to check whether a number is even or odd
 */
package com.assignment02_ConditionalStatements;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter any integer.");
		num = sc.nextInt();
		sc.close();

		if (num % 2 == 0) {
			System.out.println(" " + num + " is even.");
		} else {
			System.out.println(" " + num + " is odd.");
		}

	}

}
