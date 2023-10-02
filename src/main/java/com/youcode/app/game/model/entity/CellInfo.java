package com.youcode.app.game.model.entity;

import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;

public class CellInfo {
    private int row;
    private char col;
    private Boolean isEmpty;
    private CellColor cellColor;
    private final CellColor pieceColor;
    private final PiecesTypes piecesType;
    private final Integer pieceValue;

    public CellInfo(int row, char col, boolean isEmpty, CellColor cellColor, CellColor pieceColor, PiecesTypes piecesType) {
        this.row = row;
        this.col = col;
        this.isEmpty = isEmpty;
        this.cellColor = cellColor;
        this.pieceColor = pieceColor;
        this.piecesType = piecesType;
        this.pieceValue = getPiecesValue();
    }



    private Integer getPiecesValue() {
        if (piecesType == null) return 0;
        return LogicHelper.generatePieceValue(piecesType);
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getCol() {
        return col;
    }

    public void setCol(char col) {
        this.col = col;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    public CellColor getCellStatus() {
        return cellColor;
    }

    public void setCellStatus(CellColor cellColor) {
        this.cellColor = cellColor;
    }

}
