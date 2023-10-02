package com.youcode.app.ui.helper;

import com.youcode.app.shared.Const.PiecesImages;
import com.youcode.app.shared.enums.PiecesTypes;

import java.awt.image.BufferedImage;


public class IconsHandler {
    public static BufferedImage get(boolean isLight, PiecesTypes piecesTypes) {
        if (isLight) {
            switch (piecesTypes) {
                case PAWN:
                    return PiecesImages.LIGHT_PAWN;
                case KNIGHT:
                    return PiecesImages.LIGHT_KNIGHT;
                case BISHOP:
                    return PiecesImages.LIGHT_BISHOP;
                case ROOK:
                    return PiecesImages.LIGHT_ROOK;
                case QUEEN:
                    return PiecesImages.LIGHT_QUEEN;
                case KING:
                    return PiecesImages.LIGHT_KING;
            }
        } else {
            switch (piecesTypes) {
                case PAWN:
                    return PiecesImages.DARK_PAWN;
                case KNIGHT:
                    return PiecesImages.DARK_KNIGHT;
                case BISHOP:
                    return PiecesImages.DARK_BISHOP;
                case ROOK:
                    return PiecesImages.DARK_ROOK;
                case QUEEN:
                    return PiecesImages.DARK_QUEEN;
                case KING:
                    return PiecesImages.DARK_KING;
            }
        }
        return null;
    }
}
