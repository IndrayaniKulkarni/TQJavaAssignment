/*
 * 12.	WAP to print table of given no
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class Table {

	public static void table(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		int num = sc.nextInt();
		table(num);
		sc.close();

	}

}
