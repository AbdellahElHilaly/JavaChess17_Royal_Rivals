package com.youcode.app.ui.shared.utils.Const;

import com.youcode.app.ui.shared.helper.UiHelper;
import com.youcode.app.ui.shared.utils.enums.PiecesTypes;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class PiecesImages {

    private static final String PATH = "resources/assets/image/pieces-png/";
    public static final BufferedImage LIGHT_PAWN = UiHelper.getImage(PATH + "white-pawn.png");
    public static final BufferedImage LIGHT_KNIGHT = UiHelper.getImage(PATH + "white-knight.png");
    public static final BufferedImage LIGHT_BISHOP = UiHelper.getImage(PATH + "white-bishop.png");
    public static final BufferedImage LIGHT_ROOK = UiHelper.getImage(PATH + "white-rook.png");
    public static final BufferedImage LIGHT_QUEEN = UiHelper.getImage(PATH + "white-queen.png");
    public static final BufferedImage LIGHT_KING = UiHelper.getImage(PATH + "white-king.png");

    public static final BufferedImage DARK_PAWN = UiHelper.getImage(PATH + "black-pawn.png");
    public static final BufferedImage DARK_KNIGHT = UiHelper.getImage(PATH + "black-knight.png");
    public static final BufferedImage DARK_BISHOP = UiHelper.getImage(PATH + "black-bishop.png");
    public static final BufferedImage DARK_ROOK = UiHelper.getImage(PATH + "black-rook.png");
    public static final BufferedImage DARK_QUEEN = UiHelper.getImage(PATH + "black-queen.png");
    public static final BufferedImage DARK_KING = UiHelper.getImage(PATH + "black-king.png");



}



