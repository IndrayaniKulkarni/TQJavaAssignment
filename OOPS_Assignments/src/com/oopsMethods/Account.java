/*
* 6) Create a class Account containing following methods :
insert() to insert account data
display() to display account information
deposit() to deposit amount
withdraw() to withdraw amount
checkbalance() to check balance
e.g.
class Account{
int acc_no;
String name;
float amount;
}
*/
package com.oopsMethods;

import java.util.Scanner;

public class Account {

	private int accNo;
	private String accountHolderName;
	private String accountType;
	private double balance=0.0f;
	private double debit;
	private double credit;
	private float deposit=5000.0f;

//	public void insert(int aNo, String aHolder, String acType)
//	{
//		accNo = aNo;
//		accountHolderName =aHolder;
//		accountType = acType;	
//	}
//
//	void display()
//	{
//		System.out.println("Account Number = "+accNo);
//		System.out.println("Account Holder name = "+accountHolderName);
//		System.out.println("Account Type = "+accountType);
//		
//	}
//
//	void creditAcc(double cr)
//	{
//		credit = cr;
//	}
//	void deposit()
//	{
//		System.out.println("Deposit = Rs"+deposit);
//	}

//	void withdraw(double d)
//	{
//		debit = d;
//		balance = balance - debit;
//		System.out.println("Debited amount = Rs."+debit);
//		System.out.println("Balance = Rs."+this.checkbalance());
//	}
//
//	double checkbalance()
//	{
//		return balance;
//	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance() {
		this.balance = this.balance + deposit + credit - debit ;
	}

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Account a = new Account();
	    System.out.println("------------------KWA Bank account------------------");
	    System.out.println("Account Number =");
	    a.setAccNo(sc.nextInt());
	    System.out.println("Account holder name = ");
	    a.setAccountHolderName(sc.next());
	    System.out.println("Deposit = Rs.");
	    a.setDeposit(sc.nextFloat());
	    System.out.println("Amount credited = Rs.");
	    a.setCredit(sc.nextDouble());
	    System.out.println("Amount debited = Rs.");
	    a.setDebit(sc.nextDouble());
	    System.out.println("\nDo want to check balance = (y/Y)");
	    char op = sc.next().charAt(0);
	    
	    if(op=='y'||op=='Y')
	    {
	    	a.setBalance();
	    	System.out.println("Balance = Rs."+a.getBalance());
	    }
	    
	    
	    sc.close();
	
	}

}
