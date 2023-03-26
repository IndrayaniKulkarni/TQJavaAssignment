package com.studentClass;

public class StudentTest {

	public static void main(String[] args) {
		
//		a. In main method outside the class but in same package – create object of type
//		Student. 
		
		Student st = new Student();
//		i. Try to access all the variables and all the methods in it. Verify the visibility
//		against the access modifier table. 	
	
		System.out.println("Public var = "+st.rollNo);
		System.out.println("Default var = "+st.admissionNo);
//		System.out.println("Private var = "+st.age); //error can't access private variables outside class
		System.out.println("Protected var = "+st.courseId);
	
		st.doPublic();
		st.doDefault();
//		st.doPrivate(); //error can't access private methods of class outside class
		st.doProtected();
		
	}

}
