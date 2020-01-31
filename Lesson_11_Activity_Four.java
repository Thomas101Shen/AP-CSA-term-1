/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Four {   
public static void main(String[] args) 
   { 
   int x = 29 % 10;
if (x > 10)
    System.out.println(1);
else if (x > 8)
    System.out.println(2);
else if (x > 6)
    System.out.println(3);
else if ( x > 4)
    System.out.println(4);
else
    System.out.println(5);
}
}