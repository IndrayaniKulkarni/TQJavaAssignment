/*6) A bank has a principal amount and a rate of interest which is 2%.
 *  A savings account has a rate of interest 3% while a current account has 5%. 
 *  Write a method that displays the rate of interest based on whether 
 *  the account is default/ savings/ current
 * 
 */
package com.overriding;

import java.util.Scanner;

class Bank {
	protected double principalAmt;
	protected float rate = 0.02f;// 2 %
	protected double amount;

	Bank() {

	}

	Bank(double principalAmt) {
		this.principalAmt = principalAmt;
		// this.rate = rate;
		this.amount = this.principalAmt + (this.principalAmt * (this.rate));
	}

	@Override
	public String toString() {
		return "Bank [" + principalAmt + ", " + rate + ", " + amount + "]";
	}

}

class SavingAc extends Bank {
	protected double amount;

	SavingAc() {

	}

	SavingAc(double principalAmt) {
		super(principalAmt);
		this.rate = 0.03f;// 3%
		this.amount = this.principalAmt + (this.principalAmt * (this.rate));
	}

	@Override
	public String toString() {
		return "Bank [" + this.principalAmt + ", " + this.rate + ", " + this.amount + "]";
	}

}

class CurrentAc extends Bank {
	protected double amount;

	CurrentAc() {

	}

	CurrentAc(double principalAmt) {
		super(principalAmt);
		this.rate = 0.05f;// 5%
		this.amount = this.principalAmt + (this.principalAmt * (this.rate));
	}

	@Override
	public String toString() {
		return "Bank [" + this.principalAmt + ", " + this.rate + ", " + this.amount + "]";
	}

}

public class BankImplement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter principal amount =");
		double principal = sc.nextDouble();
		System.out.println("Account type =");
		String type = sc.next();
		switch (type) {
		case "default":
			Bank b = new Bank(principal);
			System.out.println(b);
			break;
		case "saving":
			SavingAc s = new SavingAc(principal);
			System.out.println(s);
			break;
		case "current":
			CurrentAc c = new CurrentAc(10000.0);
			System.out.println(c);
			break;
		}
		sc.close();

	}

}
