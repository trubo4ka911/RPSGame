package game;

import java.util.Random;

public class ComputerPlayer {
    private final Random random;

    public ComputerPlayer() {
        random = new Random();
    }

    public int generateChoice() {
        // Generate a random choice for the computer (1 for Rock, 2 for Paper, 3 for Scissors)
        return random.nextInt(3) + 1;
    }
}
