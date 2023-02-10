/*
 * Create one class Employee (emp_id, name, sal) 
 * with private access specifier and create getter 
 * and setter. 
 */
package com.constructor;

import java.util.Scanner;

public class Employee {
	
	private int emp_id;
	private String name;
	private double sal;

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("Id :");
		e.setEmp_id(sc.nextInt());
		System.out.println("Name :");
		e.setName(sc.next());
		System.out.println("Salary :");
		e.setSal(sc.nextDouble());

		System.out.println("\nId = "+e.getEmp_id());
		System.out.println("Name = "+e.getName());
		System.out.println("Salary = Rs."+e.getSal());
		sc.close();
	}

}
