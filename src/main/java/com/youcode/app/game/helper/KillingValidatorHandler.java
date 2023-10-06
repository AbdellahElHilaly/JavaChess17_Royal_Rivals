package com.youcode.app.game.helper;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.validator.kill.BasicKillValidator;

import com.youcode.app.game.validator.move.FreeReturnValidator;
import com.youcode.app.game.validator.move.FreeTransactionValidator;
import com.youcode.app.game.validator.move.IsObstacleInTheWayValidator;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

public class KillingValidatorHandler {
    public static boolean pawn(Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return FreeReturnValidator.pawn(killerLocation, victimeLocation, killerColor) && BasicKillValidator.pawn(killerLocation, victimeLocation);
    }

    public static boolean king(Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return MoveValidatorsHandler.king(killerLocation, victimeLocation, killerColor) && BasicKillValidator.king(killerLocation, victimeLocation);
    }

    public static boolean queen(Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return MoveValidatorsHandler.queen(killerLocation, victimeLocation, killerColor) && BasicKillValidator.queen(killerLocation, victimeLocation);
    }

    public static boolean rook(Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return MoveValidatorsHandler.rook(killerLocation, victimeLocation, killerColor) && BasicKillValidator.rook(killerLocation, victimeLocation);

    }

    public static boolean bishop(Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return MoveValidatorsHandler.bishop(killerLocation, victimeLocation, killerColor) && BasicKillValidator.bishop(killerLocation, victimeLocation);
    }

    public static boolean knight(Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return MoveValidatorsHandler.knight(killerLocation, victimeLocation, killerColor) && BasicKillValidator.knight(killerLocation, victimeLocation);
    }

    public static boolean validate(PiecesTypes type, Location killerLocation, Location victimeLocation, CellColor killerColor) {
        return switch (type) {
            case KING -> king(killerLocation, victimeLocation, killerColor);
            case QUEEN -> queen(killerLocation, victimeLocation, killerColor);
            case ROOK -> rook(killerLocation, victimeLocation, killerColor);
            case BISHOP -> bishop(killerLocation, victimeLocation, killerColor);
            case KNIGHT -> knight(killerLocation, victimeLocation, killerColor);
            case PAWN -> pawn(killerLocation, victimeLocation, killerColor);
            default -> false;
        };
    }
}
