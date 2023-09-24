package com.youcode.app.game.controller;

import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class CellDetector {

    public static void startDetection(List<Cell> cellList) {
        cellList.forEach(CellDetector::addDetection);
    }

    private static void addDetection(Cell cell) {
        if (!cell.isEmpty()) {
            cell.getPiece().getPieceButton().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Printer.info("Piece button clicked");
                    ObjectPrinter.table(cell.getCellInfo(), "Cell Info");
                }
            });
        } else {
            Printer.info("Cell is empty");
        }
    }
}
