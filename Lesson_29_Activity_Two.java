import java.util.Scanner;
import java.lang.Math; 

class Lesson_29_Activity_Two {
  
    /* Fill this list with values that will be useful for you to test. 
   * A good idea may be to copy/paste the list in the example above. 
   * Do not make any changes to this list in your main method. You can 
   * print values from list, but do not add or remove values to this 
   * variable.  
   */
    public static String [] list = {};
    
    public static void main(String[] args)
     {
      for (int i = 0; i < list.length; i++){
       for (int j = list[i].length()-1; j >= 0; j--){
        System.out.print(list[i].charAt(j));
       }
       System.out.println();
      }
}
}