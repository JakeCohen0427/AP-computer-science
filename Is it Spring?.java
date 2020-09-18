import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a month: ");
    int month = sc.nextInt();
    System.out.println("Please enter a day: ");
    int day = sc.nextInt();
    if(month <= 0 || month >= 13) {
      System.out.println("Invalid month");
    }
    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      if(day >= 32) {
        System.out.println("Invalid number of days for month");
        System.exit(1);
      }
    }
    if(month == 4 || month == 6 || month == 9 || month == 11) {
      if(day >= 31) {
        System.out.println("Invalid number of days for month");
        System.exit(1);
      }
    }
    if(month == 2 && day >= 30) {
      System.out.println("Invalid number of days for month");
      System.exit(1);
    }
    if(month >= 3 && month <=6) {
      if(month == 3 && day <= 19) {
        System.out.println("It is not spring");
      } else if(month == 6 && day >= 21) {
        System.out.println("It is not spring");
      } else {
        System.out.println("It is spring");
      }
    } else {
      System.out.println("It is not spring");
    }
  }
}
/*
Write a program that takes the day and month and prints "It's Spring!" 
if the day is between 3/20 and 6/20, 
and "It is not Spring" if the day does not fall in that range.
*/
