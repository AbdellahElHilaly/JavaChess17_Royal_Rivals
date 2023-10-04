package com.youcode.app.game.controller;


import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.game.model.entity.Player;
import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.component.text.BoardInformation;


public class BoardInfoController {
    private static final BoardInformation boardInformation = Starter.getGameScreen().getHeader().getBoardInformation();

    public static void info(String message) {
        boardInformation.info(message);
    }


    public static void error(String arrangePieces) {
        boardInformation.error(arrangePieces);
    }

    public static void warning(String message) {
        boardInformation.warn(message);
    }

    public static void success(String message) {
        boardInformation.success(message);
    }

    public static void reset() {
        boardInformation.reset();
    }

    public static void focus(Cell clickedCell) {
        Player player = LogicHelper.getPlayerByCell(clickedCell);
        PiecesTypes pieces = clickedCell.getPiece().getPiecesType();
        Integer pieceValue = LogicHelper.generatePieceValue(pieces);
        String message = player.getName() + " focus on the " + pieces + " ( " + pieceValue + " pts )";
        boardInformation.info(message);

        player = null; pieces = null; pieceValue = null; message = null;
    }
}
