package com.youcode.app.ui.helper;

import com.youcode.app.shared.Const.AppImages;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.CellStatus;
import com.youcode.app.shared.enums.PiecesTypes;

import java.awt.image.BufferedImage;


public class IconsHandler {
    public static BufferedImage getPieces(CellColor pieceColor, PiecesTypes piecesTypes) {
        if (pieceColor == CellColor.LIGHT) {
            return switch (piecesTypes) {
                case PAWN -> AppImages.LIGHT_PAWN;
                case KNIGHT -> AppImages.LIGHT_KNIGHT;
                case BISHOP -> AppImages.LIGHT_BISHOP;
                case ROOK -> AppImages.LIGHT_ROOK;
                case QUEEN -> AppImages.LIGHT_QUEEN;
                case KING -> AppImages.LIGHT_KING;
            };
        } else {
            return switch (piecesTypes) {
                case PAWN -> AppImages.DARK_PAWN;
                case KNIGHT -> AppImages.DARK_KNIGHT;
                case BISHOP -> AppImages.DARK_BISHOP;
                case ROOK -> AppImages.DARK_ROOK;
                case QUEEN -> AppImages.DARK_QUEEN;
                case KING -> AppImages.DARK_KING;
            };
        }
    }

    public static BufferedImage getStatusIcon(CellStatus cellStatus) {
        return switch (cellStatus) {
            case CHECK -> AppImages.CHECK;
            case CHECK_MATE -> AppImages.CHECK_MATE;
        };
    }
}
