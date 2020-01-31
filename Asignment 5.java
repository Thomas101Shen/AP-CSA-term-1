import java.util.Scanner;

class assignmet_5{
   
  public static void main(String[] args){
    
  Scanner scan = new Scanner(System.in);
  
  System.out.println("How long do you want the array?");
  
  int arrLength = scan.nextInt();
  
  if (arrLength <= 0){
    System.out.println("Not a valid length!");
  }
  else{
      double[] myList = new double[arrLength];
  
      double sum = 0;
      
      boolean increasing = true;
      boolean decreasing = true;
      
      for (int i = 0; i < arrLength; i++){
        System.out.println("Enter a number");
            myList[i] = scan.nextDouble();
            System.out.println(myList[i]);
            sum += myList[i];
        }
      double min, max;
      min = max = myList[0];
      for (int i = 1; i < arrLength; i++){
        if (myList[i] > max || myList[i] == max){
            max = myList[i];
            decreasing = false;
        }
        if (myList[i] < min){
            min = myList[i];
            increasing = false;
        }
      }
        System.out.print("Your array is {");
            for (int j = 0; j < myList.length-1; j++)
            {
              System.out.print(myList[j] + ", ");
            }
            System.out.println( myList[arrLength - 1] + "}");
            System.out.println("The average is " + sum/arrLength);
            System.out.println("The range is " + (max-min));
            if (decreasing == true){
                System.out.println("The array is sorted in decreasing order");
            }
            else if (increasing == true){
                System.out.println("The array is sorted in increasing order");
            }
            else {
                System.out.println("The array is unsorted");
            }
      }
  }
  
  }
