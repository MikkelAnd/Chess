package itu.miand.chess.engine.piece;

import itu.miand.chess.engine.Alliance;
import itu.miand.chess.engine.board.Board;
import itu.miand.chess.engine.board.Move;

import java.util.List;

/**
 * Created by Mikkel Andersen on 2/25/2017.
 */
public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }

    public abstract List<Move> calculateLegalMoves(final Board board);

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }
}
