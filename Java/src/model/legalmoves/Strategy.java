package model.legalmoves;

import java.util.*;

import model.*;

public class Strategy {
    private Map<String, LegalMoves> strategies = new HashMap<String, LegalMoves>();

    public Strategy() {
        strategies.put("pawn", new Pawn());
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