package com.youcode.app.game.validator.move;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.controller.CellController;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;

import java.util.function.Predicate;

/**
 * This class is responsible for validating the free return of the pieces;
 * this class sees the board as if it's empty and has just the piece that we want to move and moves it according to its own rules.
 */
public class FreeReturnValidator {



    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor pieceColor) {
       if(pieceColor == CellColor.DARK) return validatorHandler(nextLocation.getY() > oldLocation.getY(), PiecesTypes.PAWN);
       else return validatorHandler(nextLocation.getY() < oldLocation.getY(), PiecesTypes.PAWN);
    }

    public static boolean king(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return  true;
    }



    public static boolean queen(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return true;
    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return true;
    }

    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return true;
    }

    public static boolean knight(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return true;
    }

    private static boolean validatorHandler(boolean condition, PiecesTypes pieces) {
        if (!condition && BasicArbiter.canShowMessagesBoard ) BoardInfoController.cantMove(pieces + " can't move back");
        return condition;
    }



}
