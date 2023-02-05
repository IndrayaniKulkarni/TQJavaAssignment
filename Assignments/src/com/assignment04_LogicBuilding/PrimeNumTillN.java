/*
 *  Write prime numbers till given number..
 */
package com.assignment04_LogicBuilding;

import java.util.Scanner;

public class PrimeNumTillN {

	public static int isPrime(int num) {
		boolean flag = true;
		if (num == 1 || num == 0) {
			// not prime
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		if (flag) {
			return num;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNumber = ");
		num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= num; i++) {
			int pr = isPrime(i);
			if (pr == 0 || pr == 1) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
