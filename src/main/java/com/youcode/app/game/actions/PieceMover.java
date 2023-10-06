package com.youcode.app.game.actions;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.controller.CellController;
import com.youcode.app.game.validator.check_mate.CheckMateValidator;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.Printer;

public class PieceMover {

    public   static boolean confirm_move_click = false;

    private static boolean isCellEmpty(Cell cell) {
        return cell.isEmpty();
    }


    public static void move(Cell from, Cell to) {
        if (confirm_move_click){
            startMove(from, to);
            PieceUpgrader.checkPawnUpgrade(to);
            confirm_move_click = false;
            BasicArbiter.changePlayer();
            CheckMateValidator.CheckMate();
        }
    }

    private static void startMove(Cell from, Cell to) {
        if (isCellEmpty(from)) {
            Printer.error("can't move from cell is empty!");
            return;
        }
        if (isCellEmpty(to)) {

            CellController.replacePiece(from, to);

            to.setDefaultStyle();

            from.removePieceAndUpdate();
            from.setDefaultStyle();
        }
    }


}

