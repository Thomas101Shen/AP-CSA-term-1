
import java.util.Scanner;

class Lesson_33_Activity_Two {
  
    public static void randomize(int[] ls)
    {
    for(int i = 0; i < ls.length; i++){
     ls[i] = (int)(Math.random()*90) + 10;
    }
    }
    
  
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);

     int l = scan.nextInt();
     int list[] = new int[l];
     randomize(list);
     for (int i = 0; i < list.length; i++){
          System.out.print(list[i] + " ");
         }
     }
}