package com.youcode.libs.util.config;


import com.youcode.libs.print.Emojis;
import com.youcode.libs.util.enums.RunMoods;

public class AppConfig {
    public static final String APP_NAME = "Chess" + Emojis.emoji.get("chess_pawn") + "Royal Rivals " + Emojis.emoji.get("fire");
    public static final String APP_VERSION = "1.0.0";
    public static final String APP_AUTHOR = "YouCode Team";
    public static final String RUN_MOOD = RunMoods.Development.name();
}