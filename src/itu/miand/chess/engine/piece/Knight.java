package itu.miand.chess.engine.piece;

import com.google.common.collect.ImmutableList;
import itu.miand.chess.engine.Alliance;
import itu.miand.chess.engine.board.Board;
import itu.miand.chess.engine.board.Move;
import itu.miand.chess.engine.board.Tile;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mikkel Andersen on 2/25/2017.
 */
public class Knight extends Piece {

    private final static int[] CANDIDATE_MOVE_COORDINATES = {-17, -15, -10, -6, 6, 10, 15, 17};

    Knight(final int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) {

        int candidateDestinationCoordinate;
        final List<Move> legalMoves = new ArrayList<>();

        for (final int currentCandidate : CANDIDATE_MOVE_COORDINATES) {

            candidateDestinationCoordinate = this.piecePosition + currentCandidate;
            if (true /* is a validTileCoordinate()*/ ) {
                final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

                if (!candidateDestinationTile.isTileOccupied()) {
                    legalMoves.add(new Move());

                } else {

                    final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();

                    if (this.pieceAlliance != pieceAlliance) {
                        legalMoves.add(new Move());
                    }
                }
            }
        }

        return ImmutableList.copyOf(legalMoves);
    }
}
