package com.youcode.app.ui.helper;

import com.youcode.app.shared.Const.PiecesImages;
import com.youcode.app.shared.enums.PiecesTypes;

import java.awt.image.BufferedImage;


public class IconsHandler {
    public static BufferedImage get(boolean isLight, PiecesTypes piecesTypes) {
        if (isLight) {
            return switch (piecesTypes) {
                case PAWN -> PiecesImages.LIGHT_PAWN;
                case KNIGHT -> PiecesImages.LIGHT_KNIGHT;
                case BISHOP -> PiecesImages.LIGHT_BISHOP;
                case ROOK -> PiecesImages.LIGHT_ROOK;
                case QUEEN -> PiecesImages.LIGHT_QUEEN;
                case KING -> PiecesImages.LIGHT_KING;
            };
        } else {
            return switch (piecesTypes) {
                case PAWN -> PiecesImages.DARK_PAWN;
                case KNIGHT -> PiecesImages.DARK_KNIGHT;
                case BISHOP -> PiecesImages.DARK_BISHOP;
                case ROOK -> PiecesImages.DARK_ROOK;
                case QUEEN -> PiecesImages.DARK_QUEEN;
                case KING -> PiecesImages.DARK_KING;
            };
        }
    }
}
