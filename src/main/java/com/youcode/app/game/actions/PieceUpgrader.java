package com.youcode.app.game.actions;

import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.controller.CellController;
import com.youcode.app.game.helper.LocationGenerator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;

public class PieceUpgrader {

    private  static CellColor pieceColor;
    private static PiecesTypes piecesType;
    private static final Location pieceLocation = new Location();

    public static void checkPawnUpgrade(Cell cell) {
        getDetails(cell);


        if(isPawn() && isInLastRow()) {
            upgradeToQueen(cell);
        }

    }

    private static void getDetails(Cell cell) {
        pieceColor = cell.getPiece().getPieceColor();
        piecesType = cell.getPiece().getPiecesType();
        pieceLocation.setY(CellController.getLocation(cell).getY());
    }

    private static boolean isInLastRow() {
        if(isDark()) return pieceLocation.getY() == 7;
        return pieceLocation.getY() == 0;
    }

    private static boolean isDark() {
        return pieceColor == CellColor.DARK;
    }

    private static boolean isPawn() {
        return piecesType == PiecesTypes.PAWN;
    }

    public static void upgradeToQueen(Cell cell) {
        if(isDark()) CellController.upgrade(cell, PiecesTypes.QUEEN, CellColor.DARK);
        else CellController.upgrade(cell, PiecesTypes.QUEEN, CellColor.LIGHT);
        BoardInfoController.success("Pawn upgraded to Queen");
    }
}
