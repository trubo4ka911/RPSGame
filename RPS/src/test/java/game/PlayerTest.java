package game;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testMakeChoice_ValidInput() {
        // Simulate user input "2" (for Paper) using a ByteArrayInputStream
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Player player = new Player();
        int choice = player.makeChoice();

        // Reset System.in to the standard input stream
        System.setIn(System.in);

        // Check if the choice is 2 (Paper)
        assertEquals(2, choice);
    }

    @Test
    public void testMakeChoice_InvalidInputThenValidInput() {
        // Simulate user input "4" (invalid), then "3" (for Scissors)
        String input = "4\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Player player = new Player();
        int choice = player.makeChoice();

        // Reset System.in to the standard input stream
        System.setIn(System.in);

        // Check if the choice is 3 (Scissors)
        assertEquals(3, choice);
    }
}
