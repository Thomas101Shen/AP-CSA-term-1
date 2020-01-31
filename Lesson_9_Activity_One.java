/*
 * Lesson 9 Coding Activity Question 1
 *
 * Write the code to print a random integer from 1 to 10 inclusive using Math.random().
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_9_Activity_One {
    public static void main(String[] args) {
      
       int x = (int)(Math.random()*110);
       x = x/10;
         if (x < 1){
         x += 1;
       }
       System.out.println((int)x);
    }
}