/*
 * 9.	 Write a Java program to calculate product of digits of any number.
 *5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class ProductOfDigits {

	public static int product(int num) {
		int remainder, prod = 1;
		while (num != 0) {
			remainder = num % 10;
			num /= 10;
			prod *= remainder;
		}
		return prod;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please enter any number = ");
		int num = sc.nextInt();
		System.out.println("\nProduct of digits in the number " + num + " = " + product(num));
		sc.close();

	}

}
