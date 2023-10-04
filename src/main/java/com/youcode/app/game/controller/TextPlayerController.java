package com.youcode.app.game.controller;

import com.youcode.app.game.model.entity.Player;
import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.ui.component.text.TextPlayer;

public class TextPlayerController {
    private  static  final TextPlayer textPlayerDark = Starter.getGameScreen().getHeader().getTextPlayerDark();
    private static  final TextPlayer textPlayerLight = Starter.getGameScreen().getHeader().getTextPlayerLight();


    public static void setPlayerInfo(Player playerDark, Player playerLight) {
        String playerDarkInfo = playerDark.getName() + ": " + playerDark.getScore() + "pts";
        String playerLightInfo = playerLight.getName() + ": " + playerLight.getScore() + "pts";
        textPlayerDark.setPlayerInfo(playerDarkInfo, playerDark.getColor());
        textPlayerLight.setPlayerInfo(playerLightInfo, playerLight.getColor());
    }


    public  static void  updatePlayerInfo(Player player) {
        String playerInfo = player.getName() + ": " + player.getScore() + "pts";
        if (player.getColor() == CellColor.DARK) textPlayerDark.setPlayerInfo(playerInfo, player.getColor());
        else textPlayerLight.setPlayerInfo(playerInfo, player.getColor());
    }


}
