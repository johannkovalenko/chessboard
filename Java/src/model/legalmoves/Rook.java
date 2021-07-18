package model.legalmoves;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;
import model.*;

public class Rook extends LegalMoves {
    public Rook(Field[][] field) {
        super(field);
    }

    public List<Point> Calculate(int x, int y, Color color) {
        List<Point> points = new ArrayList<Point>();

        super.up(points, x, y, color);
        super.down(points, x, y, color);
        super.left(points, x, y, color);
        super.right(points, x, y, color);

        return points;
    }


}