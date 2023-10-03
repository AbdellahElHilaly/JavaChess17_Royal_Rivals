package com.youcode.app.game.arbiter;

import com.youcode.app.game.controller.Starter;
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

            ObjectPrinter.json(Starter.getPlayer(currentPlayer),"currentPlayer");

            currentPlayer = CellColor.LIGHT;

        } else if (currentPlayer == CellColor.LIGHT){

            TimerController.pauseCount(CellColor.LIGHT);

            Starter.getPlayer(CellColor.LIGHT).setTime(TimerController.getText(CellColor.LIGHT));

            TimerController.startCount(CellColor.DARK);
            ObjectPrinter.json(Starter.getPlayer(currentPlayer),"currentPlayer");
            currentPlayer = CellColor.DARK;
        }



    }

    public static void checkFirstMove() {
        if (isFirstMove) {
            isFirstMove = false;
            TimerController.startCount(CellColor.DARK);
        }
    }
}
