package com.testPaper9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
 * Q4. Write an arraylist of student has a course.
1.	Create a hashmap keeping student as key and student list as value (course as a key)

 */
public class StudentListForCourse {

	public static void coursewiseStudent(ArrayList<Student> st) {
		
		HashMap<Course,ArrayList<Student>> list = new HashMap<>();
		ArrayList<Student> stud;
		
		for(Student s: st) {
			Course co = s.getCourse();
			
				if(list.containsKey(co)) {
					stud = list.get(co);
				}
				else {
					stud = new ArrayList<>();
				}
				stud.add(s);
			
			list.put(co, stud);
		}
//		int i =0;
//		for(Map.Entry<Course, ArrayList<Student>> en: list.entrySet()) {
//			System.out.println(en.getKey().getcName()+" : "+en.getValue());
//		}
//		System.out.println("-------");
		for(Map.Entry<Course, ArrayList<Student>> en : list.entrySet()) {
			System.out.print(en.getKey().getcName()+" : ");
			for(int i=0; i<en.getValue().size(); i++) {
				System.out.print(en.getValue().get(i).getsName()+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stLs = new ArrayList<>();

		Course c1 = new Course(101, "ML");
		Course c2 = new Course(102, "Python");
		Course c3 = new Course(103, "DBMS");

		stLs.add(new Student(1942, "Jake", 80.0f,c3));
		stLs.add(new Student(2312, "Usha", 89.0f,c2));
		stLs.add(new Student(4332, "Sonali", 86.0f,c1));
		stLs.add(new Student(1042, "Radhika", 80.0f,c3));
		stLs.add(new Student(2212, "Clara", 89.0f,c2));
		stLs.add(new Student(4302, "Amy", 86.0f,c1));
		
//		for(Student e:stLs) {
//			System.out.println(e);
//		}
//		System.out.println("_______________________________________");
		coursewiseStudent(stLs);
	}

}
