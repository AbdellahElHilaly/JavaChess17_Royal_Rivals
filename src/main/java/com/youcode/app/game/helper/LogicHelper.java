package com.youcode.app.game.helper;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.util.ArrayList;
import java.util.List;


public class LogicHelper {
    public static CellColor getcellcolor(int row, int col) {
        return (row + col) % 2 == 0 ? CellColor.LIGHT : CellColor.DARK;
    }

    public static Integer generatePieceValue(PiecesTypes piecesType) {
        switch (piecesType) {
            case KING:
                return 10000;
            case QUEEN:
                return 9;
            case ROOK:
                return 5;
            case BISHOP:
            case KNIGHT:
                return 3;
            case PAWN:
                return 1;
            default:
                return 0;
        }
    }


    public static int delta(int x, int y) {
        return Math.abs(x - y);
    }


    public static List<Cell> findCellsInTheWay(List<Cell> cells, Location tempLocation) {
        return cells.stream().filter(cell -> {

                    Location location = LocationGenerator.get(cell);
                    if (location.getX() == tempLocation.getX() && location.getY() == tempLocation.getY()) {
                        return true;
                    } else {
                        return false;
                    }
                }
        ).toList();
    }

    public static List<Cell> findFriendsInTheWay(List<Cell> cells, Location tempLocation, CellColor pieceColor) {
        List<Cell> cellsInTheWay = findCellsInTheWay(cells, tempLocation);
        return cellsInTheWay.stream().filter(cell -> {
                    if (cell.isEmpty()) {
                        return false;
                    } else {
                        return cell.getPiece().getPieceColor() == pieceColor;
                    }
                }
        ).toList();
    }
}