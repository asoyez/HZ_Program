// SimpleMoveCommand.java
public class SimpleMoveCommand implements MoveCommand {
    private CheckersBoard board;
    private int fromRow, fromCol, toRow, toCol;

    public SimpleMoveCommand(CheckersBoard board, int fromRow, int fromCol, int toRow, int toCol) {
        this.board = board;
        this.fromRow = fromRow;
        this.fromCol = fromCol;
        this.toRow = toRow;
        this.toCol = toCol;
    }

    @Override
    public void execute() {

        board.getBoard()[toRow][toCol].addPiece(board.getBoard()[fromRow][fromCol].getPieces().remove(0));
    }
}
