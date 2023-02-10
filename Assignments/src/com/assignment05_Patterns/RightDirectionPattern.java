/*
 * Print pattern 
1 
12 
123 
1234 
12345 
1234 
123 
12 
1

 */
package com.assignment05_Patterns;

import java.util.Scanner;

public class RightDirectionPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nN=");
		int n=sc.nextInt();
		// 5 col, 9 rows=(5*2-1)
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((j + 1));
			}
			System.out.println();
//			for(int j=4; j>0; j--)
//			{
//				System.out.print((j+1));
//			}
//			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j =0 ; j<(n-i-1); j++) {
				System.out.print((j + 1));
			}
			System.out.println();
			sc.close();
		}

	}

}
