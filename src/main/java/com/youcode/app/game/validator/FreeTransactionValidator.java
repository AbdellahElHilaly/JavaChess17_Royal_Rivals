package com.youcode.app.game.validator;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.shared.enums.CellColor;

/**
 * This class is responsible for validating the free movement of the pieces, all pieces can move like nothing is in their way.
 * this class look the board like it's empty and have just the piece that we want to move and move it with his own rules.
 */
public class FreeTransactionValidator {

    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        if(BasicArbiter.isFirstPawnPlay(oldLocation)) {

            if (deltaX == 0 && deltaY == 1) return  true;
            else return deltaX == 0 && deltaY == 2;
        }

        else return deltaX == 0 && deltaY == 1;
    }

    public static boolean king(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return deltaX <= 1 && deltaY <= 1;
    }
    public static boolean queen(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return (deltaX == 0 || deltaY == 0 || Math.abs(deltaX) == Math.abs(deltaY));
    }


    public static boolean rook(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return (deltaX == 0 || deltaY == 0);
    }


    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());

        return Math.abs(deltaX) == Math.abs(deltaY);
    }


    public static boolean knight(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());

        return (Math.abs(deltaX) == 1 && Math.abs(deltaY) == 2) || (Math.abs(deltaX) == 2 && Math.abs(deltaY) == 1);
    }

}
