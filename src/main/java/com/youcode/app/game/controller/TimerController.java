package com.youcode.app.game.controller;

import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.ui.component.text.TimerView;

import javax.swing.*;


public class TimerController {
    private final  static TimerView timerViewDark = Starter.getGameScreen().getFooter().getTimerViewDark();
    private final static TimerView timerViewLight = Starter.getGameScreen().getFooter().getTimerViewLight();



    public static void reset(CellColor cellColor) {
        if (cellColor == CellColor.DARK) {
            timerViewDark.reset();
        } else {
            timerViewLight.reset();
        }
    }

    public static void startCount(CellColor cellColor) {
        if (cellColor == CellColor.DARK) {
            timerViewDark.startCount();
        } else {
            timerViewLight.startCount();
        }
    }

    public static Timer pauseCount(CellColor cellColor) {
        if (cellColor == CellColor.DARK) {
            return timerViewDark.pauseCount();
        } else {
            return timerViewLight.pauseCount();
        }
    }

    public static String getText(CellColor cellColor) {
        if (cellColor == CellColor.DARK) {
            return timerViewDark.getText();
        } else {
            return timerViewLight.getText();
        }
    }
}
