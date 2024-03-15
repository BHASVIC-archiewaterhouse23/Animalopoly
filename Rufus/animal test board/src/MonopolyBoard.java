import java.util.Scanner;

public class MonopolyBoard {
    // Represents the board cells
    private static final String[] BOARD = {
            "Start", "caseoh earthsized hippo ", "jeffery epstein bullet ant", "stephen hawking sloth", "nitroglycerine", "dog", "bent neck giraffe", "shark which cant swim", "bird without wings",
            "flopper", "golden flopper", "stewie griffin", "RTX 4090", "miss a turn", "pig stressball", "malaysia airlines flight 370", "Kenneth Copeland", "Oceangate Sub",
            "ted kacynzski", "the aye-aye", "mort", "paul tierney", "cat", "yersinia pestis germ", "Alexander Fleming", "the magna carta"
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

