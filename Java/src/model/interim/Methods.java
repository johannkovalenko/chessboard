package model.interim;

import model.*;

public class Methods {
    public static String getFigureText(int x, int y, Field[][] board) {
        return Color(x, y, board) + "\r\n" + Figure(x, y, board);
    }

    private static String Figure(int x, int y, Field[][] board) {
        switch (board[x][y].figure) {
            case KING:
                return "Król";
            case QUEEN:
                return "Hetman";
            case ROOK:
                return "Wieża";
            case BISHOP:
                return "Goniec";
            case KNIGHT:
                return "Skoczek";
            case PAWN:
                return "Pion";
            default:
                return "";
        }

    }

    private static String Color(int x, int y, Field[][] board) {
        switch (board[x][y].color) {
            case WHITE:
                return "white";
            case BLACK:
                return "black";
            default:
                return "";
        }
    }
}
