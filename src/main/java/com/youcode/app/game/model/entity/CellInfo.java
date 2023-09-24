package com.youcode.app.game.model.entity;

public class CellInfo {
    private int row;
    private char col;
    private Boolean isEmpty;

    public CellInfo(int row, char col, boolean b) {
        this.row = row;
        this.col = col;
        this.isEmpty = b;

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
}
