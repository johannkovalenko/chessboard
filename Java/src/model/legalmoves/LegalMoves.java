package model.legalmoves;

import java.util.*;
import model.*;

public interface LegalMoves {
    List<java.awt.Point> Calculate(int x, int y, Color color);
}