package com.testPaper9;

import java.util.ArrayList;

/*
 * Q4. Write an arraylist of student has a course.
1.	Create a hashmap keeping student as key and student list as value

 */
public class ArrayListStudent {
	
	
	public static void main(String[] args) {
		
		Course c1 = new Course(10,"Java");
		Course c2 = new Course(20,"Python");
		Course c3 = new Course(30,"MachineLearning");
		
		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student(101,"Mark",89.5f,c1));
		st.add(new Student(104,"Esha",80.5f,c1));
		st.add(new Student(102,"Bella",79.5f,c1));
		st.add(new Student(103,"Sonali",90.5f,c1));
		
		
	}

}
