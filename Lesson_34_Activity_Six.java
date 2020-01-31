import java.util.Scanner;

class Lesson_34_Activity_Six {
  
   public static boolean allPositive(int [] a)
    {
    boolean isPos = true;
    for(int i = 0; i < a.length; i++){
      if (a[i] < 0){
        isPos = false;
      }
    }
     return isPos;
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

     System.out.println(allPositive(arr));
    }

}