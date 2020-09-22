import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for(int p = 0; p <= 20; p++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number in decimal: ");
            int decimal = sc.nextInt();
            int a = decimal;
            String bin = "";
            int x = 0;
            for (int i = 0; i <= 30; i++) {
                if (a != 0) {
                    a = decimal / 2;
                    int q = decimal % 2;
                    decimal = a;
                    if (q == 1) {
                        bin = "1" + bin;
                        x++;
                        if (x % 4 == 0) {
                            bin = " " + bin;
                        }
                    }
                    if (q == 0) {
                        bin = "0" + bin;
                        x++;
                        if (x % 4 == 0) {
                            bin = " " + bin;
                        }
                    }
                }
            }
            if (x == 7 || x == 27 || x == 15 || x == 11 || x == 3 || x == 19 || x == 31 || x == 23) {
                bin = "0" + bin;
            }
            if (x == 10 || x == 30 || x == 14 || x == 18 || x == 2 || x == 6 || x == 22 || x == 26) {
                bin = "00" + bin;
            }

            if (x == 17 || x == 21 || x == 5 || x == 1 || x == 9 || x == 13 || x == 29 || x == 25) {
                bin = "000" + bin;
            }
            System.out.println(bin);
        }
    }
}
