package com.youcode.app.game.root;

import com.youcode.app.game.controller.TextPlayerController;
import com.youcode.app.game.model.entity.Player;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.root.GameScreen;

import java.util.List;

public class Starter {

    private static final GameScreen gameScreen = new GameScreen();
    private static final Player player1 = new Player("JaVA", CellColor.DARK);
    private static final Player player2 = new Player("Angular", CellColor.LIGHT);

    public static GameScreen getGameScreen() {
        return gameScreen;
    }


    public static void drawBoard() {
        gameScreen.init();
        TextPlayerController.setPlayerInfo(player1, player2);
    }

    public static void arrangePieces() {
        getGameScreen().getBoardContainer().getChessBoard().initPieces();
    }

    public static List<Cell> getCellsList() {
        return getGameScreen().getBoardContainer().getChessBoard().getCellsList();
    }

    public static Player getPlayer(CellColor cellColor) {
        return cellColor == CellColor.DARK ? player1 : player2;
    }



}
