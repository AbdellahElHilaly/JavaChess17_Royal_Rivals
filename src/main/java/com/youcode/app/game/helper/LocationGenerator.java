package com.youcode.app.game.helper;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;

public class LocationGenerator {
    public static final Location location = new Location();


    public static Location generate(Cell cell) {
        location.setX(generateX(cell.getCellInfo().getCol()));
        location.setY(generateY(cell.getCellInfo().getRow()));
        return location;
    }

    public static int generateX(char col) {
        return col - 'A';
    }

    public static int generateY(int row) {
        return 8 - row;
    }


    public static Location defaultLocation(PiecesTypes piecesTypes) {
        return switch (piecesTypes) {
            case KING -> new Location(0, 4);
            case QUEEN -> new Location(0, 3);
            case ROOK -> new Location(0, 0);
            case BISHOP -> new Location(0, 2);
            case KNIGHT -> new Location(0, 1);
            case PAWN -> new Location(1, 0);
            default -> new Location(0, 0);
        };
    }
}
