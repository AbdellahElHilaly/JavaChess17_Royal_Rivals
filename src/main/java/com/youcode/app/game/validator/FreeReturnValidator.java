package com.youcode.app.game.validator;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;

/**
 * This class is responsible for validating the free return of the pieces;
 * this class sees the board as if it's empty and has just the piece that we want to move and moves it according to its own rules.
 */
public class FreeReturnValidator {

    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor pieceColor) {
       if(pieceColor == CellColor.DARK) return nextLocation.getY() > oldLocation.getY();
       else return nextLocation.getY() < oldLocation.getY();
    }

    public static boolean king() {
        return  true;
    }


    public static boolean queen() {
        return true;
    }

    public static boolean rook() {
        return true;
    }

    public static boolean bishop() {
        return true;
    }

    public static boolean knight() {
        return true;
    }

}
