package model;

public class Board {
    private Field[][] board;

    public Board() {
        generate();
        fill();
    }

    public String INTERIMReturnFigureDescription(int x, int y) {
        return model.interim.Methods.getFigureText(x, y, board);
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
    }
}