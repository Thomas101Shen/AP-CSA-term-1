import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Lesson_6_Activity_One {
    public static void main(String[] args) {
      
        System.out.println("Please enter two integers:");
        Scanner scan = new Scanner(System.in);
        double num = 6;
        System.out.println(num);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double average = (double)(num1 + num2)/2;
        int A, B;
        A = 2;
        B = 3;
        System.out.println(A+B);
        System.out.println(average);
        char _ = (char)Math.abs(-82);

    }
}