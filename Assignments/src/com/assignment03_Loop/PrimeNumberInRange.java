/*
 * 11.	Find all prime number between 400 to 300;
 * 5th Feb.,2023
 * 06th feb
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class PrimeNumberInRange {

//	public static int isPrime(int u)
//	{
//		boolean flag=true;
//		for(int i=2; i<=u; i++)
//	    {
//	     	if(u%i==0)
//	     	{
//	     		flag = false;
//	     		break;
//	     	}
//	    }
//		if(flag)
//		{
//			return u;
//		}
//		else 
//		{
//			return -1;
//		}
//	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nLower and upper bound = ");
		int lowerB = sc.nextInt();
		int upperB = sc.nextInt();
//		int lowerB = 1, upperB=20;
		boolean flag = true;
		for (int i = lowerB; i <= upperB; i++) {
			//I think I must remove 0 and 1 cond
			if(i==0 || i==1) // eliminating base condition (got wrong)
			{
				continue;
			}
			flag = true; //resign was req. (got wrong)
			for (int j = 2; j <= i/2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
              // non divisible by other no.s except 1 and itself will remain true
			if (flag) {
				System.out.print(i + " ");
			}
		}

		sc.close();

	}

}
