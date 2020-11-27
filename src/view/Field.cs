using System.Windows.Forms;
using System.Drawing;
using System;

class Field : Button
{
    private int x;
    private int y;
    
    public Field(int x, int y)
    {
        this.x = x;
        this.y = y;

        base.BackColor = GetBackgroundColor();
        base.Width = 100;
        base.Height = 100;
        base.Location = new Point(x * 100, y * 100);

        base.Click += delegate(object sender, EventArgs e)
        {
            OnClick();
        };
    }

    private Color GetBackgroundColor()
    {
        if (x % 2 == 0)
            return y % 2 == 0 ? Color.Green : Color.Blue;
        else
            return y % 2 == 0 ? Color.Blue : Color.Green;
    }

    private void OnClick()
    {
        MessageBox.Show(x + "   " + y);
    }
}