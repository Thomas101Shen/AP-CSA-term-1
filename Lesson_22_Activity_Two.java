/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
 
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_22_Activity_Two {
    public static void main(String[] args)
     {
    Scanner scan = new Scanner(System.in);
    
    String string = scan.nextLine();
    
    int index = 0;
    
    while(index < string.length()){
        int numTab = 0;
        while (numTab < index){
            System.out.print("  ");
            numTab += 1;
        }
        System.out.println(string.charAt(index));
        index += 1;
    }
    
}
}