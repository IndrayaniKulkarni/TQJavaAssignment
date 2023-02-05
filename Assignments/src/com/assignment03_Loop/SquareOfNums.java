/*
 * 13.	WAP to print squares from 1 to20
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class SquareOfNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nLower bound and upper bound = ");
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		
		for(int i=lower; i<=upper; i++)
		{
			System.out.println(i + " * " + i + " = "+ (i*i));
		}
		sc.close();

	}

}
