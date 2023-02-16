/*
 * 5)WAP to create class Programmer with Method workingHours().
 * create class Employee which extends Programmer implement workingHours()
 * differently in child.
 */
package com.overriding;
class Programmer{
	void workingHours(){
		System.out.println("Working hours = "+12);
	}
}
class Employee extends Programmer{
	void workingHours(){
		System.out.println("Working hours = "+10);
	}
}
public class EmployeeImplement {

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.workingHours();
		Employee e = new Employee();
		e.workingHours();

	}

}
