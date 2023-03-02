package com.staticFinal;
class Base{
	
	static void print() {
		System.out.println("This is static print method of base class.");
	}
}

class Derived extends Base{
	//This instance method cannot override the static method from Base
//	 void print() {
//			System.out.println("This is static print method of derived class.");
//		}
	static void print() {
		System.out.println("This is static print method of derived class.");
	}
}
public class OverrideStatic {

	public static void main(String[] args) {
		Base b = new Base();
		b.print();
		Derived d = new Derived();
		d.print();

	}

}
