// CheckersBoard.java
public class CheckersBoard {
    private CheckersSquare[][] board;
    private String currentPlayer;

    public CheckersBoard() {
        initializeBoard();
        currentPlayer = "Player1";
    }

    private void initializeBoard() {
        // Initialize the board with squares
        board = new CheckersSquare[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = new CheckersSquare();
            }
        }

        // Set up Player1's pieces
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 != 0) {
                    board[row][col].addPiece(CheckersPieceFactory.createPiece('P'));
                }
            }
        }

        // Set up Player2's pieces
        for (int row = 5; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 != 0) {
                    board[row][col].addPiece(CheckersPieceFactory.createPiece('O'));
                }
            }
        }
    }

    public void printBoard() {
        // Print the current state of the board
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 8; j++) {
                char symbol = (board[i][j].isEmpty()) ? '_' : board[i][j].getPieces().get(0).getSymbol();
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(String move) {
        // Validate if the move is in the correct format
        if (!move.matches("[a-h][1-8] [a-h][1-8]")) {
            return false;
        }

        // Split the move into fromPosition and toPosition
        String[] positions = move.split(" ");
        String fromPosition = positions[0];
        String toPosition = positions[1];

        // Convert positions to array indices
        int fromRow = Integer.parseInt(fromPosition.substring(1)) - 1;
        int fromCol = fromPosition.charAt(0) - 'a';
        int toRow = Integer.parseInt(toPosition.substring(1)) - 1;
        int toCol = toPosition.charAt(0) - 'a';

        // Check if the move is within the bounds of the board
        if (fromRow < 0 || fromRow >= 8 || fromCol < 0 || fromCol >= 8 ||
                toRow < 0 || toRow >= 8 || toCol < 0 || toCol >= 8) {
            return false;
        }

        // Implement more detailed move validation logic here
        // For simplicity, we assume all moves are valid in this example
        return true;
    }

    public boolean makeMove(String move) {
        // Validate the move
        if (!isValidMove(move)) {
            return false;
        }

        // Split the move into fromPosition and toPosition
        String[] positions = move.split(" ");
        String fromPosition = positions[0];
        String toPosition = positions[1];

        // Convert positions to array indices
        int fromRow = Integer.parseInt(fromPosition.substring(1)) - 1;
        int fromCol = fromPosition.charAt(0) - 'a';
        int toRow = Integer.parseInt(toPosition.substring(1)) - 1;
        int toCol = toPosition.charAt(0) - 'a';

        // Check if there is a piece at the fromPosition
        if (board[fromRow][fromCol].isEmpty()) {
            return false;
        }

        // Check if the piece belongs to the current player
        char currentPlayerPiece = (currentPlayer.equals("Player1")) ? 'P' : 'O';
        if (board[fromRow][fromCol].getPieces().get(0).getSymbol() != currentPlayerPiece) {
            return false;
        }

        // Implement actual move logic here
        board[toRow][toCol].addPiece(board[fromRow][fromCol].getPieces().remove(0));

        // Update the player turn
        currentPlayer = (currentPlayer.equals("Player1")) ? "Player2" : "Player1";

        return true;
    }

    public boolean isGameOver() {
        // Implement code to check if the game is over
        // For now, always return false (game never ends)
        return false;
    }

    public String getCurrentPlayer() {
        // Return the current player
        return currentPlayer;
    }

    public String getWinner() {
        // Implement code to determine the winner
        // For now, always return "No winner" (game never ends)
        return "No winner";
    }

    // Add new getter for board
    public CheckersSquare[][] getBoard() {
        return board;
    }
}
