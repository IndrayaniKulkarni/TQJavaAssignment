/*
 * 8)WAP to create class Person with method readScript().
 * create class Actor which extends Person implement readScript() differently in child.
 */
package com.overriding;
class Person{
	void readScript() {
		System.out.println("Person..");
	}
}
class Actor extends Person{
	protected String name;
	Actor(){
		
	}
	Actor(String name){
		this.name = name;
	}
	void readScript() {
		System.out.println(name+" is reading given script..");
	}
}
public class PersonImplement {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.readScript();
		Actor a = new Actor("IanMcKellen");
		a.readScript();
	}

}
