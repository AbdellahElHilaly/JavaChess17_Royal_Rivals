package com.youcode.app.game.validator.check_mate;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.controller.CellController;
import com.youcode.app.game.helper.KillingValidatorHandler;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class CheckMateValidator {

    private static final List<Cell> cells = Starter.getCellsList();


    public static void CheckMate() {

        BasicArbiter.canShowMessagesBoard = false;


        if (checkMateDark()) BoardInfoController.warning("check mate");

        if (checkMateLight()) BoardInfoController.warning("check mate");


        BasicArbiter.canShowMessagesBoard = true;


    }

    private static boolean checkMateLight() {

        List<Cell> enemies = LogicHelper.getEnemies(cells, CellColor.DARK);

        Cell lightKing = LogicHelper.getLightKing(cells);

        if (startCheckMate(enemies, lightKing)){
            lightKing.setCheckMateStyle();
            return true;
        }
        else  {
            lightKing.setDefaultStyle();
            return false;
        }
    }


    private static boolean checkMateDark() {

        List<Cell> enemies = LogicHelper.getEnemies(cells, CellColor.LIGHT);

        Cell darkKing = LogicHelper.getDarkKing(cells);

        if (startCheckMate(enemies, darkKing)){
            darkKing.setCheckMateStyle();
            return true;
        }
        else  {
            darkKing.setDefaultStyle();
           return false;
        }
    }

    private static boolean startCheckMate(List<Cell> enemies, Cell king) {


        Location kingLocation = new Location();

        kingLocation.setX(CellController.getLocation(king).getX());
        kingLocation.setY(CellController.getLocation(king).getY());


        ObjectPrinter.json(kingLocation, "king not check mate location");

        CellColor kingColor = king.getPiece().getPieceColor();


        ObjectPrinter.table(king.getCellInfo(), "king");

        AtomicBoolean checkMate = new AtomicBoolean(false);


        enemies.forEach(enemy -> {

            CellColor enemyColor = enemy.getPiece().getPieceColor();
            PiecesTypes enemyType = enemy.getPiece().getPiecesType();
            Location enemyLocation = CellController.getLocation(enemy);

            if (KillingValidatorHandler.validate(enemyType, enemyLocation, kingLocation, enemyColor)) {


                enemy.setAttackedStyle();

                String message = "the " + enemyColor + " " + enemyType + " can kill the " + kingColor + " king";

                BoardInfoController.warning(message);

                Printer.error(message);

                checkMate.set(true);

            } else {
                if(enemyType != PiecesTypes.KING) enemy.setDefaultStyle();
            }

        });

        return checkMate.get();


    }


}
