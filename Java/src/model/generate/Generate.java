package model.generate;

import model.*;

public class Generate {
    
    private Field[][] board;

    public void run(Field[][] board) {
        this.board = board;
        
        generate();
        fillPawns();
        fillRooks();
        fillBishops();
        fillKnights();
        fillQueens();
        fillKings();
    }

    private void generate() {
        for (int x = 0; x < 8; x++)
        {
            board[x] = new Field[8];

            for (int y = 0; y < 8; y++)
                board[x][y] = new Field();
        }
    }

    private void fillPawns() {
        for (int y=0; y<8; y++) {
            board[1][y].figure = Figure.PAWN;
            board[1][y].color = Color.BLACK;

            board[6][y].figure = Figure.PAWN;
            board[6][y].color = Color.WHITE;
        }  
    }

    private void fillRooks() {
        board[0][0].figure = Figure.ROOK;
        board[0][0].color = Color.BLACK;

        board[0][7].figure = Figure.ROOK;
        board[0][7].color = Color.BLACK; 

        board[7][0].figure = Figure.ROOK;
        board[7][0].color = Color.WHITE;

        board[7][7].figure = Figure.ROOK;
        board[7][7].color = Color.WHITE;  
    }

    private void fillBishops() {
        board[0][2].figure = Figure.BISHOP;
        board[0][2].color = Color.BLACK;

        board[0][5].figure = Figure.BISHOP;
        board[0][5].color = Color.BLACK; 

        board[7][2].figure = Figure.BISHOP;
        board[7][2].color = Color.WHITE;

        board[7][5].figure = Figure.BISHOP;
        board[7][5].color = Color.WHITE;  
    }

    private void fillKnights() {
        board[0][1].figure = Figure.KNIGHT;
        board[0][1].color = Color.BLACK;

        board[0][6].figure = Figure.KNIGHT;
        board[0][6].color = Color.BLACK; 

        board[7][1].figure = Figure.KNIGHT;
        board[7][1].color = Color.WHITE;

        board[7][6].figure = Figure.KNIGHT;
        board[7][6].color = Color.WHITE;  
    }

    private void fillQueens() {
        board[0][3].figure = Figure.QUEEN;
        board[0][3].color = Color.BLACK;

        board[7][3].figure = Figure.QUEEN;
        board[7][3].color = Color.WHITE; 
    }

    private void fillKings() {
        board[0][4].figure = Figure.KING;
        board[0][4].color = Color.BLACK;

        board[7][4].figure = Figure.KING;
        board[7][4].color = Color.WHITE; 
    }
}