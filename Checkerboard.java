import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the dimensions: ");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      if(i % 2 == 0)
      System.out.print(" ");
      for(int j = 0; j < n; j++){
        System.out.print("* ");
        }
      System.out.println();
    }
  }
}
/*
Take a number from input, n, 
and print a checkerboard of n by n dimensions where spaces and * alternate.  
Lines should alternate whether they start with a space or a star.
*/
