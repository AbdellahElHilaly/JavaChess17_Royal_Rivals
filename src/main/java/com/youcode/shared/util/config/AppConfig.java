package com.youcode.shared.util.config;


import com.youcode.shared.print.Emojis;
import com.youcode.shared.util.enums.RunMoods;

public class AppConfig {
    public static final String APP_NAME = "Chess" + Emojis.emoji.get("chess_pawn") + "Royal Rivals " + Emojis.emoji.get("fire");
    public static final String APP_VERSION = "1.0.0";
    public static final String APP_AUTHOR = "YouCode Team";
    public static final String RUN_MOOD = RunMoods.Production.name();
}
