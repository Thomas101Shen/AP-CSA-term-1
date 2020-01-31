import java.util.Scanner;

public class Lesson_30_Activity {
     
   /*
    * Your code should end with the following array modified as the 
    * instructions above specify. You may modify the elements in 
    * this list but make sure you do not add or remove anything from it. 
   */
    public static String [] list = {"every", " near  ing ", "      checking", "food ", "stand", "value      "};
  
    public static void main(String[] args)
     {
      boolean isSpace = false;

     for (int i = 0; i < list.length; i++){
        
      for (int j = 0; j < list[i].length(); j++){
         
       /*if (isSpace == true){
        j = 0;
        isSpace = false;
      }*/
         
        if (list[i].charAt(j) == ' ' && j == 0){
          list[i] = list[i].substring(j+1,list[i].length());
          isSpace = true;
          j -= 1;
        }
         
         else if(list[i].charAt(j) == ' '){
         list[i] = list[i].substring(0,j) + list[i].substring(j+1,list[i].length());
          isSpace = true;
          j -= 1;
         }
         

         
      }
     }
    }
    }