
import java.util.Scanner;

class Lesson_33_Activity_One {
  
    public static void upper(String[] array)
    {
     for (int i = 0; i < array.length; i++){
      array[i] = array[i].toUpperCase();
     }
    }
  
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);

     int length = scan.nextInt();

     String [] ls = new String[length];
     for (int i = 0; i < ls.length; i++){
      ls[i] = scan.nextLine();
     }
     
     upper(ls);
     
     for (int j = 0; j < ls.length; j++){
      System.out.println(ls[j]);
     }
    }
}