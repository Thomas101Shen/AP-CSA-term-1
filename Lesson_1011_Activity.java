import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int input;
      
      int baseTen = 0;       
      String str_Input = "";
      System.out.println("Enter a number in base 8:");
      input = scan.nextInt();
      str_Input += input;
      
      int count = 0;
      
      //make array and take number and power to inverse index
      
      
      if(str_Input.length() > 8)
      {
        System.out.println("ERROR: Incorrect Octal Format");
        return;
      }
      
      for(; count < str_Input.length(); count++)
      {
        if(str_Input.charAt(count) == '8' || str_Input.charAt(count) == '9')
        {
          System.out.println("ERROR: Incorrect Octal Format");
          return;
        }
      }
        
        int [] temp = new int [8];
      
        for(int i = 0; i < str_Input.length(); i++)
        {
          temp[i] = input % 10;
          input /= 10;
          
          baseTen += (temp[i] * Math.pow(8,i));
          
        }
        
        
      
      System.out.println(baseTen);
      }
}