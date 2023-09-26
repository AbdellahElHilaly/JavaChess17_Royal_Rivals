package com.youcode.app.ui.shared.helper;

import com.youcode.app.ui.shared.utils.enums.CellColor;
import com.youcode.app.ui.shared.utils.enums.PiecesTypes;


public class LogicHelper {
    public static CellColor getcellcolor(int row, int col) {
        return (row + col) % 2 == 0 ? CellColor.LIGHT : CellColor.DARK;
    }

    public static Integer generatePieceValue(PiecesTypes piecesType) {
        switch (piecesType) {
            case KING:
                return 10000;
            case QUEEN:
                return 9;
            case ROOK:
                return 5;
            case BISHOP:
            case KNIGHT:
                return 3;
            case PAWN:
                return 1;
            default:
                return 0;
        }
    }

    public static int generateX(char col) {
        return col - 'A';
    }

    public static int generateY(int row) {
        return 8 - row;
    }


}
