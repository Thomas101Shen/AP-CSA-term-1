import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter ratings from the movie review website.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("Please enter ratings from the focus group.");
        Double fg1 = scan.nextDouble();
        Double fg2 = scan.nextDouble();
        
        System.out.println("Please enter the average movie critic rating.");
        Double mc = scan.nextDouble();
        
        System.out.println("Average website rating:");
        Double a1 = (double)(num1+num2+num3)/3;
        System.out.println(a1);
          
        /*System.out.println("Average focus group rating:");
        Double a2 = (fg1 + fg2) / 2;
        System.out.println(a2);
        
        System.out.println("Average movie critic rating:");
        System.out.println(mc);
        
        System.out.println("Overall movie rating:");
        double Omr = a1/5+a2*0.3+mc/2; //Count the average website rating as 20% of the overall rating, the average focus group rating as 30% of the overall rating, and the average movie critic rating as 50% of the overall rating.
        System.out.print(Omr);*/
        
    }
}