package com.testPaper9_2;

import java.util.ArrayList;

public class EmployeeTester {

	public static void main(String[] args) {
//		. Create an arraylist of Employee and print Emp whose salary is > 10000
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(34234,"John", 12000));
		employees.add(new Employee(434,"Jane", 9000));
		employees.add(new Employee(431,"Bob", 15000));

		System.out.println("Salary greater than 10000");
		for (Employee emp : employees) {
			if (emp.getSalary() > 10000) {
				System.out.println(emp.geteName());
			}
		}
	}

}
