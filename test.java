import java.util.Scanner;
import java.lang.Math;

class Main1 {
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int length = 0;
    
    while(length < 10){
    System.out.println("Enter an array length (must be 10 or greater):");
    length = scan.nextInt();
    }
    
    int ele = (int)(Math.random()*100);
    
    int [] list = new int [length];
    int [] list2 = new int [length];
    int [] mergelist = new int[2*length];
    
    System.out.print("First Array: ");
    
    for(int i = 0; i < length; i++){
    list[i] = (int)(Math.random()*100);
    System.out.print(list[i] + " ");
    }
    
    System.out.println("\n");
    
    System.out.print("Second Array: ");
    
    for(int j = 0; j < length; j++){
    list2[j] = (int)(Math.random()*100);
    System.out.print(list[j] + " ");
    }
    
    System.out.println("\n");
  }
}