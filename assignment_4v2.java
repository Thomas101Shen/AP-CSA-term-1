import java.util.Scanner;

class assignment_4v2{
  
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Type the message to be shortened");
    
    String msg = scan.nextLine();
    
    if(msg.length() < 10){
      System.out.println("This doesn't need shortening!");
    }
    else{
      msg = msg.toLowerCase();
      String msgShrt = "";
      
      int spaceChck = 0;
      
      int rmVowels = 0;
      int rmRepeat = 0;
      
      boolean isPreVowel = false;
      
      for(int i = 0; i < (msg.length()); i++)
      {
        if (i > 0 && msg.charAt(i - 1) != ' '){
          
            if (msg.charAt(i) == 'a'
               || msg.charAt(i) == 'e'
               || msg.charAt(i) == 'i'
               || msg.charAt(i) == 'o'
               || msg.charAt(i) == 'u'){
                 rmVowels++;
            }
            else if (/*isPreVowel == false && */msg.charAt(i) == msg.charAt(i-1)){
                rmRepeat++;
            }
            else{
                msgShrt += msg.charAt(i);
            }    
        }
        else{
                msgShrt += msg.charAt(i);
            }
       /*int indexRepeat = spaceChck;
       boolean isRepeat = false;
       if ( i > 0 && msg.charAt(i) != space && isPreVowel == false && msg.charAt(i-1) != ' '){
         while (indexRepeat < msgShrt.length()){
           if (msg.charAt(i) == msgShrt.charAt(indexRepeat)){
             isRepeat = true;
           }
           indexRepeat += 1;
         }
       }
        if (isVowel == true){
          rmVowels += 1;
          isPreVowel = true;
        }
        
        else if (isRepeat == true){
          rmRepeat += 1;
        }
        
        else{
        msgShrt += msg.charAt(i);
        isPreVowel = false;
        }
        if (msg.charAt(i) == ' '){
          spaceChck = i - rmVowels - rmRepeat;
        }*/
    }
      System.out.println("Shortened message: " + msgShrt);
      System.out.println("Repeated letters removed: " + rmRepeat);
      System.out.println("Vowels removed: " + rmVowels);
      System.out.println("Total characters saved: " + (rmVowels+rmRepeat));
  }
  }
}