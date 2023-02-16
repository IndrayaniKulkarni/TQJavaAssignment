/*
 * 5)WAP to create class Bike with fields color ,speed and  method bikeInfo() which is 
 * show color and speed of bike .create class Pulsar which extends 
 * Bike implement bikeInfo() 
 * differently child 
 */
package com.overriding;
class Bike{
	protected String colour;
	protected float speed;
	Bike(String colour, float speed){
		this.colour = colour;
		this.speed = speed;
	}
	void bikeInfo() {
		System.out.println("Colour = "+colour);
		System.out.println("Speed = "+speed+"km/hr");
	}
}
class Pulsar extends Bike{
	Pulsar(String colour, float speed){
		super(colour,speed);
	}
	void bikeInfo() {
		System.out.println("Colour = "+colour);
		System.out.println("Speed = "+speed+"km/hr");
	}
}
public class BikeImplementation {

	public static void main(String[] args) {
		
		Bike b = new Bike("Gray",15);
		b.bikeInfo();
		
		Pulsar p = new Pulsar("White",20);
		p.bikeInfo();

	}

}
