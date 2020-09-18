import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNum, secondNum, x;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        firstNum = keyboard.nextInt();
        System.out.print("Enter another integer: ");
        secondNum = keyboard.nextInt();
        if((firstNum <= 0) | (secondNum <= 0)) {
            System.out.println("The integer must be greater than zero");
        }
        if(firstNum > secondNum) {
            x = firstNum % secondNum;
        } else {
            x = secondNum % firstNum;
        }
        if (x == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
/*
Write a program that takes two positive integers as command line arguments and 
prints true if either evenly divides the other.
*/
