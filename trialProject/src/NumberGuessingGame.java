import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println(randomNumber);
        int tryCount = 0;

        while(true) {
            System.out.println("Enter your guess between 1 and 100:");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("You Guessed it!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            }
            else if (randomNumber > playerGuess) {
                System.out.println("Guess higher!");

            }
            else {
                System.out.println("Guess lower!");
            }
        }


        scanner.close();

    }
}
