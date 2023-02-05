/*
 * 8.	 Write a Java program to 
 * count number of digits in any number
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static int digits(int num) {
		int remainder, count = 0;
		while (num != 0) {
			remainder = num % 10;
			num /= 10;
			count++;
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nKindly enter any number = ");
		int num = sc.nextInt();
		System.out.println("\nNumber of digits in " + num + " = " + digits(num));

		sc.close();

	}

}
