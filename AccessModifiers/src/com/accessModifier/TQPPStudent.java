package com.accessModifier;

import com.studentClass.Student;

public class TQPPStudent extends Student{

	public static void main(String[] args) {
		Student st = new Student();
//		b. In same package as Student, create a new class TQPPStudent and extend the
//		Student class	
	
		System.out.println("Public var = "+st.rollNo);
//		System.out.println("Default var = "+st.admissionNo);//error  can't access default method outside package even though inherited
//		System.out.println("Private var = "+st.age); //error can't access private variables outside class
//		System.out.println("Protected var = "+st.courseId);//error  can't access default var outside package even though inherited
	
		st.doPublic();
//		st.doDefault(); // error  can't access default var outside package even though inherited
//		st.doPrivate(); //error can't access private methods of class outside class
//		st.doProtected();  //error  can't access default var outside package even though inherited
	}

}
