package com.outputErrorResolveQs;

/*
 * 8.	WAP to print pattern [1M] 
 * 
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
public class TrianglePattern {

	public static void main(String[] args) {
		
		int n = 5;
		int count = 1;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((count++)+ " ");
			}
			System.out.println();
		}
	}

}
