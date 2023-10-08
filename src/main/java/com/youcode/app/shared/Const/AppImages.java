package com.youcode.app.shared.Const;


import com.youcode.app.ui.helper.UiHelper;

import java.awt.image.BufferedImage;

public class AppImages {

    private static final String IMAGES_PATH = "resources/assets/image/";
    private static final String PIECES_PATH = IMAGES_PATH + "pieces-png/";
    private static final String GAME_ICONS_PATH = IMAGES_PATH + "game-play/";

    public static final BufferedImage LIGHT_PAWN = UiHelper.getPicesImage(PIECES_PATH + "white-pawn.png");
    public static final BufferedImage LIGHT_KNIGHT = UiHelper.getPicesImage(PIECES_PATH + "white-knight.png");
    public static final BufferedImage LIGHT_BISHOP = UiHelper.getPicesImage(PIECES_PATH + "white-bishop.png");
    public static final BufferedImage LIGHT_ROOK = UiHelper.getPicesImage(PIECES_PATH + "white-rook.png");
    public static final BufferedImage LIGHT_QUEEN = UiHelper.getPicesImage(PIECES_PATH + "white-queen.png");
    public static final BufferedImage LIGHT_KING = UiHelper.getPicesImage(PIECES_PATH + "white-king.png");

    public static final BufferedImage DARK_PAWN = UiHelper.getPicesImage(PIECES_PATH + "black-pawn.png");
    public static final BufferedImage DARK_KNIGHT = UiHelper.getPicesImage(PIECES_PATH + "black-knight.png");
    public static final BufferedImage DARK_BISHOP = UiHelper.getPicesImage(PIECES_PATH + "black-bishop.png");
    public static final BufferedImage DARK_ROOK = UiHelper.getPicesImage(PIECES_PATH + "black-rook.png");
    public static final BufferedImage DARK_QUEEN = UiHelper.getPicesImage(PIECES_PATH + "black-queen.png");
    public static final BufferedImage DARK_KING = UiHelper.getPicesImage(PIECES_PATH + "black-king.png");

    public static final BufferedImage CHECK_MATE = UiHelper.getPicesImage(GAME_ICONS_PATH + "check.png");
    public static final BufferedImage CHECK = UiHelper.getStatusImage(GAME_ICONS_PATH + "checkmate.png");


}



