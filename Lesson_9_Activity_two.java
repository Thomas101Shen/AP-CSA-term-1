/*
 * Lesson 9 Coding Activity Question 2
 *
 * Write the code to print a random integer from -20 to 20 inclusive using Math.random().
 *
*/


import java.util.Scanner;
import java.lang.Math;

class Lesson_9_Activity_Two {
    public static void main(String[] args) {
      
      double random = Math.random();
      int range = 21;
      int min = 20;
      System.out.println((int)(random * range)+min);
       

    }
}