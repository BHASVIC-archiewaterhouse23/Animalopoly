import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPlayers;

        System.out.println("Welcome to Monopoly!");
        System.out.print("Enter number of players: ");
        numPlayers = scanner.nextInt();

        MonopolyBoard game = new MonopolyBoard(numPlayers);

        while (!game.isGameOver()) {
            for (int i = 0; i < numPlayers; i++) {
                System.out.println("\nPlayer " + (i + 1) + "'s turn.");
                System.out.print("Press Enter to roll the dice...");
                scanner.nextLine(); // Consume newline
                scanner.nextLine(); // Wait for Enter
                int roll = game.rollDice();
                System.out.println("You rolled a " + roll);

                game.movePlayer(i, roll);
                System.out.println("Player " + (i + 1) + " is now on " + game.getCurrentPosition(i));
            }
        }
    }
}
