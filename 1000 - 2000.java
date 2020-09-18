class Main {
  public static void main(String[] args) {
        int x = 1000;
        int y = 2000;
        int line = 5;
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
            if ((i + 1) % line == 0) System.out.println();
        }
        System.out.println();
    }
}
//Print all the numbers 1000 to 2000, with 5 numbers per line.  
