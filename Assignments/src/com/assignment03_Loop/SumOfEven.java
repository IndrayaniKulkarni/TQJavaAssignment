/*
 * 6.	 Write a Java program to find sum of all even 
 * numbers between 1 to n. 
 *5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nn=");
		int n = sc.nextInt();
		System.out.println("\nSum of n even numbers = ");
		// method 1
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("\nOne way");
		System.out.println(sum);
		// method 2
		sum = 0;
		for (int i = 0; i <= n; i += 2) {

			sum += i;

		}
		System.out.println("\nAnd the other way");
		System.out.println(sum);
		// method 3
		/*
		 * Sum of Even Numbers 1 to 50 The sum of even numbers from 1 to 50 will give
		 * the summation of all the even numbers in the list from 1 to 50. By the
		 * definition of even numbers, there even numbers from 1 to 50 include 2, 4, 6,
		 * 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44,
		 * 46, 48, 50). Thus, n = 25.
		 * 
		 * Substitute the values in the formula Sn = n(n+1).
		 * 
		 * Therefore, S = 25(25+1) = 25 x 26 = 650
		 */
		sum = 0;
		int n2 = (int) (n / 2);
		sum = n2 * (n2 + 1);
		System.out.println("\nUsing formula..");
		System.out.println(n2 + " " + (n2 + 1) + " = " + sum);
		sc.close();

	}

}
