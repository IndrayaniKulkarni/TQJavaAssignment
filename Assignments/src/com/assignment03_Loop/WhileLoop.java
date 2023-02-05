/*
 * 2.	 WAP to print odd numbers from 521 to 229 using while loop. 
 * decreament
 * take upper bound first, and then lower for convience 
 * check divisibility
 * 04th feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		int lowerB, upperB;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nRange (upper bound, lower bound) = ");
		upperB = sc.nextInt();
		lowerB = sc.nextInt();
		sc.close();
		// odd number
		int i = upperB;
		System.out.println("\nOdd Number =");
		while (lowerB < i) {
			if (i % 2 != 0) {
				System.out.println(i);
				i--;
			} else {
				i--;
				continue;
			}

		}
	}

}
