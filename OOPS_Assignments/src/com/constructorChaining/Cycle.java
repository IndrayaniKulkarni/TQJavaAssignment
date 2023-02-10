/*
 * Constructor chaining assignments
1.	. Create a class Cycle with member variables: intaccountNo, intnoOfWheels.
2.	Create a default constructor with a SOP in it “I am default constructor”
3.	Create another constructor which takes 2 arguments, calls the default constructor using this()
and has a SOP in it “I am another constructor”.
4.	In main method, create an object of type Cycle by using default constructor. Note the output.
5.	Create another object of type Cycle by using the parameterized constructor. Note the sequence of SOPs indicating that inner most constructor is called first.

 */
package com.constructorChaining;

public class Cycle {

	int accountNo;
	int noOfWheels;

	// default constructor
	Cycle() {
		System.out.println("I am default constructor.");
	}

	Cycle(int acc, int wheels) {
		this(); //constructor chaining
		this.accountNo = acc;
		this.noOfWheels = wheels;
		System.out.println("I am another constructor.");
	}

	public static void main(String[] args) {

		System.out.println("Constructor with no param :");
		Cycle obj = new Cycle();
		System.out.println("Constructor with param :");
		Cycle obj2 = new Cycle(10, 20);
	}

}
