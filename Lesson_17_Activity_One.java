/*
 * Lesson 17 Coding Activity 1
 * Write a program that will input a list of test scores in from the keyboard. 
 * When the user enters -1, print the average.
 * 
 * What do you need to be careful about when using -1 to stop a loop?
 * 
 *     Sample Run:
 *         Enter the Scores:
 *         45
 *         100
 *         -1
 *
 *         The average is: 72.5
 * 
 * 
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_17_Activity_One {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);

      double num, sum, counter;
      num = sum = counter = 0;
      
      System.out.println("Enter the Scores:");

      while (num != -1){
       num = scan.nextDouble();
       if (num != -1){
         sum += num;
         counter += 1;
       }
      }
      System.out.print("The average is: " + sum/counter);
}
