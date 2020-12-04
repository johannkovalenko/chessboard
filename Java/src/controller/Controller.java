package controller;

import java.util.*;

import view.*;
import model.*;

public class Controller {
    private view.Board viewBoard;
    private model.Board modelBoard;

    private Stage stage = Stage.FIRSTCLICK;

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
        List<java.awt.Point> legalMoves = modelBoard.LegalMoves(x, y);
        switch (stage)
        {
            case NOTCLICKED:

                break;
            case FIRSTCLICK:
                
                break;

            case SECONDCLICK:

                break;
        }
    }
}