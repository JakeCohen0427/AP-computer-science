import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a maximum number");
        int max = sc.nextInt();
        int a = 1;
        for (int i = 0; i <= max;) {
            System.out.println(a);
            int b = a * 2;
            a = b;
            i = b;
        }
    }
}
/*
Write a program that takes a number n from input 
and prints all powers of 2 less than n.
*/
