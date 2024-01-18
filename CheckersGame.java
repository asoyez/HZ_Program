// CheckersGame.java
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

            // Parse move and create command
            MoveCommand moveCommand = parseMove(moveInput, board);

            // Execute the move command
            if (moveCommand != null) {
                moveCommand.execute();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        // Game over, print result
        System.out.println("Game over! Winner: " + board.getWinner());
        scanner.close();
    }

    private static MoveCommand parseMove(String move, CheckersBoard board) {
        if (!board.isValidMove(move)) {
            return null;
        }

        // Convert positions to array indices
        int fromRow = Integer.parseInt(move.substring(1, 2)) - 1;
        int fromCol = move.charAt(0) - 'a';
        int toRow = Integer.parseInt(move.substring(4, 5)) - 1;
        int toCol = move.charAt(3) - 'a';

        return new SimpleMoveCommand(board, fromRow, fromCol, toRow, toCol);
    }
}
