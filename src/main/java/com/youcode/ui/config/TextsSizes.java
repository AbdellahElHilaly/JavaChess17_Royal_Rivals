package com.youcode.ui.config;

import java.util.Map;

public class TextsSizes {
    private static final int padding = 10;
    private static final int margin = 10;

    public static final Map<String, Integer> PlayerName = Map.of(
            "fontSize", 20,
            "fontStyle", 1,
            "padding", padding,
            "margin", margin
    );

    public static final Map<String, Integer> PlayerScore = Map.of(
            "fontSize", 20,
            "fontStyle", 1,
            "padding", padding,
            "margin", margin
    );

    public static final Map<String, Integer> Information = Map.of(
            "fontSize", 25,
            "fontStyle", 1,
            "padding", padding,
            "margin", margin
    );
    public static final Map<String, Integer> Timer = Map.of(
            "fontSize", 45,
            "fontStyle", 2,
            "padding", padding+10,
            "margin", margin
    );



}
