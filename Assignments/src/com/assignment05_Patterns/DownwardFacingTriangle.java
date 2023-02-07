/*
 * *****
    ****
     ***
      **
       *
 */
package com.assignment05_Patterns;

import java.util.Scanner;

public class DownwardFacingTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		int n = sc.nextInt();
		
		for(int i=0;i<n+1; i++)
		{
			for(int k=0; k<i; k++)
			{
				System.out.print(" ");
			}
			for(int j =(n-i); j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		sc.close();

	}

}
