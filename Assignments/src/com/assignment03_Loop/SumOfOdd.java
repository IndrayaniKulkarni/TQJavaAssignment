/*
 * 7.	 Write a Java program to find sum of all odd numbers between 1 to n.
 *5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nn=");
		int n = sc.nextInt();
		System.out.println("\nSum of n odd numbers = ");
		// method 1
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("\nOne way");
		System.out.println(sum);
		// method 2
		sum = 0;
		for (int i = 1; i <= n; i += 2) {

			sum += i;

		}
		System.out.println("\nAnd the other way");
		System.out.println(sum);
		// method 3

		float n2 = n / 2;
		float sum2 = ((n2 / 2) * (1 + (n - 1)));
		System.out.println("\nUsing formula..");
		System.out.println(sum2);
		sc.close();

	}

}
