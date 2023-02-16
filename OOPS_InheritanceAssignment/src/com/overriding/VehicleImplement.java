/*
 * 3)WAP to create class Vehicle with methods accelerate(long mph) with long 
 * type parameter ,stop(),run() all method return string type of value. 
 * Create class car which extends Vehicle implement accelerate(long mph)
 * differently in car class.
 */
package com.overriding;
class Vehicle{
	protected long mph;
	String accelerate(long mph){
		return (mph+"mph");
	}
	String stop() {
		return "Stop the vehicle at once.";
	}
	String run() {
		return "Run the vehicle..";
	}
}
class Car extends Vehicle{
	
	String accelerate(long mph){
		return ("Car is running at "+mph+"mph");
	}
}
public class VehicleImplement {

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		System.out.println(v.accelerate(25));
		System.out.println(v.stop());
		System.out.println(v.run());
		
		Car c = new Car();
		System.out.println(c.accelerate(20));
		System.out.println(c.stop());
		System.out.println(c.run());

	}

}
