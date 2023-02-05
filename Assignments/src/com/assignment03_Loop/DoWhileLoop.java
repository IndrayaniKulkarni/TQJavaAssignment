/*
 * 3.	 WAP to print even numbers from 121 to 229 using do-while loop.
 * 04th feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		int lower, upper;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nRange (lower, upper) = ");
		lower = sc.nextInt();
		upper = sc.nextInt();
		sc.close();
		
		int i= lower;
		System.out.println("\nEven number = ");
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}while(i<=upper);
	}

}
