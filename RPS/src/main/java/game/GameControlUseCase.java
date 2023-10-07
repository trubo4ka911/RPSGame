package game;

public class GameControlUseCase {
    public static boolean playAnotherGame(GameLogic gameLogic) {
        String playAgain;
        do {
            System.out.println("Do you want to play another game? (yes/no):");
            playAgain = gameLogic.getUserInput().toLowerCase();
        } while (!playAgain.equals("yes") && !playAgain.equals("no"));
        return playAgain.equals("yes");
    }

    public static boolean playAnotherRound(GameLogic gameLogic) {
        String playAgain;
        do {
            System.out.println("Do you want to play another round? (yes/no):");
            playAgain = gameLogic.getUserInput().toLowerCase();
        } while (!playAgain.equals("yes") && !playAgain.equals("no"));
        return playAgain.equals("yes");
    }
}
