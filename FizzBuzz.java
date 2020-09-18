import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = in.nextLine();
    if((word.charAt(0) == 'f') & (word.charAt(word.length()-1) == 'b')) {
      System.out.println("FizzBuzz");
    }
    if((word.charAt(0) == 'f') & (word.charAt(word.length()-1) != 'b')) {
      System.out.println("Fizz");
    }
    if((word.charAt(word.length()-1) == 'b') & (word.charAt(0) != 'f')) {
      System.out.println("Buzz");
    }
    if((word.charAt(0) != 'f') & (word.charAt(word.length()-1) != 'b')) {
      System.out.println(word);
    }
  }
}

/* prompt - 
Take a word from input and print the following:
"Fizz" if the word starts with an "f" but does not end with a "b"
"Buzz" if the word does not start with an "f" but ends with a "b"
"FizzBuzz" if the word starts with an "f" and ends with a "b"
The original word if the word neither starts with an "f" nor ends with a "b"
*/
