/*
 * 10. Write a Java program to find power of any number x ^ y.
 *
 * Classname - PowerOf
 *
 * Version info.
 *
 * Date - 29 Jan., 2023
 *
 * Copyright notice 
 */
import java.util.Scanner;
import java.lang.Math;
class PowerOf
{
    public static void main(String args[])
    {
        float num = 0.0f;
        int power ;
        double answer ;
        char ignoreChar;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter number (like a ^ b) = ");
        num = sc.nextFloat();
        ignoreChar = sc.next().charAt(0);
        power = sc.nextInt();
        sc.close();

        if(power == 0)
        {
            answer = 1.0;
            
        }
        else
        {
            answer = num;
            for(int i=1; i<power; i++)
            {
                answer = answer * num;
            }
        }
        System.out.println("\n Answer (using for loop) = "+answer);

        // or use built in methods
        System.out.println("\n Answer (using lang.math - pow()) = "+ Math.pow(num,power));


    }
}