import javax.swing.*;

import model.*;   
import controller.*;

public class Form implements Runnable {
    private view.Board viewBoard;
    private model.Board modelBoard;

    private Controller controller;

    public void run() {        
        viewBoard   = new view.Board(controller);
        modelBoard  = new model.Board();
        controller  = new Controller(viewBoard, modelBoard);

        controller.initializeBoard();
    }
}