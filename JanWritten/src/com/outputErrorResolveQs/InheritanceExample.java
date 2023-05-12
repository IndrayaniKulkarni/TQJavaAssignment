package com.outputErrorResolveQs;

class Parent {
	int i;
	public Parent() {
	}

	public Parent(int i) {
       this.i = i;
	}

	public String toString() {
		return ("i = "+i);
	}
}

class Child extends Parent {

	public Child() {
		super(10);
		//this(10);//Constructor call must be the first statement in a constructor
	}
	public Child(int i) {
		super(i);
	}
	public String toString() {
		return ("i = "+i);
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		Child c = new Child(100);
		System.out.println(c.toString());
	}

}
