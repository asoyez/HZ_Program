import java.util.Scanner;

public class CheckersGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckersBoard board = new CheckersBoard();

        while (!board.isGameOver()) {
            board.printBoard();
            System.out.println("Current Player: " + board.getCurrentPlayer());

            // Get input for move
            System.out.print("Enter move (e.g., 'a2 b3'): ");
            String moveInput = scanner.nextLine();

            // Make the move
            if (!board.makeMove(moveInput)) {
                System.out.println("Invalid move. Try again.");
            }
        }

        // Game over, print result
        System.out.println("Game over! Winner: " + board.getWinner());
        scanner.close();
    }
}
