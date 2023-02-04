/*
 * 2. Write a Java program to enter two numbers and perform all arithmetic operations.
 *
 * Classname - ArithmeticOperations
 * 
 * Version information 
 *
 * Date - 28 Jan.,2023
 * 
 * Copyright notice
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class ArithmeticOperations
{
    public static void main(String args[])
    {
        int num1, num2;
        float answer = 0.0f;
        char op;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter expression (like  a + b) = ");
        num1 = sc.nextInt();
        op = sc.next().charAt(0);
        num2 = sc.nextInt();
        sc.close();

        switch(op)
        {
            case '+': answer = num1 + num2;
                    break;
            case '-': answer = num1 - num2;
                    break;
            case '*': answer = num1 * num2;
                    break;
            case '/': answer = num1 / num2;
                    break;                        
        }

        System.out.println("\n " + num1 + " " + op + " " + num2 + " = " + answer);
    }
}