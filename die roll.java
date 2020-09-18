import java.lang.Math;
class Main {
    public static void main(String[] args) {
      int roll1 = (int)(Math.random() * (6 - 1 + 1))+ 1;
      int roll2 = (int)(Math.random() * (6 - 1 + 1)) + 1;
      System.out.println(roll1);
      System.out.println(roll2);
      int x = roll1 + roll2;
      System.out.println(x);
    }
}
/*
Write a program that creates a two random number 1-6, 
prints each roll and prints their sum 
(such as you would get from rolling two dice).
*/
