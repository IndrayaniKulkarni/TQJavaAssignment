/*
 * 11. Write a Java program to enter any number and calculate its square root.
 *
 * Classname - SquareRoot
 *
 * Version info.
 *
 * Date - 29 Jan.,2023 
 *
 * Copyright notice
 */
import java.util.Scanner;
import java.lang.Math;
class SquareRoot
{
    public static void main(String args[])
    {
        float num = 0.0f;
        double sqroot = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter a number whos square root need to find = ");
        num = sc.nextFloat();
        sc.close();

        // using built-in function 
        sqroot = Math.sqrt(num);
        System.out.println(" Square root of " + num + " = " + sqroot);
  
        // "Answer only using built-in(), do without it too and update" 
    }
}