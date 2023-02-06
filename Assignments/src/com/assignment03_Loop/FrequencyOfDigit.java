/*
 * 10.	Write a Java program to find frequency of each digit in a given integer.
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void freqDigit(int num) {
		/*
		 * int r; int orig = num; int length = 0; 
		 * while (num != 0) 
		 * { 
		 * r = num % 10; 
		 * num /= 10; length++; 
		 * } 
		 * int digitArr[] = new int[length]; // int[] intArray = new
		 * int[20]; // combining both statements in one int i = 0; num = orig; while
		 * (num != 0) { r = num % 10; digitArr[i] = r; i++; num /= 10; } int count[] =
		 * new int[20]; System.out.println(length); //22113 //01234 for (int j = 0; j <
		 * length; j++) { count[j] = 0; for (int k = 1; k < length - 1; k++) { if
		 * (digitArr[j] == digitArr[k]) { count[digitArr[j]] += 1; } }
		 * 
		 * }
		 * 
		 * // System.out.println("\n Digits = "); for (int j = 0; j <= length; j++) {
		 * System.out.print(digitArr[j] + " "); } System.out.println("\n Count = "); for
		 * (int j = 0; j < length - 1; j++) { System.out.print(count[j] + " "); }
		 */

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		int num = sc.nextInt();
		// freqDigit(num);
//		int r;
		/*while (num != 0) {
			r = num % 10;
			num = num / 10;
			int temp = num;
			int co = 1;
			while (temp != 0) {
				int r2 = temp % 10;
				temp = temp / 10;
				if (r == r2) {
					co++;
				}
//				System.out.print(co+" ");
			}
			System.out.print(co+" ");
			System.out.println();
		}*/
		// 
		//int num =12345123;
		int n,count;
		
		for(int i=0; i<10; i++)
		{
			count=0;
			n = num;
			while(n!=0)
			{
				if(i==(n%10))
				{
					count++;
				}
				n /=10;
			}
			if(count>0)
			{
				System.out.println(i + " = "+ count);
			}
		}
		sc.close();

	}

}
