package view;

import javax.swing.*;
import model.*;
import controller.*;

public class Board implements Runnable{
    private JFrame frame = new JFrame("Chess Board");
    private JPanel panel = new JPanel();

    private Controller controller;

    private Field[][] board = new Field[8][];
    private model.Board modelBoard = new model.Board();

    public void run() {

        controller  = new Controller(this, modelBoard);

        frameSettings();
        createFields();

        controller.initializeBoard();

        frame.add(panel);
    }

    public void setFigure(int x, int y, Figure figure, Color color) {
        board[x][y].setText(view.interim.Methods.getFigureText(figure, color));
    }

    private void createFields() {
        for (int x = 0; x < 8; x++)
        {
            board[x] = new Field[8];

            for (int y = 0; y < 8; y++)
            {
                Field field = new Field(x, y, controller);

                board[x][y] = field; 
                panel.add(field);              
            }
        }
    }

    private void frameSettings() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(950, 950);
        frame.setVisible(true);
    }
}