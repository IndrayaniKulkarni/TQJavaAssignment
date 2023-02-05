/*
 *  A Krishnamurthy number is a number whose 
 *  sum of the factorial of digits is equal to the number itself.
 *   For example, if a number is 145, then sum = 1! + 4! + 5!
 */
package com.assignment04_LogicBuilding;

import java.util.Scanner;

public class KrishnamurthyNum {

	public static int factorial(int r) {
		int fact = 1;
		if (r == 0 || r == 1) {
			fact = 1;
		}
		for (int i = 1; i <= r; i++) {
			fact = fact * i;

		}

		return fact;
	}

	public static int krishnaMNum(int num) {

		int r, result = 0;
		System.out.print(" Sum of (");
		while (num != 0) {
			r = num % 10; // last digit
			num = num / 10; // remove last digit
			result = result + factorial(r);
			System.out.print(factorial(r) + " ");

		}
		System.out.println(") = " + result);
		return result;
	}

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		num = sc.nextInt();
		sc.close();

		if (krishnaMNum(num) == num) {
			System.out.println("\nKrishnamurthy number");
		} else {
			System.out.println("\nNot Krishnamurthy number");
		}

	}

}
