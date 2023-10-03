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

    public int generateComputerChoice() {
        return random.nextInt(3) + 1;
    }

    public void playRound(int playerChoice, int computerChoice) {
        System.out.println("You chose: " + choiceToString(playerChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        if (playerChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((playerChoice == 1 && computerChoice == 3) ||
                (playerChoice == 2 && computerChoice == 1) ||
                (playerChoice == 3 && computerChoice == 2)) {
            System.out.println("You win this round!");
        } else {
            System.out.println("Computer wins this round.");
        }
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
