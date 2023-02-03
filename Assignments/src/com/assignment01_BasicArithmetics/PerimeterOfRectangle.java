/*
 * 3. Write a Java program to enter length and breadth of a rectangle and find its perimeter
 * Classname - PerimeterOfRectangle
 *
 * Version information 
 *
 * Date - 28 Jan., 2023 ; 29 Jan.,2023
 *
 * Copyright notice
*/
import java.util.Scanner;
class PerimeterOfRectangle
{
    public static void main(String args[])
    {
        //declaration
        float length = 0.0f, breadth = 0.0f;
        double perimeter = 0.0;
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter the length and breadth of Rectangle = ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        sc.close();

        //calculation
        perimeter = length + breadth; 
        //output
        System.out.println("Perimeter of rectangle = "+perimeter+" units ");

    }
}