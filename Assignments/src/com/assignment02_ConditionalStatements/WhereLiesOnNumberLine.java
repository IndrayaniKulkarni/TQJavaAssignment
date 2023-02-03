/*
 * 1. Write a Java program to check whether a number is negative, positive or zero 
 * 
 */
package com.assignment02_ConditionalStatements;

import java.util.Scanner;

public class WhereLiesOnNumberLine {

	public static void main(String args[]) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter any integer.");
		num = sc.nextInt();
		sc.close();

		if (num > 0) {
			System.out.println(" " + num + " is positive.");
		} else if (num < 0) {
			System.out.println(" " + num + " is negative.");
		} else {
			System.out.println(" 0 or zero is neither positive nor negative.");
		}
	}

}
