import java.util.Scanner;

public class RockPaperScissorsGame {
    private int playerScore;
    private int computerScore;
    private final GameLogic gameLogic;
    private final Scanner scanner;

    public RockPaperScissorsGame() {
        playerScore = 0;
        computerScore = 0;
        gameLogic = new GameLogic();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            playSingleGame();

            System.out.println("Player Score: " + playerScore);
            System.out.println("Computer Score: " + computerScore);

            String playAgain;
            do {
                System.out.println("Do you want to play another game? (yes/no):");
                playAgain = scanner.next().toLowerCase();
            } while (!playAgain.equals("yes") && !playAgain.equals("no"));

            if (playAgain.equals("no")) {
                break;
            }

            // Reset scores for a new game
            playerScore = 0;
            computerScore = 0;
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private void playSingleGame() {
        while (true) {
            int playerChoice;
            do {
                playerChoice = gameLogic.getUserChoice();
            } while (playerChoice < 1 || playerChoice > 3);

            int computerChoice = gameLogic.generateComputerChoice();

            gameLogic.playRound(playerChoice, computerChoice);

            if (playerChoice != computerChoice) {
                if ((playerChoice == 1 && computerChoice == 3) ||
                        (playerChoice == 2 && computerChoice == 1) ||
                        (playerChoice == 3 && computerChoice == 2)) {
                    playerScore++;
                } else computerScore++;
            }

            System.out.println("Player Score: " + playerScore);
            System.out.println("Computer Score: " + computerScore);

            String playAgain;
            do {
                System.out.println("Do you want to play another round? (yes/no):");
                playAgain = scanner.next().toLowerCase();
            } while (!playAgain.equals("yes") && !playAgain.equals("no"));

            if (playAgain.equals("no")) {
                break;
            }
        }

        gameLogic.declareOverallWinner(playerScore, computerScore);
    }
}
