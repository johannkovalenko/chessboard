package view.interim;

import model.*;

public class Methods {
    public static String getFigureText(Figure figure, Color color) {
        return Color(color) + "\r\n" + Figure(figure);
    }

    private static String Figure(Figure figure) {
        switch (figure) {
            case KING:
                return "Krol";
            case QUEEN:
                return "Hetman";
            case ROOK:
                return "Wieza";
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

    private static String Color(Color color) {
        switch (color) {
            case WHITE:
                return "Bia";
            case BLACK:
                return "Cza";
            default:
                return "";
        }
    }
}
