import java.util.Scanner;

class Lesson_33_Activity_Three {
  
    public static void printIt(int[] ls)
    {
    for (int i = 0; i < ls.length; i++){
     System.out.print(ls[i] + " ");
    }
    System.out.println("");
    }

  
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
     printIt(list);
     }
}