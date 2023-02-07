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

public class Account {

	int accNo;
	String accountHolderName;
	String accountType;
	double balance;
	double debit;
	double credit;
	float deposit=5000.0f;

	public void insert(int aNo, String aHolder, String acType)
	{
		accNo = aNo;
		accountHolderName =aHolder;
		accountType = acType;	
	}

	void display()
	{
		System.out.println("Account Number = "+accNo);
		System.out.println("Account Holder name = "+accountHolderName);
		System.out.println("Account Type = "+accountType);
		
	}

	void creditAcc(double cr)
	{
		credit = cr;
	}
	void deposit()
	{
		System.out.println("Deposit = Rs"+deposit);
	}

	void withdraw(double d)
	{
		debit = d;
		balance = balance - debit;
		System.out.println("Debited amount = Rs."+debit);
		System.out.println("Balance = Rs."+this.checkbalance());
	}

	double checkbalance()
	{
		return balance;
	}

	public static void main(String[] args) {

	Account a = new Account();
	
	
	a.insert(12127183, "Renny", "SA");
    a.display();
    a.deposit();
    a.creditAcc(5000000);
    a.withdraw(2500);
    System.out.println("Balance = Rs."+a.checkbalance());
	}

}
