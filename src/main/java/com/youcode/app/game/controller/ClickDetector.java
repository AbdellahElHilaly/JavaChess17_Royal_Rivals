package com.youcode.app.game.controller;

import com.youcode.app.game.arbiter.BasicArbiter;
import com.youcode.app.game.helper.LocationGenerator;
import com.youcode.app.game.validator.MoveValidator;
import com.youcode.app.ui.component.other.Cell;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ClickDetector {

    private static Cell oldetCell;
    private static Cell nextCell;


    public static void startDetection(List<Cell> cellList) {
        cellList.forEach(ClickDetector::addDetection);
    }

    private static void addDetection(Cell clickedCell) {

        clickedCell.getPiece().getPieceButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handelClick(clickedCell);
            }
        });
    }

    private static void handelClick(Cell clickedCell) {
        cellClickedFocus(clickedCell);
        printInfo(clickedCell);
        boolean isValidate = MoveValidator.validate(oldetCell, nextCell);
        if (isValidate) {
            PieceMover.move(oldetCell, nextCell);
        }
        else PieceMover.confirm_move_click = false;
    }


    public static void cellClickedFocus(Cell clickedCell) {
        if (clickedCell.isEmpty()) handleEmptyClickedCell(clickedCell);
        else handlePieceClickedCell(clickedCell);
    }

    private static void handlePieceClickedCell(Cell clickedCell) {
        if(BasicArbiter.currentPlayer != clickedCell.getPiece().getPieceColor()) return;
        firstPieceClicked(clickedCell);
        changePieceClicked(clickedCell);
        cancelAndChangePieceClicked(clickedCell);
        BoardInfoController.focus(clickedCell);
        BasicArbiter.checkFirstMove();
    }


    private static void changePieceClicked(Cell clickedCell) {
        if (oldetCell != null) {
            oldetCell.setDefaultStyle();
            oldetCell = clickedCell;
            oldetCell.setPieceClickedStyle();
        }
    }

    private static void firstPieceClicked(Cell clickedCell) {
        if (oldetCell == null) {
            clickedCell.setPieceClickedStyle();
            oldetCell = clickedCell;
        }
    }

    private static void cancelAndChangePieceClicked(Cell clickedCell) {
        if (nextCell != null) {
            nextCell.setDefaultStyle();
            nextCell = null;
            oldetCell = clickedCell;
            oldetCell.setPieceClickedStyle();
        }
    }

    private static void handleEmptyClickedCell(Cell clickedCell) {
        if(oldetCell == null) {
            Printer.error("can't move from cell is empty!");
        }
        else if (nextCell == null) {
            newEmptyCellClicked(clickedCell);
        } else {
            if (nextCell == clickedCell) PieceMover.confirm_move_click = true;
            changeEmptyCellClicked(clickedCell);
        }
    }


    private static void changeEmptyCellClicked(Cell clickedCell) {
        nextCell.setDefaultStyle();
        nextCell = clickedCell;
        nextCell.setEmptyClickedStyle();
    }

    private static void newEmptyCellClicked(Cell clickedCell) {
        nextCell = clickedCell;
        nextCell.setEmptyClickedStyle();


    }

    private static void printInfo(Cell clickedCell) {

        ObjectPrinter.json(clickedCell.getCellInfo(), "Cell Info");
        if(oldetCell != null) ObjectPrinter.json(LocationGenerator.get(oldetCell), "old Location");
        if(nextCell != null)  ObjectPrinter.json(LocationGenerator.get(nextCell), "next Location");
    }


}
