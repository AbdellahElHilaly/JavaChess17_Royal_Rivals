package com.youcode.app.game.helper;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.validator.kill.BasicKillValidator;

import com.youcode.app.game.validator.move.FreeReturnValidator;
import com.youcode.app.game.validator.move.FreeTransactionValidator;
import com.youcode.app.game.validator.move.IsObstacleInTheWayValidator;
import com.youcode.app.shared.enums.CellColor;

public class KillingValidatorHandler {
    public static boolean pawn(Location killerLocation, Location victimeLocation, CellColor cellColor) {
        return FreeReturnValidator.pawn(killerLocation, victimeLocation, cellColor) && BasicKillValidator.pawn(killerLocation, victimeLocation);
    }

    public static boolean king(Location killerLocation, Location victimeLocation, CellColor cellColor) {
        return MoveValidatorsHandler.king(killerLocation, victimeLocation, cellColor) && BasicKillValidator.king(killerLocation, victimeLocation);
    }

    public static boolean queen(Location killerLocation, Location victimeLocation, CellColor cellColor) {
        return  MoveValidatorsHandler.queen(killerLocation, victimeLocation, cellColor)  &&  BasicKillValidator.queen(killerLocation, victimeLocation);

    }

    public static boolean rook(Location killerLocation, Location victimeLocation, CellColor cellColor) {
        return  MoveValidatorsHandler.rook(killerLocation, victimeLocation, cellColor)  &&  BasicKillValidator.rook(killerLocation, victimeLocation);

    }

    public static boolean bishop(Location killerLocation, Location victimeLocation, CellColor cellColor) {
        return  MoveValidatorsHandler.bishop(killerLocation, victimeLocation, cellColor)  &&  BasicKillValidator.bishop(killerLocation, victimeLocation);
    }

    public static boolean knight(Location killerLocation, Location victimeLocation, CellColor cellColor) {
        return  MoveValidatorsHandler.knight(killerLocation, victimeLocation, cellColor)  &&  BasicKillValidator.knight(killerLocation, victimeLocation);
    }
}
