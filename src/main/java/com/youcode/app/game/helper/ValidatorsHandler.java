package com.youcode.app.game.helper;

import com.youcode.app.game.validator.FreeTransactionValidator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.ui.shared.utils.enums.CellColor;

public class ValidatorsHandler {

    private static Boolean isValidate = false;

    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor cellColor) {
        isValidate = FreeTransactionValidator.pawn(oldLocation, nextLocation, cellColor);
        return isValidate;
    }

    public static boolean king(Location oldLocation, Location nextLocation, CellColor cellColor) {
        isValidate = FreeTransactionValidator.king(oldLocation, nextLocation, cellColor);
        return isValidate;
    }

    public static boolean queen(Location oldLocation, Location nextLocation, CellColor cellColor) {
        isValidate = FreeTransactionValidator.queen(oldLocation, nextLocation, cellColor);
        return isValidate;
    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor cellColor) {
        isValidate = FreeTransactionValidator.rook(oldLocation, nextLocation, cellColor);
        return isValidate;
    }

    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor cellColor) {
        isValidate = FreeTransactionValidator.bishop(oldLocation, nextLocation, cellColor);
        return isValidate;
    }

    public static boolean knight(Location oldLocation, Location nextLocation, CellColor cellColor) {
        isValidate = FreeTransactionValidator.knight(oldLocation, nextLocation, cellColor);
        return isValidate;
    }
}
