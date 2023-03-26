package com.testPaper8;
/*
 * Q9. .There is Student class { int id , string name ,Boolean isSpecial , Course c } . 
 * Course { String cname , int fees } 
 * Assume that there is array of 10 student objects. 
 * Write a program to set isspecial to be true 
 * if course fee of that student is more than 50000.
 */
class Course{
	private String cname ; 
	private int fees;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String cname, int fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + "]";
	}
	
}
class Student{
	private int id ;
	private String name ;
	private Boolean isSpecial;
	private Course c;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Boolean isSpecial, Course c) {
		super();
		this.id = id;
		this.name = name;
		this.isSpecial = isSpecial;
		this.c = c;
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
	public Boolean getIsSpecial() {
		return isSpecial;
	}
	public void setIsSpecial(Boolean isSpecial) {
		this.isSpecial = isSpecial;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", isSpecial=" + isSpecial + ", c=" + c + "]";
	}
	
	 public void setIsSpecial() {
	        if (c.getFees() > 50000) {
	            isSpecial = true;
	        }
	    }
}
public class StudentTest {

	public static void main(String[] args) {
		Course[] Course = new Course[3];
		Student[] Student = new Student[3];
		
		Course c1 = new Course("Course1", 40000);
        Course c2 = new Course("Course2", 60000);
        Course c3 = new Course("Course3", 55000);
        Student[0] = new Student(1, "Alice", false, c1);
        Student[1] = new Student(2, "Bob", false, c2);
        Student[2] = new Student(3, "Charlie", false, c3);
        

        for (int i = 0; i < Student.length; i++) {
            Student[i].setIsSpecial();
        }
       System.out.println("ID\tNAME\tISSPECIAL");
        for (int i = 0; i < Student.length; i++) {
            System.out.println(Student[i].getId() + "\t" + Student[i].getName() + "\t" + Student[i].getIsSpecial());
        }
	}

}
