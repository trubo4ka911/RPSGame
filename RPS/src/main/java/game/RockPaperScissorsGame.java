package game;

public class RockPaperScissorsGame {
    public RockPaperScissorsGame(Player player, ComputerPlayer computer) {
    }

    public static void start(Player player, ComputerPlayer computer, GameLogic gameLogic, Scores scores) {
        int playerScore = 0; // Declare playerScore
        int computerScore = 0; // Declare computerScore

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            playSingleGame(player, computer, gameLogic, playerScore, computerScore, scores);
            GameLogicUseCase.displayScores(scores);

            if (!GameControlUseCase.playAnotherGame(gameLogic)) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
    }

    private static void playSingleGame(Player player, ComputerPlayer computer, GameLogic gameLogic,
                                       int playerScore, int computerScore, Scores scores) {
        while (true) {
            int playerChoice = PlayerChoiceUseCase.getPlayerChoice(gameLogic);
            int computerChoice = computer.generateChoice();

            String result = gameLogic.playRound(playerChoice, computerChoice);
            System.out.println(result);

            GameLogicUseCase.updateScores(playerChoice, computerChoice, scores);
            GameLogicUseCase.displayScores(scores);

            if (!GameControlUseCase.playAnotherRound(gameLogic)) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Player player = new Player();
        ComputerPlayer computer = new ComputerPlayer();
        GameLogic gameLogic = new GameLogic();
        Scores scores = new Scores();

        start(player, computer, gameLogic, scores);
    }
}