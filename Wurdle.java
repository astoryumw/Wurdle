import java.util.Scanner;
import java.util.Arrays;

public class Wurdle {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String actualWord = "books";
        System.out.println("Guess a five letter word.");
        System.out.print("After you have guessed, your word will be printed, with each letter ");
        System.out.println("that is in the actual word capitalized.");
        String guess = myScanner.next();
        String[] guessSplit = guess.split("");
        String[] actualWordSplit = actualWord.split("");

        // System.out.println(Arrays.toString(actualWordSplit) + " " + Arrays.toString(guessSplit));

        while (true) {
            for (int i=0; i<guess.length(); i++) {
                if (actualWordSplit[i].equals(guessSplit[i])) {
                    // System.out.println("They are equal.");
                    guessSplit[i] = guessSplit[i].toUpperCase();
                }
            }
            String guessAsString = "";
            for (int u=0; u<guess.length(); u++) {
                guessAsString = guessAsString + guessSplit[u];
            }
            System.out.println(guessAsString);
            // System.out.println(guess);
            // System.out.println(actualWord);
            if (guess.equals(actualWord)) {
                    System.out.println("You got it!");
                break;
            }
            System.out.println("Guess again.");
            guess = myScanner.next();
            guessSplit = guess.split("");
            // System.out.println(guess + " " + actualWord);
        }
    }
}