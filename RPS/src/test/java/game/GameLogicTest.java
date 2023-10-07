package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameLogicTest {
    @Test
    public void testPlayRound_Draw() {
        GameLogic gameLogic = new GameLogic();
        assertEquals("You chose: Rock\nComputer chose: Rock\nIt's a draw!", gameLogic.playRound(1, 1));
    }

    @Test
    public void testPlayRound_PlayerWins() {
        GameLogic gameLogic = new GameLogic();
        assertEquals("You chose: Rock\nComputer chose: Scissors\nYou win this round!", gameLogic.playRound(1, 3));
    }

    @Test
    public void testPlayRound_ComputerWins() {
        GameLogic gameLogic = new GameLogic();
        assertEquals("You chose: Paper\nComputer chose: Rock\nYou win this round!", gameLogic.playRound(2, 1));
    }


}
