using System.Windows.Forms;

class MainForm : Form
{
    private Button[,] board = new Button[8,8];

    public MainForm()
    {
        FormSettings();
        CreateFields();
    }

    private void FormSettings()
    {
        base.Width = 820;
        base.Height = 820;
    }

    private void CreateFields()
    {
        for (int x = 0; x < 8; x++)
            for (int y = 0; y < 8; y++)
            {
                var field = new Field(x, y);
                board[x, y] = field; 
                base.Controls.Add(field);
            }
    }
}
