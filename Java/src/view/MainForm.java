package view;

import javax.swing.*;

public class MainForm {

    private JFrame form = new JFrame("JavaBoard");
    private JPanel panel = new JPanel();

    private Field[][] board = new Field[8][];

    public MainForm() {

        FormSettings();
        CreateFields();

        form.add(panel);
    }

    private void FormSettings()
    {
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.pack();
        form.setSize(950, 950);
        form.setVisible(true);
    }

    private void CreateFields()
    {
        for (int x = 0; x < 8; x++)
        {
            board[x] = new Field[8];

            for (int y = 0; y < 8; y++)
            {
                Field field = new Field(x, y, form);

                board[x][y] = field; 
                panel.add(field);              
            }
        }
    }
}