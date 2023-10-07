package game;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private final Random random;

    public GameLogic() {
        random = new Random();
    }

    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 1 || choice > 3) {
            System.out.println("Choose (1) Rock, (2) Paper, or (3) Scissors:");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }

        return choice;
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public String playRound(int playerChoice, int computerChoice) {
        String result = "You chose: " + choiceToString(playerChoice) + "\n";
        result += "Computer chose: " + choiceToString(computerChoice) + "\n";

        if (playerChoice == computerChoice) {
            result += "It's a draw!";
        } else if ((playerChoice == 1 && computerChoice == 3) ||
                (playerChoice == 2 && computerChoice == 1) ||
                (playerChoice == 3 && computerChoice == 2)) {
            result += "You win this round!";
        } else {
            result += "Computer wins this round.";
        }

        return result;
    }


    public void declareOverallWinner(int playerScore, int computerScore) {
        if (playerScore > computerScore) {
            System.out.println("Congratulations! You win the game!");
        } else if (playerScore < computerScore) {
            System.out.println("Computer wins the game. Better luck next time!");
        } else {
            System.out.println("It's a tie! No overall winner.");
        }
    }

    private String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid Choice";
        };
    }
}