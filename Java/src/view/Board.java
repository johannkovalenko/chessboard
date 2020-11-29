package view;

import javax.swing.*;

public class Board {
    private JFrame frame = new JFrame("JavaBoard");
    private JPanel panel = new JPanel();

    private Field[][] board = new Field[8][];

    public Board() {
        frameSettings();
        createFields();

        frame.add(panel);
    }

    public void setFigureText(int x, int y, String text) {
        board[x][y].setText(text);
    }

    private void createFields() {
        for (int x = 0; x < 8; x++)
        {
            board[x] = new Field[8];

            for (int y = 0; y < 8; y++)
            {
                Field field = new Field(x, y, frame);

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