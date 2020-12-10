package controller;

import java.util.List;
import java.awt.Point;

import view.*;
import model.*;

public class Controller {
    private view.Board viewBoard;
    private model.Board modelBoard;

    private Stage stage = Stage.FIRSTCLICK;
    List<Point> legalMoves;
    Point firstClick;

    public Controller (view.Board viewBoard, model.Board modelBoard) {
        this.viewBoard = viewBoard;
        this.modelBoard = modelBoard;
    }

    public void initializeBoard() {
        for (int x=0; x<8; x++)
            for (int y=0; y<8; y++) {
                Figure figure   = modelBoard.GetFigure(x, y);
                Color color     = modelBoard.GetColor(x, y);

                viewBoard.setFigure(x, y, figure, color);
            }
    }

    public void OnClick(int x, int y)
    {              
        switch (stage)
        {
            case FIRSTCLICK:
                if (modelBoard.GetFigure(x, y) == Figure.NOFIGURE)
                    return;

                firstClick = new Point(x, y);

                legalMoves = modelBoard.legalMoves(x, y);

                for (Point point : legalMoves)
                    viewBoard.setLegalMovesBackground(point.x, point.y);

                stage = Stage.SECONDCLICK;
                
                return;

            case SECONDCLICK:
                if (x == firstClick.x && y == firstClick.y)
                {
                    System.out.println("Same point");
                    setStandardBackground();
                    stage = Stage.FIRSTCLICK;
                    return;
                }
                else {
                    for (Point point : legalMoves)
                        if (point.x == x && point.y == y) {
                            Figure figure   = modelBoard.GetFigure(firstClick.x, firstClick.y);
                            Color color     = modelBoard.GetColor(firstClick.x, firstClick.y);

                            modelBoard.setAndReset(firstClick.x, firstClick.y, x, y);
                            
                            viewBoard.setFigure(x, y, figure, color);
                            
                            viewBoard.reset(firstClick.x, firstClick.y);
                            setStandardBackground();
                            stage = Stage.FIRSTCLICK;
                            return;
                        }
                }

                System.out.println("Illegal move");
                
                return;
        }
    }

    private void setStandardBackground()
    {
        for (Point point : legalMoves)
            viewBoard.setStandardBackground(point.x, point.y);
    }
}