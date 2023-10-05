package com.youcode.app.game.actions;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.controller.BoardInfoController;
import com.youcode.app.game.controller.SideBareController;
import com.youcode.app.game.controller.TextPlayerController;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Player;
import com.youcode.app.game.validator.kill.KillingValidatorRoot;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;

public class PieceKiller {

    public static boolean confirm_kill_click = false;

    public static void handelKilling(Cell killerCell, Cell victimCell, Cell nextCell) {
        if (!killingIsValid(killerCell, victimCell)) return;
        checkChangeVictimCell(victimCell, nextCell);
        printInfo(killerCell, victimCell);
        kill(killerCell, victimCell);
    }

    private static void checkChangeVictimCell(Cell victimCell, Cell nextCell) {
        if (nextCell != victimCell) confirm_kill_click = false;
    }


    private static boolean killingIsValid(Cell killerCell, Cell victimCell) {
        if (nullCellChecked(killerCell, victimCell)) return false;
        else return KillingValidatorRoot.validate(killerCell, victimCell);
    }


    private static boolean nullCellChecked(Cell killerCell, Cell victimCell) {
        return killerCell == null || victimCell == null;
    }

    private static void printInfo(Cell killerCell, Cell victimCell) {
        ObjectPrinter.json(killerCell.getCellInfo(), "killerCell");
        ObjectPrinter.json(victimCell.getCellInfo(), "victimCell");
    }


    public static void kill(Cell killerCell, Cell victimCell) {
        if (confirm_kill_click) {
            startKill(killerCell, victimCell);
            BasicArbiter.changePlayer();
            confirm_kill_click = false;
        } else confirm_kill_click = true;
    }

    private static void startKill(Cell killerCell, Cell victimCell) {

        Player killerPlayer = LogicHelper.getPlayerByCell(killerCell);
        Player victimPlayer = LogicHelper.getPlayerByCell(victimCell);
        String message = killerPlayer.getName() + " " + killerCell.getPiece().getPiecesType() + "  killed  " + victimPlayer.getName() + " " + victimCell.getPiece().getPiecesType();

        SideBareController.collectPiece(victimCell.getPiece().getPiecesType(), victimCell.getPiece().getPieceColor());

        killerPlayer.addScore(LogicHelper.generatePieceValue(victimCell.getPiece().getPiecesType()));

        victimCell.setDefaultStyle();
        killerCell.setDefaultStyle();

        victimCell.removePieceAndUpdate();
        victimCell.setMovingPieceAndUpdate(killerCell.getPiece().getPiecesType(), killerCell.getPiece().getPieceColor());

        killerCell.removePieceAndUpdate();


        ObjectPrinter.table(killerCell.getCellInfo(), "killerCell");
        ObjectPrinter.table(victimCell.getCellInfo(), "victimCell");

        TextPlayerController.updatePlayerInfo(killerPlayer);

        BoardInfoController.success(message);

    }
}

