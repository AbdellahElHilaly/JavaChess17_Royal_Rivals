package com.youcode.app.game.arbiter;

import com.youcode.app.game.root.Starter;
import com.youcode.app.game.controller.TimerController;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.libs.print.ObjectPrinter;

public class BasicArbiter {
    public static CellColor currentPlayer = CellColor.DARK;
    public static boolean isFirstMove = true;


    public static boolean isFirstPawnPlay(Location oldLocation) {
        if (oldLocation.getY() == 6) return true;
        else return oldLocation.getY() == 1;
    }

    public static void changePlayer() {
        if (currentPlayer == CellColor.DARK) {

            TimerController.pauseCount(CellColor.DARK);

            Starter.getPlayer(CellColor.DARK).setTime(TimerController.getText(CellColor.DARK));

            TimerController.startCount(CellColor.LIGHT);

//            ObjectPrinter.json(Starter.getPlayer(currentPlayer), "currentPlayer");

            currentPlayer = CellColor.LIGHT;

        } else if (currentPlayer == CellColor.LIGHT) {

            TimerController.pauseCount(CellColor.LIGHT);

            Starter.getPlayer(CellColor.LIGHT).setTime(TimerController.getText(CellColor.LIGHT));

            TimerController.startCount(CellColor.DARK);
            currentPlayer = CellColor.DARK;
        }


    }

    public static void checkFirstMove() {
        if (isFirstMove) {
            isFirstMove = false;
            TimerController.startCount(CellColor.DARK);
        }
    }

    public static  void  resetGame(){
        Starter.getGameScreen().getBoardContainer().getChessBoard().reset();
        Starter.getGameScreen().getBoardContainer().getSideBareDark().reset();
        Starter.getGameScreen().getBoardContainer().getSideBareLight().reset();
        Starter.getPlayer(CellColor.DARK).reset();
        Starter.getPlayer(CellColor.LIGHT).reset();
        Starter.arrangePieces();
        TimerController.reset(CellColor.LIGHT);
        TimerController.reset(CellColor.DARK);
    }



}
