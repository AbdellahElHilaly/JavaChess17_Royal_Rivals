package com.youcode.app.game.helper;

import com.youcode.app.game.validator.FreeReturnValidator;
import com.youcode.app.game.validator.FreeTransactionValidator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.validator.IsFriendOnTheWayValidator;
import com.youcode.app.shared.enums.CellColor;

public class ValidatorsHandler {


    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.pawn(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.pawn(oldLocation, nextLocation, cellColor);
    }

    public static boolean king(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.king(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.king() &&
                IsFriendOnTheWayValidator.king();

    }

    public static boolean queen(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.queen(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.queen() &&
                IsFriendOnTheWayValidator.queen(oldLocation, nextLocation, cellColor);

    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.rook(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.rook() &&
                IsFriendOnTheWayValidator.rook(oldLocation, nextLocation, cellColor);
    }

    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.bishop(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.bishop() &&
                IsFriendOnTheWayValidator.bishop(oldLocation, nextLocation, cellColor);
    }

    public static boolean knight(Location oldLocation, Location nextLocation, CellColor cellColor) {
        return FreeTransactionValidator.knight(oldLocation, nextLocation, cellColor) &&
                FreeReturnValidator.knight()&&
                IsFriendOnTheWayValidator.knight();
    }
}
