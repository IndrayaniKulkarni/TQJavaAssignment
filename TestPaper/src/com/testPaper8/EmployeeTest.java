package com.testPaper8;

import java.util.ArrayList;
import java.util.Collections;

//Write a program to sort array of employees in 
//question 6 in descreasing order of salary.(use array list)
class SalaryComparator implements java.util.Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return (int)(e1.getSalary()- e2.getSalary());
    }
}
class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee[] employees = {
	            new Employee(101,"John", 50000),
	            new Employee(102,"Jane", 60000),
	            new Employee(103,"Bob", 45000),
	            new Employee(104,"Mike", 70000)
	        };
	        
	        
	        ArrayList<Employee> employeeList = new ArrayList<>();
	        for (Employee e : employees) {
	            employeeList.add(e);
	        }
	        
	      
	        Collections.sort(employeeList, Collections.reverseOrder(new SalaryComparator()));
	        
	        
	        for (Employee e : employeeList) {
	            System.out.println(e.getName() + " - " + e.getSalary());
	        }
	}

}
