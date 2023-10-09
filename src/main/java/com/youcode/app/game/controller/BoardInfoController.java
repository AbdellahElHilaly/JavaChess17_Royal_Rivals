package com.youcode.app.game.controller;


import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Player;
import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.component.text.TextInformation;
import com.youcode.libs.print.Printer;


public class BoardInfoController {

    private static final String checkMateEmoji = "\uD83D\uDE31";
    private static final String cantMoveEmoji = "\uD83D\uDE2D";
    private static final String clickInvalidEmoji = "\uD83D\uDEAB";
    private static final String killEmoji = "\uD83D\uDD2B";
    private static final String killInvalidEmoji = "\uD83D\uDEAB";
    private static final String upgradeEmoji = "\uD83D\uDD27";
    private static final String notYourTurnEmoji = "\uD83D\uDEAB";
    private static final TextInformation TEXT_INFORMATION = Starter.getGameScreen().getHeader().getBoardInformation();

    public static void info(String message) {
        TEXT_INFORMATION.info(message);
    }





    public static void reset() {
         TEXT_INFORMATION.reset();
    }

    public static void focus(Cell clickedCell) {
        Player player = LogicHelper.getPlayerByCell(clickedCell);
        PiecesTypes pieces = clickedCell.getPiece().getPiecesType();
        Integer pieceValue = LogicHelper.generatePieceValue(pieces);
        String message = player.getName() + " focus on the " + pieces + " ( " + pieceValue + " pts )";
        TEXT_INFORMATION.info(message);
        player = null; pieces = null; pieceValue = null; message = null;
    }

    public static void showCheckMate() {
        TEXT_INFORMATION.info("Check Mate " + checkMateEmoji + " " + checkMateEmoji + " " + checkMateEmoji);
    }

    public static void cantMove(String message) {
        TEXT_INFORMATION.info(message + " " + cantMoveEmoji + " " + cantMoveEmoji + " " + cantMoveEmoji);
    }

    public static void clickInvalid() {
        TEXT_INFORMATION.info("Invalid click " + clickInvalidEmoji + " " + clickInvalidEmoji + " " + clickInvalidEmoji);
    }

    public static void kill(String message) {
        TEXT_INFORMATION.info(message + " " + killEmoji + " " + killEmoji + " " + killEmoji);
    }

    public static void killInvalid(String message) {
        TEXT_INFORMATION.info(message + " " + killInvalidEmoji + " " + killInvalidEmoji + " " + killInvalidEmoji);
    }

    public static void upgrade(String message) {
        TEXT_INFORMATION.info(message + " " + upgradeEmoji + " " + upgradeEmoji + " " + upgradeEmoji);
    }

    public static void notYourTurn() {
        TEXT_INFORMATION.info("Not your turn " + notYourTurnEmoji + " " + notYourTurnEmoji + " " + notYourTurnEmoji);
    }
}
