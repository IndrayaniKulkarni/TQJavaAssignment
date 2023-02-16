/*
 * Predict the output 
 * // my prediction = Test class Hello .. wrong 
  In order to override the function in Test we need use same 
  signature as parent class method..
...If we correct that then it will show  Test class Hello

 */
package com.overriding;

class Derived  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 
  
public class Test extends Derived 
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Test class " + temp); 
       
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        obj.getDetails("Hello"); 
    } 
} 

