/*
 * 10.	Write a Java program to find frequency of each digit in a given integer.
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void freqDigit(int num)
	{
		int r;
		int orig = num;
		int length=0;
		while(num!=0)
		{
			r = num%10;
			num /=10;
			length++;
		}
		int digitArr[]=new int[length];
	//	int[] intArray = new int[20]; // combining both statements in one
		int i=0;
		num =orig;
		while(num!=0)
		{
			r = num%10;
			digitArr[i]=r;
			i++;
			num /=10;
		}
		int count[] = new int[length];
		
		for(int j=0; j<length-1; j++)
		{
			count[j]=0;
					
				if(digitArr[j]==digitArr[j+1])
				{
				   count[j]++;	
				}
			
		}
		
		//
		System.out.println("\n Digits = ");
		for(int j=0; j<=length; j++)
		{
			System.out.print(digitArr[j]+" ");
		}
		System.out.println("\n Count = ");
		for(int j=0; j<length-1; j++)
		{
			System.out.print(count[j]+" ");
		}
		
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		int num = sc.nextInt();
		freqDigit(num);
		
		sc.close();

	}

}
