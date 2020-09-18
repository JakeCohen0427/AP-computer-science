import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int a,b,c;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a side's length:");
    a = in.nextInt();
    System.out.println("Enter another side's length:");
    b = in.nextInt();
    System.out.println("Enter another side's length:");
    c = in.nextInt();
    if((a + b > c) & (b + c > a) & (c + a > b)) {
      System.out.println("This is a triangle");
    } else {
      System.out.println("This cannot be a triangle");
    }

  }
}
/*
Write a program that takes the length of three sides of a triangle 
and prints whether it can be a triangle.  
It will base this on whether any side is greater than or equal to the sum of the other two sides.  
(A triangle cannot have a side be longer or equal to the sum of the other sides).
*/
