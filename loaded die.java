public class Main {

    public static void main(String[] args) {
        for(int i = 0; i <= 7; i++) {
        int roll = (int)(Math.random() * 9 + 1);
        if(roll == 1 || roll == 2 || roll == 3 || roll == 4 || roll == 5) {
            int roll2 = (int)(Math.random() * 6 + 1);
            System.out.println(roll2);
        }
        if(roll == 6 || roll == 7 || roll == 8) {
            System.out.println("6");
            }
        }
    }
}
/*
Write a program that rolls a "loaded" die ten times and prints the result.  
The die is "loaded" such that 1,2,3,4,5 
are rolled 1 out of 8 times and 6 is rolled 3/8 times.
*/
