package com.testPaper9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Q6. Create a hashmap of Dept as key and Employee list as value.
 */
public class DeptEmpHashMap {

	public static void deptwiseEmp(ArrayList<Employee> emp) {
		HashMap<Department,ArrayList<Employee>> deptEmp = new HashMap<>();
		ArrayList<Employee> names ;
		for(Employee e: emp) {
			Department d = e.getDept();
			//for(Map.Entry<Department,Employee> de : deptEmp.entrySet()) {
				if(deptEmp.containsKey(d)) {
					names = deptEmp.get(d);
					
				}
				else
				{
					names = new ArrayList<>(); 
//					names.add(e);
				}
			//}
				names.add(e);
				deptEmp.put(d, names);
		}
		for(Map.Entry<Department, ArrayList<Employee>> en: deptEmp.entrySet()) {
			System.out.println(en.getKey().getdName()+" : "+en.getValue());
		}
	}
	public static void main(String[] args) {
	
		ArrayList<Employee> emp =  new ArrayList<>();
		Department d1 = new Department(10,"Sales");
		Department d2 = new Department(20,"R&D");
		Department d3 = new Department(30,"HR");
		
		emp.add(new Employee(121,"James",d1));
		emp.add(new Employee(1121,"Lisa",d3));
		emp.add(new Employee(231,"Pratiksha",d2));
		emp.add(new Employee(232,"Hritika",d2));
		
//		for(Employee e:emp) {
//			System.out.println(e);
//		}
		
		deptwiseEmp(emp);
		
	}

}
