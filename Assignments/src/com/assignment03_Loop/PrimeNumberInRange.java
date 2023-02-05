/*
 * 11.	Find all prime number between 400 to 300;
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static int isPrime(int u)
	{
		boolean flag=true;
		for(int i=2; i<=u; i++)
	    {
	     	if(u%i==0)
	     	{
	     		flag = false;
	     		break;
	     	}
	    }
		if(flag)
		{
			return u;
		}
		else 
		{
			return -1;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nLower and upper bound = ");
		int lowerB = sc.nextInt();
		int upperB = sc.nextInt();

		for(int i=lowerB; i<=upperB; i++)
	    {
			int temp =isPrime(i);
	     	if(temp!=-1)
	     	{
	     		System.out.print(temp+"\t");
	     	}
	    }
		sc.close();

	}

}
