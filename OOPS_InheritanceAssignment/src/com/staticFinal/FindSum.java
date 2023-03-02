/*
 * 1.	Write a method to accept variable no of integers. Method should find sum of all the integers and display the result.
 */
package com.staticFinal;

import java.util.Scanner;

class Sum{
	int noOfInt;
	int sum=0;
	Sum(){
		
	}
	Sum(int noOfInt){
		this.noOfInt = noOfInt;
	}
	public int sumOfN() {
		for(int i=0; i<=noOfInt; i++) {
			sum +=i;
		}
		return sum;
	}
}
public class FindSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Sum s = new Sum(n);
		System.out.println("Sum of "+n+" = "+s.sumOfN());
		sc.close();

	}

}
