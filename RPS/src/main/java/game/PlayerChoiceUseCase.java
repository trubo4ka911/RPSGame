package game;

public class PlayerChoiceUseCase {
    public static int getPlayerChoice(GameLogic gameLogic) {
        int playerChoice;
        do {
            playerChoice = gameLogic.getUserChoice();
        } while (playerChoice < 1 || playerChoice > 3);
        return playerChoice;
    }
}
