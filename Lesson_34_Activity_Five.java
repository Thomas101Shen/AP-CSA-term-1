import java.util.Scanner;

class Lesson_34_Activity_Five {
  
   public static int sumEven(int [] a)
    {
    int sum = 0;
    for(int i = 0; i < a.length; i++){
      if (a[i] % 2 == 0){
        sum += a[i];
      }
    }
    return sum;
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

     System.out.println(sumEven(arr));
    }

}