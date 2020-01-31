import java.util.Scanner;

class assignment_4{
  
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Type the message to be shortened");
    
    String msg = scan.nextLine();
    
    if(msg.length() < 10){
      System.out.println("This doesn't need shortening!");
    }
    else{

      String msgShrt = "";

      int i = 0;
     
      int rmVowels = 0;
      int rmRepeat = 0;
      
      boolean isPreVowel = false;
      
      char space = ' ';
      while (i < msg.length()){
        boolean isVowel = false;
        if (i > 0 && msg.charAt(i - 1) != space){
          
            if (msg.charAt(i) == 'a'
               || msg.charAt(i) == 'e'
               || msg.charAt(i) == 'i'
               || msg.charAt(i) == 'o'
               || msg.charAt(i) == 'u'){
              isVowel = true;
            }
        }
        
        
       int indexRepeat = 0;
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
      i += 1;
    }
      System.out.println("Shortened message: " + msgShrt);
      System.out.println("Repeated letters removed: " + rmRepeat);
      System.out.println("Vowels removed: " + rmVowels);
      System.out.println("Total characters saved: " + (rmVowels+rmRepeat));
  }
  }
}