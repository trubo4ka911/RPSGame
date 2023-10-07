package game;

import java.util.Scanner;

public class Player {
    public int makeChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 1 || choice > 3) {
            System.out.println("Choose (1) Rock, (2) Paper, or (3) Scissors:");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }

        return choice;
    }
}
