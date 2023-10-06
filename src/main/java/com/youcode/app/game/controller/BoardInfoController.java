package com.youcode.app.game.controller;


import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Player;
import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.component.text.TextInformation;


public class BoardInfoController {
    private static final TextInformation TEXT_INFORMATION = Starter.getGameScreen().getHeader().getBoardInformation();

    public static void info(String message) {
        TEXT_INFORMATION.info(message);
    }


    public static void error(String arrangePieces) {
        TEXT_INFORMATION.error(arrangePieces);
    }

    public static void warning(String message) {
         TEXT_INFORMATION.warn(message);

    }

    public static void success(String message) {
         TEXT_INFORMATION.success(message);
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
}
