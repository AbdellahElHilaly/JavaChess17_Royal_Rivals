package com.youcode.app.game.validator.move;

import com.youcode.app.game.controller.CellController;
import com.youcode.app.game.helper.MoveValidatorsHandler;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;

public class MoveValidatorRoot {
    private  static PiecesTypes type;
    private static final Location oldLocation = new Location();
    private static final   Location nextLocation = new Location();
    private static CellColor currentPlayerColor;



    public static boolean validate(Cell oldetCell, Cell nextCell) {
        if (nextCell == null || oldetCell == null) return false;
        if(oldetCell.isEmpty() || !nextCell.isEmpty()) return false;

        getCellDetails(oldetCell, nextCell);

        return switch (type) {
            case KING ->
                    setValidationStyle(MoveValidatorsHandler.king(oldLocation, nextLocation, currentPlayerColor), nextCell);
            case QUEEN ->
                    setValidationStyle(MoveValidatorsHandler.queen(oldLocation, nextLocation, currentPlayerColor), nextCell);
            case ROOK ->
                    setValidationStyle(MoveValidatorsHandler.rook(oldLocation, nextLocation, currentPlayerColor), nextCell);
            case BISHOP ->
                    setValidationStyle(MoveValidatorsHandler.bishop(oldLocation, nextLocation, currentPlayerColor), nextCell);
            case KNIGHT ->
                    setValidationStyle(MoveValidatorsHandler.knight(oldLocation, nextLocation, currentPlayerColor), nextCell);
            case PAWN ->
                    setValidationStyle(MoveValidatorsHandler.pawn(oldLocation, nextLocation, currentPlayerColor), nextCell);
            default -> false;
        };
    }



    private static boolean setValidationStyle(boolean isValidate, Cell nextCell) {
        if (isValidate){
            nextCell.setValidStyle();
        }else {
            nextCell.setInvalidStyle();
        }
        return isValidate;
    }


    private static void getCellDetails(Cell oldetCell, Cell nextCell) {

        oldLocation.setX(CellController.getLocation(oldetCell).getX());
        oldLocation.setY(CellController.getLocation(oldetCell).getY());

        nextLocation.setX(CellController.getLocation(nextCell).getX());
        nextLocation.setY(CellController.getLocation(nextCell).getY());

        type = oldetCell.getPiece().getPiecesType();
        currentPlayerColor = oldetCell.getPiece().getPieceColor();
    }

}
