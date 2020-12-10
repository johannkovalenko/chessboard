package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import controller.*;

class Field extends JButton
{
    private int x;
    private int y;
    private Color defaultBackgroundColor;

    private Controller controller;
    
    public Field(int x, int y, Controller controller)
    {
        this.x = x;
        this.y = y;
        this.controller = controller;
        this.defaultBackgroundColor = getBackgroundColor();

        super.setBounds(x * 100, y * 100, 100, 100);
        super.setBackground(defaultBackgroundColor);
        super.setPreferredSize(new java.awt.Dimension(100, 100));
        super.setForeground(GetTextColor());

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.OnClick(x, y);
            }
        };

        super.addActionListener(actionListener);
    }

    public void set(String text) {
        super.setText(text);
        super.setForeground(GetTextColor());
    }

    public void setStandardBackground() {
        super.setBackground(defaultBackgroundColor);
    }

    private Color getBackgroundColor() {
        Color beige = new Color(252, 204, 116);
        Color brown = new Color(87, 58, 46);

        if (x % 2 == 0)
            return y % 2 == 0 ? beige : brown;
        else
            return y % 2 == 0 ? brown : beige;
    }

    private Color GetTextColor() {
        if (x % 2 == 0)
            return y % 2 == 0 ? Color.BLACK : Color.WHITE;
        else
            return y % 2 == 0 ? Color.WHITE : Color.BLACK;
    }
}