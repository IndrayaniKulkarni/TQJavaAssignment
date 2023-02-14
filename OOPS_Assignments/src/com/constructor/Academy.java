/*
 * ). Create Academy class with appropriate attributes 
 * (instance variable) 
 * and create getter & setter 
 */
package com.constructor;

import java.util.Arrays;
import java.util.Scanner;

public class Academy {

	private String dept;
	private String hod;
	private String deanAcademics;
	private int deptNo;
	private String courses[] = new String[5];
	private float duration;//in years
	
	
	Academy() {
		
	}
	
	Academy(String dept, String hod, String courses[]){
		this.dept = dept;
		this.hod = hod;
		this.courses = courses;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}


	public String getDeanAcademics() {
		return deanAcademics;
	}
	public void setDeanAcademics(String deanAcademics) {
		this.deanAcademics = deanAcademics;
	}


	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}


	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
   

	public String toString() {
		return "Academy [dept=" + dept + ", hod=" + hod + ", deanAcademics=" + deanAcademics + ", deptNo=" + deptNo
				+ ", courses=" + Arrays.toString(courses) + ", duration=" + duration + "]";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nKindly enter the details ...");
		System.out.println("Department -");
		String dept = sc.next();
		System.out.println("Head of department -");
		String hod = sc.next();
		
		System.out.println("5 courses -");
		String courses[] = new String[5];
		for(int i=0; i<5; i++) {
			courses[i] = sc.next();
		}
		
		Academy a = new Academy(dept,hod,courses);
		
		System.out.println(a.toString());
		
		

	}

}
