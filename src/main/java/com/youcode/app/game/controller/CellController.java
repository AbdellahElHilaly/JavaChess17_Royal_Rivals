package com.youcode.app.game.controller;

import com.youcode.app.game.helper.LocationGenerator;
import com.youcode.app.game.model.entity.Location;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.other.Cell;

public class CellController {

    public static Location getLocation(Cell cell) {
        return LocationGenerator.generate(cell);
    }


    public  static void replacePiece(Cell newCell, Cell oldeCell) {
        oldeCell.replacePieceAndUpdate(newCell.getPiece().getPiecesType(), newCell.getPiece().getPieceColor());
    }

    public static void upgrade(Cell cell, PiecesTypes piecesTypes, CellColor cellColor) {
        cell.replacePieceAndUpdate(piecesTypes, cellColor);
    }


}
