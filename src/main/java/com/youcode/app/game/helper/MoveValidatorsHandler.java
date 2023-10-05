package com.youcode.app.game.helper;

import com.youcode.app.game.validator.move.FreeReturnValidator;
import com.youcode.app.game.validator.move.FreeTransactionValidator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.validator.move.IsObstacleInTheWayValidator;
import com.youcode.app.shared.enums.CellColor;

public class MoveValidatorsHandler {


    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.pawn(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.pawn(oldLocation, nextLocation, cellColor);
    }

    public static boolean king(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.king(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.king() &&
                IsObstacleInTheWayValidator.king();

    }

    public static boolean queen(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.queen(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.queen() &&
                IsObstacleInTheWayValidator.queen(oldLocation, nextLocation, cellColor);

    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.rook(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.rook() &&
                IsObstacleInTheWayValidator.rook(oldLocation, nextLocation, cellColor);
    }

    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.bishop(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.bishop() &&
                IsObstacleInTheWayValidator.bishop(oldLocation, nextLocation, cellColor);
    }

    public static boolean knight(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.knight(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.knight()&&
                IsObstacleInTheWayValidator.knight();
    }
}