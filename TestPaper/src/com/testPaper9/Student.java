package com.testPaper9;

public class Student {

	private int sId;
	private String sName;
	private float marks;
	private Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int sId, String sName, float marks, Course course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.marks = marks;
		this.course = course;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", marks=" + marks + ", course=" + course + "]";
	}
	
	
}
