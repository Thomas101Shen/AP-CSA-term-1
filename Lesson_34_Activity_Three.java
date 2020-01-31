import java.util.Scanner;

class Lesson_34_Activity_Three {
  
   public static int findMax(int [] a)
    {
    int max = 0;
    for(int i = 0; i < a.length; i++){
      if (a[i] > max){
        max = a[i];
      }
    }
    return max;
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

     System.out.println(findMax(arr));
    }

}