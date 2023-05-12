package com.hotelMsgSys;

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
   
    double salary;
    
    public Employee(String name, int age,  double salary) {
        super(name, age);
        
        this.salary = salary;
    }
    
    void displayDetails() {
        super.displayDetails();
        
        System.out.println("Salary: " + salary);
    }
    
    
}

class Chef extends Employee {
    String speciality;
    
    public Chef(String name, int age, double salary, String speciality) {
        super(name, age,salary);
        this.speciality = speciality;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Speciality: " + speciality);
    }
    
    
}

public class HotelManagementSystem {
    public static void main(String[] args) {
        
        // Create a Chef object
        Chef chef = new Chef("John", 30,  50000, "French cuisine");
        
        // Create an Employee object
        Employee employee = new Employee("Jane", 25,  10000);
        
        // Display the details of the Chef object
        chef.displayDetails();
        
        // Display the details of the Employee object
        employee.displayDetails();
        
    }
}
