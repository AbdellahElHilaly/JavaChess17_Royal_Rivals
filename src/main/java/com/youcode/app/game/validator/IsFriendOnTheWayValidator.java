package com.youcode.app.game.validator;

import com.youcode.app.game.controller.Starter;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.util.List;

/**
 * this class should be checked if the friend is on the way or not
 * if not the piece can move
 * if yes the piece can't move
 */
public class IsFriendOnTheWayValidator {

    private static final List<Cell> cells = Starter.getCellsList();

    public static boolean pawn() {
        return true;
    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        int index = generateIndex(oldLocation.getY(), nextLocation.getY());
        Location tempLocation = new Location(oldLocation.getX(), oldLocation.getY());

        for (int i = oldLocation.getY() + index; i != nextLocation.getY(); i += index) {
            tempLocation.setY(i);

            Cell tempCell = LogicHelper.findCellByLocation(cells, tempLocation);

             ObjectPrinter.table(tempLocation,"tempLocation");
            if(tempLocation!=null) ObjectPrinter.table(tempCell,"tempCell");



        }
        return true;

    }


    private static boolean isFriend(Cell tempCell, CellColor pieceColor) {
        return tempCell.getPiece().getPieceColor() == pieceColor;
    }


    private static int generateIndex(int old_y, int next_y) {
        if (old_y > next_y) {
            return -1;
        } else {
            return 1;
        }
    }


}

