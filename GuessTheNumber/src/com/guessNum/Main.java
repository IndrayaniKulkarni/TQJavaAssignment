package com.guessNum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int trials = 0;
		int min = 1, max = 100;
		int range = max - min + 1;
		char choice='i';
		int target = 0;
		for (int i = 0; i < 10; i++) {
			target = (int) (Math.random() * range + min);
		}
		do {
			System.out.println("________________________________________________");
			System.err.println("\nGuess the (integer) number = ");
			int guess = sc.nextInt();

			System.out.println(target);
			if (target == guess) {
				System.out.println("\nBingo...You guessed right number .....");
				flag = true;
			} else if (target < guess) {
				System.out.println("\nYour guessed number is high...Try again..");
			} else if (target > guess) {
				System.out.println("\nYour guessed number is low...Try again..");
			}

			System.out.println("________________________________________________");
			if (!flag) {
				System.out.println("\n****Do you want to continue (y/Y) = ");
				choice = sc.next().charAt(0);
			}
			
			trials++;

		} while ((choice == 'y' || choice == 'Y') && (trials <= 5) && flag == false);
		System.out.println("-----------------------EXIT-------------------------");
		sc.close();
	}

}
