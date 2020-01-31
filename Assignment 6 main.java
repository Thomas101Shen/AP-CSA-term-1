import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int length = 0;
    
    while(length < 10){
    System.out.println("Enter an array length (must be 10 or greater):");
    length = scan.nextInt();
    }
    
    int [] list = new int [length];
    int [] list2 = new int [length];
    int [] merge_list = new int[2*length];
    
    int mLength = merge_list.length;
    
    System.out.print("First Array: ");
    
    for(int i = 0; i < length; i++){
    list[i] = (int)(Math.random()*((100-1)+1)+1);;
    System.out.print(list[i] + " ");
    }
    
    System.out.println("\n");
    
    System.out.print("Second Array: ");
    
    for(int j = 0; j < length; j++){
    list2[j] = (int)(Math.random()*((100-1)+1)+1);;
    System.out.print(list2[j] + " ");
    }
    
    System.out.println("\n");
    
    int sIndex1 = 0;
    int sIndex2 = 0;
    
    for(int j = 0; j < mLength; j++){
      if (j % 2 != 0){
        merge_list[j] = list[sIndex1];
        sIndex1++;
      }
      else if (j % 2 == 1){
        merge_list[j] = list2[sIndex2];
        sIndex2++;
      }
      
      for(int l = 0; l < mLength; l++){
       System.out.print(merge_list[l] + " ");
      }
      
    }
    
  }
}