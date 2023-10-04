package com.youcode.app.game.validator.move;

import com.youcode.app.game.helper.LocationGenerator;
import com.youcode.app.game.helper.MoveValidatorsHandler;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;

public class MoveValidator {
    private  static PiecesTypes type;
    private static final Location oldLocation = new Location();
    private static final   Location nextLocation = new Location();
    private static CellColor currentPlayerColor;



    public static boolean validate(Cell oldetCell, Cell nextCell) {
        if (nextCell == null || oldetCell == null) return false;
        if(oldetCell.isEmpty() || !nextCell.isEmpty()) return false;

        getCellDetails(oldetCell, nextCell);

        switch (type){
            case KING:
                return setValidationStyle(MoveValidatorsHandler.king(oldLocation, nextLocation,currentPlayerColor) , nextCell);
            case QUEEN:
                return setValidationStyle(MoveValidatorsHandler.queen(oldLocation, nextLocation,currentPlayerColor) , nextCell);
            case ROOK:
                return setValidationStyle(MoveValidatorsHandler.rook(oldLocation, nextLocation,currentPlayerColor) , nextCell);
            case BISHOP:
                return setValidationStyle(MoveValidatorsHandler.bishop(oldLocation, nextLocation,currentPlayerColor) , nextCell);
            case KNIGHT:
                return setValidationStyle(MoveValidatorsHandler.knight(oldLocation, nextLocation,currentPlayerColor) , nextCell);
            case PAWN:
                return setValidationStyle(MoveValidatorsHandler.pawn(oldLocation, nextLocation,currentPlayerColor) , nextCell);
            default:
                return false;
        }
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

        oldLocation.setX(LocationGenerator.getX(oldetCell));
        oldLocation.setY(LocationGenerator.getY(oldetCell));

        nextLocation.setX(LocationGenerator.getX(nextCell));
        nextLocation.setY(LocationGenerator.getY(nextCell));

        type = oldetCell.getPiece().getPiecesType();
        currentPlayerColor = oldetCell.getPiece().getPieceColor();
    }

}
