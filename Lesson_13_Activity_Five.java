/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;
import java.Math;

class Lesson_13_Activity_Five {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);

     int factor1 = (int)(Math.random()*12+1);
     int factor2 = (int)(Math.random()*12+1);

     System.out.println(factor1 + factor2);
     System.out.println("Multiply");

     int multiple;

    }
}