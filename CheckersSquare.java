// CheckersSquare.java
import java.util.ArrayList;
import java.util.List;

public class CheckersSquare {
    private List<CheckersPiece> pieces;

    public CheckersSquare() {
        this.pieces = new ArrayList<>();
    }

    public void addPiece(CheckersPiece piece) {
        pieces.add(piece);
    }

    public void removePiece(CheckersPiece piece) {
        pieces.remove(piece);
    }

    public List<CheckersPiece> getPieces() {
        return pieces;
    }

    public boolean isEmpty() {
        return pieces.isEmpty();
    }
}
