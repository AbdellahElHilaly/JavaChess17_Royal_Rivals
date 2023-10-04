package com.youcode.app.game.validator.move;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;

/**
 * This class is responsible for validating the free movement of the pieces, all pieces can move like nothing is in their way.
 * this class look the board like it's empty and have just the piece that we want to move and move it with his own rules.
 */
public class FreeTransactionValidator {

    public static boolean pawn(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        if (BasicArbiter.isFirstPawnPlay(oldLocation)) {

            if (validatorHandler(deltaX == 0 && deltaY == 1, PiecesTypes.PAWN)) return true;
            else return validatorHandler(deltaX == 0 && deltaY == 2, PiecesTypes.PAWN);
        } else return validatorHandler(deltaX == 0 && deltaY == 1, PiecesTypes.PAWN);
    }


    public static boolean king(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return validatorHandler(deltaX <= 1 && deltaY <= 1, PiecesTypes.KING);
    }

    public static boolean queen(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return validatorHandler(deltaX == 0 || deltaY == 0 || Math.abs(deltaX) == Math.abs(deltaY), PiecesTypes.QUEEN);
    }


    public static boolean rook(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return validatorHandler(deltaX == 0 || deltaY == 0, PiecesTypes.ROOK);
    }


    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());

        return validatorHandler(Math.abs(deltaX) == Math.abs(deltaY), PiecesTypes.BISHOP);
    }


    public static boolean knight(Location oldLocation, Location nextLocation, CellColor cellColor) {
        int deltaX = LogicHelper.delta(oldLocation.getX(), nextLocation.getX());
        int deltaY = LogicHelper.delta(oldLocation.getY(), nextLocation.getY());
        return validatorHandler(Math.abs(deltaX) == 1 && Math.abs(deltaY) == 2 || (Math.abs(deltaX) == 2 && Math.abs(deltaY) == 1), PiecesTypes.KNIGHT);
    }


    private static boolean validatorHandler(boolean condition, PiecesTypes pieces) {
        if (!condition) BoardInfoController.warning(pieces + " can't move like that");
        else BoardInfoController.reset();
        return condition;
    }


}
