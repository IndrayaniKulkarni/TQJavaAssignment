/*
  1. Write a Java program to enter two numbers and find their sum.
 *
 * Classname - AddTwoNums
 * 
 * Version information
 *
 * Date - 28 Jan., 2023
 * 
 * Copyright notice 
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;

class AddTwoNums
{
    public static void main(String args[])
    {
        int num1, num2;
        int sum = 0;
  
        //inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter 2 numbers = ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();

        sum = num1 + num2; //Addition

        System.out.println("\n "+num1+" + "+num2+" = "+sum);
        
    }
}
