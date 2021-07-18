package model.legalmoves;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;
import model.*;

public class Queen extends LegalMoves {
    public Queen(Field[][] field) {
        super(field);
    }

    public List<Point> Calculate(int x, int y, Color color) {
        List<Point> points = new ArrayList<Point>();

        super.upRight(points, x, y, color);
        super.upLeft(points, x, y, color);
        super.downRight(points, x, y, color);
        super.downLeft(points, x, y, color);
        super.up(points, x, y, color);
        super.down(points, x, y, color);
        super.left(points, x, y, color);
        super.right(points, x, y, color);

        return points;
    }


}