// CheckersSquare.java
import java.util.ArrayList;
import java.util.List;

public class CheckersSquare {
    private List<CheckersPiece> pieces;

    public CheckersSquare() {
        pieces = new ArrayList<>();
    }

    public List<CheckersPiece> getPieces() {
        return pieces;
    }

    public void addPiece(CheckersPiece piece) {
        pieces.add(piece);
    }

    public void removePiece(CheckersPiece piece) {
        pieces.remove(piece);
    }

    public boolean isEmpty() {
        return pieces.isEmpty();
    }
}


