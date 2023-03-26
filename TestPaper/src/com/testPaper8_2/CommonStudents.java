package com.testPaper8_2;

import java.util.ArrayList;

/*
 * . There are 2 different arraylist ,
 *  both contain student objects.
 *   But there are students present in both lists. Create a set which contains student objects from both lists. 
 * Ensure that no student objects are repeated.
 */
class Student {
	private int id;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class CommonStudents {
	 static boolean containsStudent(ArrayList<Student> list, Student student) {
	    for (Student s : list) {
	        if (s.getId() == student.getId() && s.getName().equals(student.getName())) {
	            return true;
	        }
	    }
	    return false;
	 }
	public static void main(String[] args) {

		ArrayList<Student> stuList1 = new ArrayList<>();
		stuList1.add(new Student(1, "Alice"));
		stuList1.add(new Student(2, "Amy"));
		stuList1.add(new Student(3, "Alvie"));
		ArrayList<Student> stuList2 = new ArrayList<>();
		stuList2.add(new Student(1, "Alice"));
		stuList2.add(new Student(2, "Bob"));
		stuList2.add(new Student(3, "Richard"));
		ArrayList<Student> combinedList = new ArrayList<>();
		for (Student student : stuList1) {
			if (!containsStudent(combinedList, student)) {
				combinedList.add(student);
			}
		}
		for (Student student : stuList2) {
			if (!containsStudent(combinedList, student)) {
				combinedList.add(student);
			}
		}

		System.out.println("Student list from both lists = " + combinedList);
	}

}