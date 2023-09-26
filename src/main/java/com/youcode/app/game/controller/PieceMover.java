package com.youcode.app.game.controller;

import com.youcode.app.ui.component.other.Cell;

import java.util.List;

public class PieceMover {

    private static final List<Cell> cells = getCells();

    private static List<Cell> getCells() {
        return Starter.getGameScreen().getBoardContainer().getChessBoard().getCellsList();
    }

    private static boolean isCellEmpty(Cell cell) {
        return cell.isEmpty();
    }



}

