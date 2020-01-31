import java.util.Scanner;

class Main{
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int number;
        
        boolean no_mistake = true;
        boolean P1, P2, P3;
        P1 = true;
        P2 = P3 = false;
       
        System.out.println("Welcome. What is your name?");
       
        String name = scan.nextLine();
        
        System.out.println("Hello " + name + ". Try your best to crack the code!\n");
        while(no_mistake == true){
          if(P1 == true){
            System.out.println("PHASE 1 \nEnter a number:");
            number = scan.nextInt();
            if(number != 3){
                no_mistake = false;
                System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
            }
            else{
                P1 = false;
                P2 = true;
            }
                
          }
          if(P2 == true){
            System.out.println("Correct!\n\nPHASE 2\nEnter a number:");
            number = scan.nextInt();
            if(number != 1 && !(number >= 33 && number <= 100)){
                no_mistake = false;
                System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
                }
            else{
                P2 = false;
                P3 = true;
            }
          }
          if (P3 == true){
               System.out.println("Correct!\n\nPHASE 3\nEnter a number:");
               number = scan.nextInt();
               if(number > 0 && ( number % 3 == 0 || number % 7 == 0)){
                 System.out.println("Correct!\nYou have cracked the code!");
               } 
               else{
                 System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
               }
               no_mistake = false;
          }
        }
        }
        
        
        }
       
       
