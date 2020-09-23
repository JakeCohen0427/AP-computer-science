import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int bin = sc.nextInt();
        int decimal = 0;
        int i = 0;
        while(bin != 0) {
            decimal += ((bin % 10) * Math.pow(2, i));
            bin = bin / 10;
            i++;
        }
        System.out.println(decimal);
    }
}
