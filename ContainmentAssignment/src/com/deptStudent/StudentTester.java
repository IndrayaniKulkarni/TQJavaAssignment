package com.deptStudent;

import java.util.Scanner;

public class StudentTester {

	static Scanner sc = new Scanner(System.in);
	public static void inputDept(Department d) {
		
		System.out.println("Department id=");
		d.setId(sc.nextInt());
		System.out.println("Department name=");
		d.setName(sc.next());
		
	}
public static void inputStudent(Student s) {
		
		System.out.println("Student id=");
		s.setRollNo(sc.nextInt());
		System.out.println("Student name=");
		s.setName(sc.next());
		
	}
	public static void main(String[] args) {
			
      Department d1 = new Department();
      inputDept(d1);
      Department d2 = new Department();
      inputDept(d2);
      
//      Student s = 
      
	}

}
