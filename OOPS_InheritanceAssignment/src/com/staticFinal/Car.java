/*
 * 1.Create a class Car with String model and int totalCarSold as 
 *    static variable in main() method.
 * 2.Change the value of variable by class name then Print it.
 * 3.Create two object of Car class and change value of static 
 * variable by 1st object and print it by accessing 2nd object.
 */
package com.staticFinal;

public class Car {
	private String model;
	static private int totalCarSold;
	void print() {
		System.out.println(totalCarSold);
	}
	public static void main(String[] args) {
		//1.
		//static int totalCarSold;
		/*
		 * We cannot declare static variables in the main() method or 
		 * any kind of method of the class. The static variables must be 
		 * declared as a class member in the class.
		 */
		
		
		Car c = new Car();
		c.model = "M2MachinesVolkswagen";
		
		//2.
		Car.totalCarSold = 200;
		System.out.println(c.model);
		System.out.println(totalCarSold);
	   
		//3. 
		Car c1 = new Car();
		Car c2 = new Car();
		//change value of static variable by 1st object
		// we can not change value of static variable with object 
		// can change only with class name
		Car.totalCarSold = 100;
		
		//4.d 
		c1.print();
		
	}

}
