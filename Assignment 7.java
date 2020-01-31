import java.util.*;
import java.lang.Math;

class Main{

 public static String duplicate(String str){
  String dup = "";

  if (str.length() % 2 == 0)
  {
   for (int n1 = 0; n1 < str.length(); n1++)
   {
    for (int n = 0; n < str.length()*2; n++)
    {
     dup += str.charAt(n1);
    }
   }
  }
  else{
   for (int nOdd = 0; nOdd < str.length(); nOdd++)
   {
    for (int nOddIt = 0; nOddIt < str.length(); nOddIt++)
     dup += str.charAt(nOdd);
   }
  }
  return dup;
 }

 public static boolean isEdhesivePalindrome(String str){
  String pal = "";

  for(int i = 0; i < str.length(); i++){
   if(str.charAt(i) == '4'){
    str = str.substring(0,i) + "a" + str.substring(i+1);
   }
   else if (str.charAt(i) == '3'){
    str = str.substring(0,i) + "e" + str.substring(i+1);
   }
   else if (str.charAt(i) == '0'){
    str = str.substring(0,i) + 'o' + str.substring(i+1);
   }
  }

  for(int j = str.length()-1; j >= 0; j--)
  {
   pal += str.charAt(j);
  }

  str = str.toLowerCase();
  pal = pal.toLowerCase();

  return str.equals(pal);
 }

 public static double numberScramble(double num){
     if (num <= 0){
         return 0;
     }
  num +=5;
  num /= 2;
  num = Math.sqrt(num);
  return num;
 }

 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);

  System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
  String dupe = scan.nextLine();
  System.out.println("The duplicated String is: " + duplicate(dupe));

  System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
  String epal = scan.nextLine();
  if (isEdhesivePalindrome(epal) == true){
   System.out.println("Nice, you found an Edhesive Palindrome!");
  }
  else{
   System.out.println("Too bad, that isn't an Edhesive Palindrome.");
  }

  System.out.println("Almost done! Please enter a number to scramble.");
  double numScram = scan.nextDouble();
  System.out.println("The scrambled number is: " + numberScramble(numScram));

 }
}