import java.util.Scanner;

class Lesson_32_Activity_Two {

         public static void monthDays(int numb)
          {
          if (numb == 1){
           System.out.print("31");
          }
          else if (numb == 2){
           System.out.print("28");
          }
          else if (numb == 3){
           System.out.print("31");
          }
          else if (numb == 4){
           System.out.print("30");
          }
          else if (numb == 5){
           System.out.print("31");
          }
          else if (numb == 6){
           System.out.print("30");
          }
          else if (numb == 7){
           System.out.print("31");
          }
          else if (numb == 8){
           System.out.print("31");
          }
          else if (numb == 9){
           System.out.print("30");
          }
          else if (numb == 10){
           System.out.print("30");
          }
          else if (numb == 11){
           System.out.print("30");
          }
          else if (numb == 12){
           System.out.print("31");
          }
          
          }
          
        
        public static void main(String[] args)
         {
          Scanner scan = new Scanner(System.in);
          int num = scan.nextInt();
          monthDays(num);
         }
}