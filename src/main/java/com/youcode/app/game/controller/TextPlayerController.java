package com.youcode.app.game.controller;

import com.youcode.app.game.model.entity.Player;
import com.youcode.app.ui.component.text.TextPlayer;

public class TextPlayerController {
    private  static  final TextPlayer textPlayerDark = Starter.getGameScreen().getHeader().getTextPlayerDark();
    private static  final TextPlayer textPlayerLight = Starter.getGameScreen().getHeader().getTextPlayerLight();


    public static void setPlayerName(Player playerDark, Player playerLight) {
        textPlayerDark.setPlayerName(playerDark.getName(), playerDark.getColor());
        textPlayerLight.setPlayerName(playerLight.getName(), playerLight.getColor());
    }


    public static void info(String pieceClicked) {
        BoardInfoController.info(pieceClicked);
    }
}
