/*2.	Write Employee Class with attributes like employee_id, name, and salary. 
 * Create parameterized constructor to initialize this 3 attributes, and write a method 
 * to display this information of 5 objects, display total no of employees using static 
 * method, totalEmp(), which will return total no of employees.
 * 3.	Write another same Employee class to implement auto-generation of employee_id.
 */
package com.staticFinal;

import java.util.Scanner;

class Employee{
	static private int empId=100;
	private String name;
	private double salary;
	static private int count;
	{
		count++; //hit counter 
		empId++;
	}
	Employee()
	{
		
	}
	Employee( String name, double salary) {
		//this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void totalEmp() {
		System.out.println("Total number of employees = "+count);
	}
	@Override
	public String toString() {
		return "Employee [" + empId + ", " + name + ", " + salary + "]";
	}
	
	
}
public class EmployeeTester {
static Scanner sc = new Scanner(System.in);
	static void inputData(Employee e) {
		
		System.out.println("EmpId = ");
		//e.setEmpId(sc.nextInt());
		System.out.println(e.getEmpId());
		System.out.println("Name = ");
		e.setName(sc.next());
		System.out.println("Salary = ");
		e.setSalary(sc.nextDouble());	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1 = new Employee();
       inputData(e1);
       System.out.println(e1.toString());
       Employee e2 = new Employee();
       inputData(e2);
       System.out.println(e2.toString());
       Employee e3 = new Employee();
       inputData(e3);
       System.out.println(e3.toString());
       Employee e4 = new Employee();
       inputData(e4);
       System.out.println(e4.toString());
       Employee e5 = new Employee();
       inputData(e5);
       System.out.println(e5.toString());
       e5.totalEmp();
	}

}
