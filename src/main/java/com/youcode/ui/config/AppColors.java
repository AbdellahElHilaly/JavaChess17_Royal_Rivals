package com.youcode.ui.config;

import java.awt.*;
import java.util.Map;

public class AppColors {


    public static final Color PRIMARY_DARK = new Color(186,16,68);
    public static final Color PRIMARY_LIGHT = new Color(206,80,103);
    public static final Color SECONDARY_DARK = new Color(174,133,93);;
    public static final Color SECONDARY_LIGHT = new Color(171,152,91);
    public static final Color LIGHT = new Color(199,187,133);
    public static final Color TEXT = new Color(255,255,255);
    public static final Color TEXT_DARK = new Color(4, 20, 65);


    public static Map<String, Color> board = Map.of(
            "background", LIGHT,
            "text", TEXT,
            "border", PRIMARY_DARK,
            "foreground", SECONDARY_DARK
    );

    public static Map<String, Color> header = Map.of(
            "background", PRIMARY_LIGHT,
            "text", TEXT,
            "border", PRIMARY_DARK,
            "foreground", SECONDARY_DARK
    );
}
