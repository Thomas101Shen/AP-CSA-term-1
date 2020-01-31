import java.util.Scanner;

class Lesson_34_Activity_One {
  
   public static int sum(int [] a)
    {
    int fSum = 0;
    for (int i = 0; i < a.length; i++){
      fSum += a[i];
    }
    
    return fSum; 
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

     System.out.println(sum(arr));
    }
}