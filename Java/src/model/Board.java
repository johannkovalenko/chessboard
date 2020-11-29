package model;

public class Board {
    private Field[][] board;

    public Board() {
        generate();
        fill();
    }

    public Figure GetFigure(int x, int y) {
        return board[x][y].figure;
    }

    public Color GetColor(int x, int y) {
        return board[x][y].color;
    }

    private void generate() {
        board = new Field[8][];
        
        for (int x = 0; x < 8; x++)
        {
            board[x] = new Field[8];

            for (int y = 0; y < 8; y++)
                board[x][y] = new Field();
        }
    }

    private void fill() {
        for (int y=0; y<8; y++)
        {
            board[1][y].figure = Figure.PAWN;
            board[1][y].color = Color.BLACK;

            board[6][y].figure = Figure.PAWN;
            board[6][y].color = Color.WHITE;
        }  

        board[0][0].figure = Figure.ROOK;
        board[0][0].color = Color.BLACK;

        board[0][7].figure = Figure.ROOK;
        board[0][7].color = Color.BLACK;            
    }
}