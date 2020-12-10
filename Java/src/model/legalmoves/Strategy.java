package model.legalmoves;

import java.util.*;

import model.*;

public class Strategy {
    private Map<String, LegalMoves> strategies = new HashMap<String, LegalMoves>();

    public Strategy(Field[][] board) {
        strategies.put("pawn", new Pawn(board));
    }

    public LegalMoves get(Figure figure) {
        switch (figure) {
            case PAWN:
                return strategies.get("pawn");
            default:
                return null;
        }
    }
}