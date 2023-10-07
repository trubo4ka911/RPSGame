package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        ComputerPlayer computer = new ComputerPlayer();
        GameLogic gameLogic = new GameLogic();
        Scores scores = new Scores();

        RockPaperScissorsGame.start(player, computer, gameLogic, scores);
    }
}