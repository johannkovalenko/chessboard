package model.legalmoves;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;
import model.*;

public class Pawn extends LegalMoves {
    public Pawn(Field[][] field) {
        super(field);
    }

    public List<Point> Calculate(int x, int y, Color color) {
        List<Point> points = new ArrayList<Point>();

        switch (color) {
            case WHITE:
                white(points, x, y);
                return points;
            case BLACK:
                black(points, x, y);
                return points;
            default: 
                return points;
        }
    }

    private void white(List<Point> points, int x, int y) {
        if (super.board[x - 1][y].color == Color.NOCOLOR)
            points.add(new Point(x - 1, y));

        if (y > 0)
            if (super.board[x - 1][y - 1].color == Color.BLACK)
                points.add(new Point(x - 1, y - 1));

        if (y < 7)
            if (super.board[x - 1][y + 1].color == Color.BLACK)
                points.add(new Point(x - 1, y + 1));

        if (x == 6)
            if (super.board[x - 2][y].color == Color.NOCOLOR)
                points.add(new Point(x - 2, y));
    }

    private void black(List<Point> points, int x, int y) {
        //if 
    }
}