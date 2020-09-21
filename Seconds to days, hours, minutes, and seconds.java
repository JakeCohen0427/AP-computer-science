import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    int seconds = sc.nextInt();
    int day = seconds / 86400; 
    seconds = seconds % 86400; 
    int hour = seconds / 3600; 
    seconds = seconds % 3600; 
    int minutes = seconds / 60; 
    seconds = seconds % 60;
    int seconds2 = seconds;
    System.out.println( day + " " + "days " + hour  + " " + "hours " + minutes + " "+ "minutes " + seconds2 + " "+ "seconds "); 
  }    
}
/*
Write a program to prompt the user to enter a number of 
seconds and output the number of days, hours, minutes, and seconds it is.
Your output should look something like:
Please enter the number of seconds: 1000000
11 days 13 hours 46 minutes 40 seconds
*/
