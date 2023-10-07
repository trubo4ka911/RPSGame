package game;

public class GameLogicUseCase {
    public static void updateScores(int playerChoice, int computerChoice, Scores scores) {
        if (playerChoice != computerChoice) {
            if ((playerChoice == 1 && computerChoice == 3) ||
                    (playerChoice == 2 && computerChoice == 1) ||
                    (playerChoice == 3 && computerChoice == 2)) {
                scores.incrementPlayerScore();
            } else {
                scores.incrementComputerScore();
            }
        }
    }

    public static void displayScores(Scores scores) {
        System.out.println("Player Score: " + scores.getPlayerScore());
        System.out.println("Computer Score: " + scores.getComputerScore());
    }

}