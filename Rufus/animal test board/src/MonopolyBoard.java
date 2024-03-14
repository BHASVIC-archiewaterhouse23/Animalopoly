import java.util.Scanner;

public class MonopolyBoard {
    // Represents the board cells
    private static final String[] BOARD = {
            "GO", "A1", "Community Chest", "A2", "Income Tax", "B1", "Chance", "B2", "B3",
            "Jail", "C1", "Utility", "C2", "C3", "Community Chest", "C4", "D1", "Chance",
            "D2", "D3", "Free Parking", "E1", "Community Chest", "E2", "E3", "Railroad",
            "F1", "Chance", "F2", "F3", "Jail", "G1", "G2", "Utility", "G3", "Community Chest",
            "H1", "Chance", "H2", "Luxury Tax", "H3", "Railroad"
    };

    private int[] playerPositions;
    private int numPlayers;

    public MonopolyBoard(int numPlayers) {
        this.numPlayers = numPlayers;
        this.playerPositions = new int[numPlayers];
    }

    // Simulate rolling dice
    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Move player on the board
    public void movePlayer(int player, int steps) {
        playerPositions[player] = (playerPositions[player] + steps) % BOARD.length;
    }

    // Get current position of a player
    public String getCurrentPosition(int player) {
        return BOARD[playerPositions[player]];
    }

    // Check if the game is over
    public boolean isGameOver() {
        // In a simplified version, the game is over after a certain number of turns
        // Change the condition as per your requirement
        int maxTurns = 20; // Change this value as needed
        int totalTurns = numPlayers * maxTurns; // Assuming each player takes a turn in a round-robin manner
        int currentTurns = 0;
        for (int pos : playerPositions) {
            if (pos == BOARD.length - 1) {
                return true; // If any player reaches the last cell, the game is over
            }
        }
        return currentTurns >= totalTurns;
    }
}

