package model.legalmoves;

import java.util.*;
import model.*;

public abstract class LegalMoves {
    protected Field[][] board;
    
    protected LegalMoves(Field[][] board)
    {
        this.board = board;
    }

    public abstract List<java.awt.Point> Calculate(int x, int y, Color color);
}