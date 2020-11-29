package controller;

import view.*;
import model.*;

public class Controller {
    private view.Board viewBoard;
    private model.Board modelBoard;

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
}