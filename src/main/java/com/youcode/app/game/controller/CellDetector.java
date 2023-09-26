package com.youcode.app.game.controller;

import com.youcode.app.game.model.entity.Location;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CellDetector {

    private static Cell oldetCell;
    private static Cell nextCell;


    public static void startDetection(List<Cell> cellList) {
        cellList.forEach(CellDetector::addDetection);
    }

    private static void addDetection(Cell clickedCell) {
        clickedCell.getPiece().getPieceButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cellClicked(clickedCell);
                printInfo(clickedCell);
            }
        });
    }


    public static void cellClicked(Cell clickedCell) {
        if (clickedCell.isEmpty()) handleEmptyClickedCell(clickedCell);
        else handlePieceClickedCell(clickedCell);

    }

    private static void handlePieceClickedCell(Cell clickedCell) {
        if (nextCell != null) nextCell.setDefaultStyle();
        if (oldetCell == null) {
            clickedCell.setPieceClickedStyle();
            oldetCell = clickedCell;
        } else {
            oldetCell.setDefaultStyle();
            oldetCell = clickedCell;
            clickedCell.setPieceClickedStyle();
        }
    }

    private static void handleEmptyClickedCell(Cell clickedCell) {
       if (nextCell == null && oldetCell != null) {
            nextCell = clickedCell;
            nextCell.setEmptyClickedStyle();
        } else if (oldetCell != null){
            nextCell.setDefaultStyle();
            nextCell = clickedCell;
            nextCell.setEmptyClickedStyle();
        }
    }

    private static void printInfo(Cell clickedCell) {
        ObjectPrinter.json(clickedCell.getCellInfo(), "Cell Info");
        ObjectPrinter.json(Location.setX_Y(clickedCell.getCellInfo()), "Location Info");
    }


}
