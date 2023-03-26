package com.studentClass;

public class Student {

	public int rollNo;
	int admissionNo;
	private int age;
	protected int courseId;

	public void doPublic() {
		System.out.println("doPublic method");
		
	}
	void doDefault() {
		System.out.println("doDefault methods");
	}
	protected void doProtected() {
		System.out.println("doProtected method");
	}
	private void doPrivate() {
		System.out.println("doPrivate method");
	}
}
