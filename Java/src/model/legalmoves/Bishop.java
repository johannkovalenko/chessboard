package model.legalmoves;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;
import model.*;

public class Bishop extends LegalMoves {
    public Bishop(Field[][] field) {
        super(field);
    }

    public List<Point> Calculate(int x, int y, Color color) {
        List<Point> points = new ArrayList<Point>();

        super.upRight(points, x, y, color);
        super.upLeft(points, x, y, color);
        super.downRight(points, x, y, color);
        super.downLeft(points, x, y, color);

        return points;
    }


}