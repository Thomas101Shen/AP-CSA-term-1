/*
 * Lesson 34 Coding Activity 2
 * 
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods, 
 * then paste everything into the code runner box. Your submission should 
 * begin with the first import statement and end with the final }.
 * 
 * Write a method that takes an array of ints as a parameter 
 * and returns the average value of the array as a double.
 * 
 *     public static double average(int [] a)
 * 
 * For example, average(a) would return 2.0 
 * if a = {1, 2, 3} or 1.0 if a = {1, 1, 1}.
 */


import java.util.Scanner;

class Lesson_34_Activity_Two {
  
   public static double average(int [] a)
    {
    double average = 0;
    int i = 0;
    for (; i < a.length; i++){
      average += a[i];
    }
    
    System.out.println(average);
    
    
    average /= i;
    
    System.out.println(average);
    
    return average;   
    }
  
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);

     int l = scan.nextInt();
     int arr[] = new int[l];

     int i = 0;
     while (i < l){
      arr[i] = scan.nextInt();
      i += 1;
     }

     System.out.println(average(arr));
    }
}