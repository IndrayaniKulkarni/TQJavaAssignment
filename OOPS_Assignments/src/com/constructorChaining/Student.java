/*
 * 1. Create a class Student with int id and String name as member variables.
2. Generate getter and setter methods for id and name. 
Observe in the generated setter method how the parameter’s value is assigned 
to the member variable using this keyword.
3. What would happen in the setter method if you remove ‘this.’ 
when assigning the parameter value? ** it may not correctly assign value to 
instance variable of the same object ....it basically won't know current obj??
_____QUESTION
4. In main create 2 objects of Student.
5. Set id of first student to 11 and 21 to the other student’s id
6. Check and observe if you can use ‘this’ in main method. ????
7. super can be used to refer immediate parent class instance variable.
8. super can be used to invoke immediate parent class method.
9. super() can be used to invoke immediate parent class constructor.
 */

//Point no. 3 and 6 needs attention
package com.constructorChaining;

public class Student {

	int id;
	String name;

	public int getId() {
		return id;//can't recall whether just id or this.id //checked correct
	}
	public void setId(int id) {
		this.id = id;//here we are not using this. it's showing no effect on assignment
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setId(11);
		s2.setId(21);
		System.out.println("ID of s1 student = "+s1.getId());
		System.out.println("ID of s1 student = "+s2.getId());

	}

}
