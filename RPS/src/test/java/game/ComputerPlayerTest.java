package game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComputerPlayerTest {

    @Test
    public void testGenerateChoice() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        int choice = computerPlayer.generateChoice();

        // Check if the choice is within the valid range (1, 2, or 3)
        assertTrue(choice >= 1 && choice <= 3);
    }
}
