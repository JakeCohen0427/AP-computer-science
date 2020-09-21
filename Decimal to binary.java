import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in decimal: ");
        int decimal = sc.nextInt();
        for(int i = 0; i <= 30; i++) {
            int a = decimal / 2;
            int q = decimal % 2;
            decimal = a;
            System.out.print(q);
            if(i == 3 || i == 7 || i == 11 || i == 15 || i == 19 || i == 23 || i == 27) {
                System.out.print(" ");
            }
            if(i == 30) {
                System.out.print("0");
            }
        }
    }
}
