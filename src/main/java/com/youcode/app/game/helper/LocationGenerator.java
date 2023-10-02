package com.youcode.app.game.helper;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.ui.component.other.Cell;

public class LocationGenerator {
    public static final Location location = new Location();

    public static Location get(Cell cell) {
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

    public static int getX(Cell cell) {
        return get(cell).getX();
    }

    public static int getY(Cell cell) {
        return get(cell).getY();
    }
}
