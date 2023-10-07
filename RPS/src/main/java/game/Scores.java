package game;

public class Scores {
    private int playerScore;
    private int computerScore;

    public Scores() {
        playerScore = 0;
        computerScore = 0;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void incrementPlayerScore() {
        playerScore++;
    }

    public void incrementComputerScore() {
        computerScore++;
    }
}