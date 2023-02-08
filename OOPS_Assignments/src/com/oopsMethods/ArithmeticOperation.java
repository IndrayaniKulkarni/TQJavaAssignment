/*
 * 8)Write java Program for arithmetic operation for each operation 
 * write separate Method.
 * 
 */
package com.oopsMethods;

import java.util.Scanner;

public class ArithmeticOperation {

	float num1;
	float num2;
	double result;

	public void getNum1(float num1) {
		this.num1 = num1;
	}

	public void getNum2(float num2) {
		this.num2 = num2;
	}

	public double add() {
		return (num1 + num2);
	}

	public double subtract() {
		return (num1 - num2);
	}

	public double multiply() {
		return (num1 * num2);
	}

	public double divide() {
		return (num1 / num2);
	}

	public double modulo() {
		return (num1 % num2);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		ArithmeticOperation a = new ArithmeticOperation();

		System.out.println("\nPlease enter values with operation like a - b = ");
		a.getNum1(sc.nextFloat());
		char ch = sc.next().charAt(0);
		a.getNum2(sc.nextFloat());

		switch (ch) {
		case '+':
			System.out.println(a.add());
			break;
		case '-':
			System.out.println(a.subtract());
			break;
		case '*':
			System.out.println(a.multiply());
			break;
		case '/':
			System.out.println(a.divide());
			break;
		case '%':
			System.out.println(a.modulo());
			break;
		default:
			System.out.println("\nSorry wrong input..");
		}
		sc.close();
	}
}
