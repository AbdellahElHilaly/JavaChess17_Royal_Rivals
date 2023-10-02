package com.youcode.app.game.arbiter;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;

public class BasicArbiter {
    public static CellColor currentPlayer = CellColor.DARK;



    public static boolean isFirstPawnPlay(Location oldLocation) {
        if(oldLocation.getY()==6) return true;
        else return oldLocation.getY() == 1;

    }

    public static void changePlayer() {
        if (currentPlayer == CellColor.DARK) currentPlayer = CellColor.LIGHT;
        else if (currentPlayer == CellColor.LIGHT) currentPlayer = CellColor.DARK;
    }
}
