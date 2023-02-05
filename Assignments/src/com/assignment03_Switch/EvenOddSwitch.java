/*
 * 2.Write a Java program to check whether a number is even or odd using switch case
 * 
 * Date - 03 Feb.,2023
 * v2
 */
package com.assignment03_Switch;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		int num = sc.nextInt();
		int flag = ((num % 2 == 0) ? 1 : 0);

		switch (flag) {
		case 0:
			System.out.println(" " + num + " is odd number.");
			break;
		case 1:
			System.out.println(" " + num + " is even number.");
			break;
		default:
			System.out.println("\nSorry something went wrong..");
		}
		sc.close();
	}

}