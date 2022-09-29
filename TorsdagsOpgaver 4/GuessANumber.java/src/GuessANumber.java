import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        System.out.println("(The number is "+rnd_number+")");
        makeAGuess();

    }


    private static void makeAGuess() {
        boolean valid=false;
        Scanner scan = new Scanner(System.in);
        int guess = 0;

        while(!valid) {

            try {
                guess = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Please input a number instead");
                return;
            }

            if (guess == rnd_number) {

                System.out.println("You guessed correctly, the number was: " + rnd_number);
                valid=true;

            } else {
                System.out.println("Incorrect, try again");

            }
        }


    }
}



