import java.util.Scanner;

class Lesson_14_Activity_Three {
    public static void main(String[] args)
     {
     Scanner scan = new Scanner(System.in);

     int oct1 = scan.nextInt();
     int oct2 = scan.nextInt();
     int oct3 = scan.nextInt();
     int oct4 = scan.nextInt();
    boolean isValid = true;
    
     if (! (oct1 >= 0 && oct1 <= 255)){
      System.out.println("Octet 1 is incorrect");
      isValid = false;
         }
     if (! (oct2 >= 0 && oct2 <= 255)){
      System.out.println("Octet 2 is incorrect");
      isValid = false;
         }
     if (! (oct3 >= 0 && oct3 <= 255)){
      System.out.println("Octet 3 is incorrect");
      isValid = false;
         }
     if (! (oct4 >= 0 && oct4 <= 255)){
      System.out.println("Octet 4 is incorrect");
      isValid = false;
         }
     if (isValid == true) {
      System.out.println("IP Address: " + oct1 + "." + oct2 + "." + oct3 + "." + oct4);
     }
     }
}