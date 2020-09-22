import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the number of fibonacci numbers you would like: ");
    int p = sc.nextInt();
    p = p - 1;
    int x;
    int y = 0;
    int z = 1;
    for(int i = 0; i <= p; i++) {
      System.out.println(z);
      x = y + z; 
      y = z; 
      z = x; 
    }
  }
}
