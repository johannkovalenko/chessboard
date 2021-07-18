package model.legalmoves;

import java.util.List;
import java.util.ArrayList;
import java.awt.Point;
import model.*;

public abstract class LegalMoves {
    protected Field[][] board;
    
    protected LegalMoves(Field[][] board){
        this.board = board;
    }

    public abstract List<Point> Calculate(int x, int y, Color color);

    protected void upRight(List<Point> points, int x, int y, Color color) {
        while (x > 0 && y < 7) {
            x--;
            y++;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void upLeft(List<Point> points, int x, int y, Color color) {
        while (x > 0 && y > 0) {
            x--;
            y--;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void downRight(List<Point> points, int x, int y, Color color) {
        while (x < 7 && y < 7) {
            x++;
            y++;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void downLeft(List<Point> points, int x, int y, Color color) {
        while (x < 7 && y > 0) {
            x++;
            y--;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void up(List<Point> points, int x, int y, Color color) {
        while (x > 0) {
            x--;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void down(List<Point> points, int x, int y, Color color) {
        while (x < 7) {
            x++;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void left(List<Point> points, int x, int y, Color color) {
        while (y > 0) {
            y--;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    protected void right(List<Point> points, int x, int y, Color color) {
        while (y < 7) {
            y++;

            if (!check(points, x, y, color))
                return;              
        }    
    }

    private Boolean check(List<Point> points, int x, int y, Color color) {
        if (board[x][y].color == Color.NOCOLOR) {
            points.add(new Point(x, y));
            return true;
        }
        else if (color == Color.BLACK && board[x][y].color == Color.WHITE) {
            points.add(new Point(x, y));
            return false;
        }
        else if (color == Color.WHITE && board[x][y].color == Color.BLACK) {
            points.add(new Point(x, y));  
        }
        
        return false;
    }
}