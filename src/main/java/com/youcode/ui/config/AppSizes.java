package com.youcode.ui.config;

import java.util.Map;

public class AppSizes {

    private static  final int WIDTH = 1200;
    private static  final int HEIGHT = 850;
    private static  final int PADDING = 10;
    private static  final int MARGIN = 10;
    private static  final int X = 0;
    private static  final int Y = 0;


    public static Map<String, Integer> board = Map.of(
            "width", WIDTH,
            "height", HEIGHT,
            "padding", PADDING,
            "margin", MARGIN,
            "x", X,
            "y", Y
    );

    public static Map<String, Integer> header = Map.of(
            "width", WIDTH,
            "height", HEIGHT - (int) (0.90 * HEIGHT),
            "padding", PADDING,
            "margin", MARGIN,
            "x", X,
            "y", Y
    );


}
