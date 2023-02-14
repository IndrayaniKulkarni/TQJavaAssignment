/**
 * 4) Print pattern 
1 
121 
12321 
1234321 
123454321 
1234321 
12321 
121 
1

 */
package com.assignment05_Patterns;

public class NumberPattern4_121 {

	public static void main(String[] args) {
		//int num=0;
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				//num = j;
			}
			
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j);
				//System.out.print(j);
			}
			System.out.println();
		}
		//lower para
		for(int i=4; i>0; i--) {
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				//num = j;
			}
			
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j);
				//System.out.print(j);
			}
			System.out.println();
		}
	}

}
