package model;

import java.util.*;
import model.legalmoves.*;

import model.generate.*;

public class Board {
    private Field[][] board = new Field[8][];
    private Strategy strategy = new Strategy();

    public Board() {
        new Generate().run(board);
    }

    public Figure GetFigure(int x, int y) {
        return board[x][y].figure;
    }

    public Color GetColor(int x, int y) {
        return board[x][y].color;
    }

    public List<java.awt.Point> LegalMoves(int x, int y)
    {
        LegalMoves legalMoves = strategy.get(board[x][y].figure);
        return legalMoves.Calculate(x, y, board[x][y].color);
    }


}