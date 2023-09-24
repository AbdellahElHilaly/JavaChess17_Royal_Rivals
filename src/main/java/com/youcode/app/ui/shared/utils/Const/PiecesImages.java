package com.youcode.app.ui.shared.utils.Const;

import com.youcode.app.ui.shared.helper.UiHelper;
import com.youcode.app.ui.shared.utils.enums.PiecesNames;

import java.awt.image.BufferedImage;

public class PiecesImages {

    private static final String PATH = "resources/assets/image/pieces-png/";
    private static final BufferedImage LIGHT_PAWN = UiHelper.getImage(PATH + "white-pawn.png");
    private static final BufferedImage LIGHT_KNIGHT = UiHelper.getImage(PATH + "white-knight.png");
    private static final BufferedImage LIGHT_BISHOP = UiHelper.getImage(PATH + "white-bishop.png");
    private static final BufferedImage LIGHT_ROOK = UiHelper.getImage(PATH + "white-rook.png");
    private static final BufferedImage LIGHT_QUEEN = UiHelper.getImage(PATH + "white-queen.png");
    private static final BufferedImage LIGHT_KING = UiHelper.getImage(PATH + "white-king.png");

    private static final BufferedImage DARK_PAWN = UiHelper.getImage(PATH + "black-pawn.png");
    private static final BufferedImage DARK_KNIGHT = UiHelper.getImage(PATH + "black-knight.png");
    private static final BufferedImage DARK_BISHOP = UiHelper.getImage(PATH + "black-bishop.png");
    private static final BufferedImage DARK_ROOK = UiHelper.getImage(PATH + "black-rook.png");
    private static final BufferedImage DARK_QUEEN = UiHelper.getImage(PATH + "black-queen.png");
    private static final BufferedImage DARK_KING = UiHelper.getImage(PATH + "black-king.png");


    public static BufferedImage get(boolean isLight, PiecesNames piecesNames) {
        if (isLight) {
            switch (piecesNames) {
                case PAWN:
                    return LIGHT_PAWN;
                case KNIGHT:
                    return LIGHT_KNIGHT;
                case BISHOP:
                    return LIGHT_BISHOP;
                case ROOK:
                    return LIGHT_ROOK;
                case QUEEN:
                    return LIGHT_QUEEN;
                case KING:
                    return LIGHT_KING;
            }
        } else {
            switch (piecesNames) {
                case PAWN:
                    return DARK_PAWN;
                case KNIGHT:
                    return DARK_KNIGHT;
                case BISHOP:
                    return DARK_BISHOP;
                case ROOK:
                    return DARK_ROOK;
                case QUEEN:
                    return DARK_QUEEN;
                case KING:
                    return DARK_KING;
            }
        }
        return null;
    }
}



