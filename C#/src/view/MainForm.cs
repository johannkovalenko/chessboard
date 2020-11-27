using System.Windows.Forms;

class MainForm
{
    private Form form = new Form();

    private Field[,] board = new Field[8,8];

    public MainForm()
    {
        FormSettings();
        CreateFields();
    }

    private void FormSettings()
    {
        form.Width = 820;
        form.Height = 820;
    }

    private void CreateFields()
    {
        for (int x = 0; x < 8; x++)
            for (int y = 0; y < 8; y++)
            {
                var field = new Field(x, y);
                board[x, y] = field; 
                form.Controls.Add(field);
            }
    }
}
