/*
 * 1. Create a class Account with member Variable: long accountNo, 
String customerName.Make them public.
2. In main, create a new object of the Account class and print 
the member variables value.
Note – Default constructor is provided by Java to facilitate the creation 
of a new object.
Here variables are assigned default values. 
3. Create default constructor assign new value to all variables. 
Write SOP I am in default constructor
4. In main, create another object of the Account class and print 
the member variables
value. 
Note – Since you have defined a (default) constructor, Java does not provide
another one.
5. Define a constructor which takes all arguments and assigns 
those values to the member
variables. SOP I am in parameterized constructor.
6. In main, to create another object of the Account class
 using the constructor with all
arguments and print the member variable values.
7. In main method, create 2 Account objects with different account
 numbers and names.
Then print the values of all the member variables of both the accounts.
8. From Account class, comment the default constructor 
with no arguments and try to
create an Account object by calling the default constructor. 
Note – If a non-default (non-
parameterized) constructor is present in the source code, 
Java will not provide a default
one. Hence you cannot do Account a = new Account();

 */
package com.constructor;

public class Account {

	public long accountNo;
	public String customerName;
	
	Account()
	{
		accountNo = 2423423;
		customerName = "Charlotte Bronte";
		System.out.println("\nI am default constructor.");
	}
	Account(int accNo, String name)
	{
		accountNo = accNo;
		customerName = name;
		System.out.println("\nI in parameterized constructor.");
	}
	
	public static void main(String[] args) {
		
		Account a = new Account();
		System.out.println("Account no ="+a.accountNo);
		System.out.println("Customer name ="+a.customerName);
		
		Account a2 = new Account(423523545,"Emily Dicknson");
		System.out.println("Account no ="+a2.accountNo);
		System.out.println("Customer name ="+a2.customerName);
		
		//7
		Account a3 = new Account(23424,"Ransom Rigs");
		System.out.println("Account no ="+a3.accountNo);
		System.out.println("Customer name ="+a3.customerName);
		
        //8 
//		Account a5 = new Account();//
	}

}
