public class Main {

    public static void main(String[] args) {
        //even number 0 - 100
        int roll_even = (int) (Math.random() * 100) * 2;
        System.out.println(roll_even);
        //odd number 0 - 100
        int roll_odd = (int) (Math.random() * 100) * 2 + 1;
        System.out.println(roll_odd);
    }
}
