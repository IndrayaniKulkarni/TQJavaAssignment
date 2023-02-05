package com.assignment02_ConditionalStatements;

import java.util.Scanner;

public class Divisibility5and11 {

	public static void isDivisible(int num) {
		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("\nNumber is divisible by 5 and 11..");
		} else if (num % 5 == 0) {
			System.out.println("\nNumber is divisible by 5..");
		} else if (num % 11 == 0) {
			System.out.println("\nNumber is divisible by 11..");
		} else {
			System.out.println("\nNumber neither divisible by 5 nor 11..");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		int num = sc.nextInt();
		isDivisible(num);
		sc.close();

	}

}
