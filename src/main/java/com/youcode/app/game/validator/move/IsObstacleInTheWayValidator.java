package com.youcode.app.game.validator.move;

import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.root.Starter;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.shared.enums.CellColor;

import java.util.List;

/**
 * this class should be checked if the friend is on the way or not
 * if not the piece can move
 * if yes the piece can't move
 */
public class IsObstacleInTheWayValidator {

    private static final List<Cell> cells = Starter.getCellsList();

    public static boolean pawn() {
        return true;
    }

    public static boolean king() {
        return true;
    }

    public static boolean queen(Location oldLocation, Location nextLocation, CellColor cellColor) {
        if (oldLocation.getX() == nextLocation.getX())
            return validatorHandler(isObstacleInTheWayVertically(oldLocation, nextLocation), PiecesTypes.QUEEN);

        else if (oldLocation.getY() == nextLocation.getY())
            return validatorHandler(isObstacleInTheWayHorizontally(oldLocation, nextLocation), PiecesTypes.QUEEN);

        else return validatorHandler(isObstacleInTheWayDiagonally(oldLocation, nextLocation), PiecesTypes.QUEEN);
    }

    public static boolean rook(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        if (oldLocation.getX() == nextLocation.getX())
            return validatorHandler(isObstacleInTheWayVertically(oldLocation, nextLocation), PiecesTypes.ROOK);

        else return validatorHandler(isObstacleInTheWayHorizontally(oldLocation, nextLocation), PiecesTypes.ROOK);
    }

    public static boolean bishop(Location oldLocation, Location nextLocation, CellColor pieceColor) {
        return validatorHandler(isObstacleInTheWayDiagonally(oldLocation, nextLocation), PiecesTypes.BISHOP);
    }

    public static boolean knight() {
        return validatorHandler(true, PiecesTypes.KNIGHT);
    }







    private static boolean isObstacleInTheWayDiagonally(Location oldLocation, Location nextLocation) {
        Location tempLocation = new Location();
        int index_X = generateVerticalIndex(oldLocation.getY(), nextLocation.getY());
        int index_Y = generateHorizontalIndex(oldLocation.getX(), nextLocation.getX());

        for (int i = oldLocation.getX() + index_Y, j = oldLocation.getY() + index_X; i != nextLocation.getX(); i += index_Y, j += index_X) {
            tempLocation.setX(i);
            tempLocation.setY(j);
            List<Cell> friendsInTheWay = LogicHelper.findObstaclesInTheWay(cells, tempLocation);
            if (!friendsInTheWay.isEmpty()) {
                return false;
            }
        }
        return true;
    }


    private static boolean isObstacleInTheWayVertically(Location oldLocation, Location nextLocation) {
        int index_X = generateVerticalIndex(oldLocation.getY(), nextLocation.getY());
        Location tempLocation = new Location(oldLocation.getX(), oldLocation.getY());

        for (int i = oldLocation.getY() + index_X; i != nextLocation.getY(); i += index_X) {
            tempLocation.setY(i);
            List<Cell> friendsInTheWay = LogicHelper.findObstaclesInTheWay(cells, tempLocation);
            if (!friendsInTheWay.isEmpty()) {
                return false;
            }
        }
        return true;

    }

    private static boolean isObstacleInTheWayHorizontally(Location oldLocation, Location nextLocation) {
        int index_Y = generateHorizontalIndex(oldLocation.getX(), nextLocation.getX());
        Location tempLocation = new Location(oldLocation.getX(), oldLocation.getY());
        for (int i = oldLocation.getX() + index_Y; i != nextLocation.getX(); i += index_Y) {
            tempLocation.setX(i);
            List<Cell> friendsInTheWay = LogicHelper.findObstaclesInTheWay(cells, tempLocation);
            if (!friendsInTheWay.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private static int generateHorizontalIndex(int old_x, int next_x) {
        if (old_x > next_x) {
            return -1;
        } else {
            return 1;
        }

    }

    private static int generateVerticalIndex(int old_y, int next_y) {
        if (old_y > next_y) {
            return -1;
        } else {
            return 1;
        }
    }


    private static boolean validatorHandler(boolean condition, PiecesTypes pieces) {
        if (!condition) BoardInfoController.warning(pieces + " have an obstacle in the way");
        else BoardInfoController.reset();
        return condition;
    }



}

