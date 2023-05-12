package com.reflectionTransient;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student {

	int rollno;
	String name;
	int marks;

	public float calpercent(int marks) {
		return (marks * 100) / 20;
     }
}

//	Write a
//	code to
//	call calpercent
//	method of above

	//class using reflection

public class StudentTest {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		 // Create an instance of Student class
        Student student = new Student();
        student.marks = 18;

        // Get the class object of Student
        Class<?> studentClass = student.getClass();

        // Get the calpercent method from the class object
        Method calpercentMethod = studentClass.getDeclaredMethod("calpercent", int.class);

        // Invoke the method on the object
        float result = (float) calpercentMethod.invoke(student, student.marks);

        System.out.println("Percentage: " + result);
	}

}
