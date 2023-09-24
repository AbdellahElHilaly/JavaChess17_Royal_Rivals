package com.youcode.app.game.controller;

import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.root.GameScreen;

import java.util.List;

public class Starter {

    private static GameScreen gameScreen = new GameScreen();


    public static GameScreen getGameScreen() {
        return gameScreen;
    }


    public static void drawBoard() {
        gameScreen.init();
    }

    public static void arrangePieces() {
        getGameScreen().getBoardContainer().getChessBoard().initPieces();
    }

    public static List<Cell> getCellsList() {
        return getGameScreen().getBoardContainer().getChessBoard().getCellsList();
    }
}
