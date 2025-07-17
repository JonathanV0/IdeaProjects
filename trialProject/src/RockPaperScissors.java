import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your move (r, p, or s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + "is not a valid move, please enter r, p, or s");
        }

        System.out.println("Computer player: " + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("It was a tie!");
        }
        else if (playerMove.equals("r")) {
            if (computerMove.equals("p"))
            {
                System.out.println("You lose");
            }
            else if (computerMove.equals("s")) {
                System.out.println("You win");

            }

        } else if (playerMove.equals("p")) {
            if (computerMove.equals("r"))
            {
                System.out.println("You Win");
            }
            else if (computerMove.equals("s")) {
                System.out.println("You lose");

            }

        } else if (playerMove.equals("s")) {
            if (computerMove.equals("p"))
            {
                System.out.println("You win");
            }
            else if (computerMove.equals("r")) {
                System.out.println("You lose");

            }
        }
    }
}