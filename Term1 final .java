
import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Seconds Since Unix Epoch: ");
    int unixEpoch = scan.nextInt();      
    int secondsLeft = unixEpoch % 60;        //seconds
    int minutesLeft = (unixEpoch/60) % 60;    //minutes left out
    int minutes =  unixEpoch / 60;            //minutes to calc minleft
    int hours = minutes / 60;           //hours to calc hoursleft
    int hoursLeft = hours % 24;            //hours left out
    int days = hours / 24;           //days to calc daysleft
    int daysLeft = days % 30;                //days left out
    int months = days / 30;                  //months to calc monthleft
    int monthsLeft = months % 12;              //months left out
    int years = (months/12) + 1970;     //current year
    
    System.out.println("Year: " + years + "\nMonth: " + monthsLeft + "\nDay: " + daysLeft + "\nHour: " + hoursLeft + "\nMin: " + minutesLeft + "\nSec: " + secondsLeft); 
  }
}