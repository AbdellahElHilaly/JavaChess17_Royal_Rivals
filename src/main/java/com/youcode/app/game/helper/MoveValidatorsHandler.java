package com.youcode.app.game.helper;

import com.youcode.app.game.validator.move.FreeReturnValidator;
import com.youcode.app.game.validator.move.FreeTransactionValidator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.validator.move.IsObstacleInTheWayValidator;
import com.youcode.app.shared.enums.CellColor;

public class MoveValidatorsHandler {


    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return FreeTransactionValidator.pawn(oldLocation, nextLocation, pieceColor) &&
                FreeReturnValidator.pawn(oldLocation, nextLocation, pieceColor);
    }

    public static boolean king(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return FreeTransactionValidator.king(oldLocation, nextLocation, pieceColor) &&
                FreeReturnValidator.king( oldLocation,  nextLocation,  pieceColor) &&
                IsObstacleInTheWayValidator.king();

    }

    public static boolean queen(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return FreeTransactionValidator.queen(oldLocation, nextLocation, pieceColor) &&
                FreeReturnValidator.queen(oldLocation, nextLocation, pieceColor) &&
                IsObstacleInTheWayValidator.queen(oldLocation, nextLocation, pieceColor);

    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return FreeTransactionValidator.rook(oldLocation, nextLocation, pieceColor) &&
                FreeReturnValidator.rook(oldLocation, nextLocation, pieceColor) &&
                IsObstacleInTheWayValidator.rook(oldLocation, nextLocation, pieceColor);
    }

    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return FreeTransactionValidator.bishop(oldLocation, nextLocation, pieceColor) &&
                FreeReturnValidator.bishop(oldLocation, nextLocation, pieceColor) &&
                IsObstacleInTheWayValidator.bishop(oldLocation, nextLocation, pieceColor);
    }

    public static boolean knight(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return FreeTransactionValidator.knight(oldLocation, nextLocation, pieceColor) &&
                FreeReturnValidator.knight(oldLocation, nextLocation, pieceColor)&&
                IsObstacleInTheWayValidator.knight();
    }
}
