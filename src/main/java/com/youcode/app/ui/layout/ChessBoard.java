package com.youcode.app.ui.layout;

import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.guide.AppPanel;
import com.youcode.app.ui.shared.utils.config.PanelConfig;
import com.youcode.app.ui.shared.utils.enums.PiecesNames;

import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard extends AppPanel {

    private final List<Cell> cellsList = new ArrayList<>();

    public ChessBoard() {
        initCellsList();
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new GridLayout(8, 8));
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Board.BACKGROUND);
        setBorder(new LineBorder(PanelConfig.Board.BORDER_COLOR, PanelConfig.Board.BORDER_THICKNESS));
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.Board.WIDTH, PanelConfig.Board.HEIGHT));
    }

    @Override
    public void addComponents() {
        for (Cell cell : cellsList) {
            add(cell);
        }
    }

    private void initCellsList() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                char colChar = (char) ('A' + col);
                Cell cell = new Cell((row + col) % 2 == 0, 8 - row, colChar);
                cellsList.add(cell);
            }
        }
    }

    public void initPieces() {

        cellsList.get(0).setPieceAndUpdate(PiecesNames.ROOK, false);
        cellsList.get(1).setPieceAndUpdate(PiecesNames.KNIGHT, false);
        cellsList.get(2).setPieceAndUpdate(PiecesNames.BISHOP, false);
        cellsList.get(3).setPieceAndUpdate(PiecesNames.QUEEN, false);
        cellsList.get(4).setPieceAndUpdate(PiecesNames.KING, false);
        cellsList.get(5).setPieceAndUpdate(PiecesNames.BISHOP, false);
        cellsList.get(6).setPieceAndUpdate(PiecesNames.KNIGHT, false);
        cellsList.get(7).setPieceAndUpdate(PiecesNames.ROOK, false);

        for (int i = 8; i < 16; i++) {
            cellsList.get(i).setPieceAndUpdate(PiecesNames.PAWN, false);
        }

        cellsList.get(56).setPieceAndUpdate(PiecesNames.ROOK, true);
        cellsList.get(57).setPieceAndUpdate(PiecesNames.KNIGHT, true);
        cellsList.get(58).setPieceAndUpdate(PiecesNames.BISHOP, true);
        cellsList.get(59).setPieceAndUpdate(PiecesNames.QUEEN, true);
        cellsList.get(60).setPieceAndUpdate(PiecesNames.KING, true);
        cellsList.get(61).setPieceAndUpdate(PiecesNames.BISHOP, true);
        cellsList.get(62).setPieceAndUpdate(PiecesNames.KNIGHT, true);
        cellsList.get(63).setPieceAndUpdate(PiecesNames.ROOK, true);

        for (int i = 48; i < 56; i++) {
            cellsList.get(i).setPieceAndUpdate(PiecesNames.PAWN, true);
        }


    }

    public List<Cell> getCellsList() {
        return cellsList;
    }

}
