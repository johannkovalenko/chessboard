package model;

import java.util.List;
import java.awt.Point;
import model.legalmoves.*;

import model.generate.*;

public class Board {
    private Field[][] board = new Field[8][];
    private Strategy strategy = new Strategy(board);

    public Board() {
        new Generate().run(board);
    }

    public Figure GetFigure(int x, int y) {
        return board[x][y].figure;
    }

    public Color GetColor(int x, int y) {
        return board[x][y].color;
    }

    public List<Point> legalMoves(int x, int y) {
        LegalMoves legalMoves = strategy.get(board[x][y].figure);
        return legalMoves.Calculate(x, y, board[x][y].color);
    }

    public void setAndReset(int oldX, int oldY, int newX, int newY) {
        board[newX][newY].color = board[oldX][oldY].color;
        board[newX][newY].figure = board[oldX][oldY].figure;
        board[newX][newY].hasMoved = true;
        
        board[oldX][oldY].color = Color.NOCOLOR;
        board[oldX][oldY].figure = Figure.NOFIGURE;
        board[oldX][oldY].hasMoved = false;
    }
}