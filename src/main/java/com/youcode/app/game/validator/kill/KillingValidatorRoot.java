package com.youcode.app.game.validator.kill;

import com.youcode.app.game.controller.CellController;
import com.youcode.app.game.helper.KillingValidatorHandler;
import com.youcode.app.game.helper.LocationGenerator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;

public class KillingValidatorRoot {
    private  static PiecesTypes type;
    private static final Location killerLocation = new Location();
    private static final   Location victimeLocation = new Location();
    private static CellColor currentPlayerColor;


    public static boolean validate(Cell killerCell, Cell victimeCell) {
        if (victimeCell == null || killerCell == null) return false;
        if(killerCell.isEmpty() || victimeCell.isEmpty()) return false;

        getCellDetails(killerCell, victimeCell);

        return switch (type) {
            case KING ->
                    setValidationStyle(KillingValidatorHandler.king(killerLocation, victimeLocation, currentPlayerColor), victimeCell);
            case QUEEN ->
                    setValidationStyle(KillingValidatorHandler.queen(killerLocation, victimeLocation, currentPlayerColor), victimeCell);
            case ROOK ->
                    setValidationStyle(KillingValidatorHandler.rook(killerLocation, victimeLocation, currentPlayerColor), victimeCell);
            case BISHOP ->
                    setValidationStyle(KillingValidatorHandler.bishop(killerLocation, victimeLocation, currentPlayerColor), victimeCell);
            case KNIGHT ->
                    setValidationStyle(KillingValidatorHandler.knight(killerLocation, victimeLocation, currentPlayerColor), victimeCell);
            case PAWN ->
                    setValidationStyle(KillingValidatorHandler.pawn(killerLocation, victimeLocation, currentPlayerColor), victimeCell);
            default -> false;
        };
    }


    private static boolean setValidationStyle(boolean isValidate, Cell victimeCell) {
        if (isValidate){
            victimeCell.setValidStyle();
        }else {
            victimeCell.setInvalidStyle();
        }
        return isValidate;
    }


    private static void getCellDetails(Cell killerCell, Cell victimeCell) {

        killerLocation.setX(CellController.getLocation(killerCell).getX());
        killerLocation.setY(CellController.getLocation(killerCell).getY());

        victimeLocation.setX(CellController.getLocation(victimeCell).getX());
        victimeLocation.setY(CellController.getLocation(victimeCell).getY());

        type = killerCell.getPiece().getPiecesType();
        currentPlayerColor = killerCell.getPiece().getPieceColor();
    }


}
