/*
 * 1.	Create a class Car with String model and int totalCarSold as 
 *    static variable in main() method.
 */
package com.staticFinal;

public class Car {
	private String model;
	
	
	public static void main(String[] args) {
		
		static int totalCarSold;
		
		Car c = new Car();
		c.model = "M2MachinesVolkswagen";
		totalCarSold = 200;
		System.out.println(c.model);
		System.out.println(totalCarSold);
	}

}
