/*
 * 9. Create Course class with id and name. 
 * Course also contains SubCourse object which is a
class containing subCourseId, subCourseName. 
Create default constructor for both and see
each object and object constructor being called one by one. 
First SubCourse constructor
should be called.

 */
package com.constructor;

class SubCourse{
	
	int subCourseId;
	String subCourseName;
	
	SubCourse(){
		System.out.println("Default constructor of SUBCOURSE CLASS");
	}
}
public class Course {

	int id;
	String name;
	SubCourse obj = new SubCourse();
	Course(){
		System.out.println("Default constructor of COURSE CLASS");
	}
	
	public static void main(String[] args) {
		
		Course c = new Course();

	}

}
