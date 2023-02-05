/*
 * 	1.	 WAP to print even numbers from 121 to 229 using for loop. 
 * 04th feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		int upperB, lowerB;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nRange of numbers (lower,upper) = ");
		lowerB = sc.nextInt();
		upperB = sc.nextInt();
		sc.close();
		System.out.println("\nEven number = ");
		int i;
		for (i = lowerB; i <= upperB; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
