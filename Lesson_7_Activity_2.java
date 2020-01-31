/*
 * Lesson 7 Coding Activity Question 2
 *
 * Change the last problem so that it also prints the sum of the digits. 
 * Use the format shown below.
 *
 * Make sure your output is printed in the same order as the sample run.
 *
 * Sample run:
 
Please enter a three digit number:
678

Here are the digits:
6
7
8

6 + 7 + 8 = 21

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number:");
        
        int num = scan.nextInt();
        int hun = num/100;
        int ten = num%100/10;
        int sin = num%10;
        
        System.out.println("Here are the digits:");
        System.out.println(hun);
        System.out.println(ten);
        System.out.println(sin);
        
        System.out.print(hun + " + ");
        System.out.print(ten + " + ");
        System.out.print(sin + " = ");
        System.out.print(hun+ten+sin);
    }
}