package model.legalmoves;

import java.util.*;

import model.*;

public class Strategy {
    private LegalMoves pawn, bishop, queen, rook;

    public Strategy(Field[][] board) {
        pawn    = new Pawn(board);
        bishop  = new Bishop(board);
        queen   = new Queen(board);
        rook    = new Rook(board);
    }

    public LegalMoves get(Figure figure) {
        switch (figure) {
            case PAWN:
                return pawn;
            case BISHOP:
                return bishop;
            case QUEEN:
                return queen;
            case ROOK:
                return rook;
            default:
                return null;
        }
    }
}