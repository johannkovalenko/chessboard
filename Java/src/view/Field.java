package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

class Field extends JButton
{
    private int x;
    private int y;
    
    public Field(int x, int y, JFrame form)
    {
        this.x = x;
        this.y = y;

        super.setBounds(x * 100, y * 100, 100, 100);
        super.setBackground(GetBackgroundColor());
        super.setPreferredSize(new java.awt.Dimension(100, 100));
        super.setForeground(GetTextColor());

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OnClick(form);
            }
        };

        super.addActionListener(actionListener);
    }

    private Color GetBackgroundColor()
    {
        Color beige = new Color(252, 204, 116);
        Color brown = new Color(87, 58, 46);

        if (x % 2 == 0)
            return y % 2 == 0 ? beige : brown;
        else
            return y % 2 == 0 ? brown : beige;
    }

    private Color GetTextColor()
    {
        if (x % 2 == 0)
            return y % 2 == 0 ? Color.BLACK : Color.WHITE;
        else
            return y % 2 == 0 ? Color.WHITE : Color.BLACK;
    }

    private void OnClick(JFrame form)
    {
        JOptionPane.showMessageDialog(form, x + "   " + y);
    }
}