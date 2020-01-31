import java.util.Scanner;
import java.lang.Math;

class Main2 {
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
    int [] dictionary = new int[101];
    
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
    int iterate_checker = 0;
    
    boolean is_dup = false;
    
    for(int k = 0; k < 2*length; k++){
      if(sIndex2 < length){
        if (k % 2 == iterate_checker){
          if(dictionary[list[sIndex1]] < 1){
            merge_list[k] = list[sIndex1];
            dictionary[merge_list[k]] += 1;
          }
          else{
            is_dup = true;
          }
          sIndex1++;
          }

        
        if(k % 2 != iterate_checker){
          if (dictionary[list2[sIndex2]] < 1){
            merge_list[k] = list2[sIndex2];
            dictionary[merge_list[k]] += 1;
          }
          else{
            is_dup = true;
          }
         sIndex2++;
         }
        if(is_dup == true){
            k--;
            is_dup = false;
            if (iterate_checker == 0){
              iterate_checker++;
            }
            else{
              iterate_checker--;
            }
        }
      }
    }
    
    System.out.print("Merged Array: ");
    for (int l = 0; l < 2*length; l++){
      if (merge_list[l] != 0){
        System.out.print(merge_list[l] + " ");
      }
    }
    System.out.println("\n");

      for (int m = 0; m < dictionary.length; m++){
        System.out.print(dictionary[m] + ", ");
    }
  }
}