import java.util.ArrayList;

public class Game {
    private Board board;
    private final ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    /**
     * getter and setter.
     */
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * movePiece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            if (board.getAt(x, y) == null) {
                moveHistory.add(new Move(piece.getCoordinatesX(),
                        x, piece.getCoordinatesY(),
                        y, piece));
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(),
                        x, piece.getCoordinatesY(),
                        y, piece, board.getAt(x, y)));
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }
}
