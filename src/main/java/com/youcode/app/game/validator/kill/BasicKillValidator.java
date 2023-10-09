package com.youcode.app.game.validator.kill;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.PiecesTypes;

import java.util.ArrayList;
import java.util.List;

public class BasicKillValidator {

    public static boolean pawn(Location killerLocation, Location victimLocation) {
        int deltaX = LogicHelper.delta(killerLocation.getX(), victimLocation.getX());
        int deltaY = LogicHelper.delta(killerLocation.getY(), victimLocation.getY());
        return  validatorHandler(deltaX == 1 && deltaY == 1, PiecesTypes.PAWN);
    }

    public static boolean king(Location killerLocation, Location victimeLocation) {
        return  true;
    }


    public static boolean queen(Location killerLocation, Location victimeLocation) {
        return true;
    }

    public static boolean rook(Location killerLocation, Location victimeLocation) {
        return true;
    }

    public static boolean bishop(Location killerLocation, Location victimeLocation) {
        return true;
    }

    public static boolean knight(Location killerLocation, Location victimeLocation) {
        return true;
    }

    private static boolean validatorHandler(boolean condition, PiecesTypes pieces) {
        if (!condition && BasicArbiter.canShowMessagesBoard ) BoardInfoController.killInvalid(pieces + " can't kill this piece");
        return condition;
    }
}
