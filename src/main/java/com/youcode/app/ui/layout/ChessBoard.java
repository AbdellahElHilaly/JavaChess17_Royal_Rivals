package com.youcode.app.ui.layout;

import com.youcode.app.ui.component.other.Cell;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.game.helper.LogicHelper;
import com.youcode.app.shared.config.PanelConfig;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;

import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard extends AppPanelImpl {

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
        cellsList.forEach(this::add);
    }

    private void initCellsList() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                char colChar = (char) ('A' + col);
                Cell cell = new Cell(LogicHelper.getcellcolor(row, col), 8 - row, colChar);
                cellsList.add(cell);
            }
        }
    }

    public void initPieces() {
        setMultiplePieces(0, CellColor.DARK, PiecesTypes.ROOK, PiecesTypes.KNIGHT, PiecesTypes.BISHOP, PiecesTypes.QUEEN,
                PiecesTypes.KING, PiecesTypes.BISHOP, PiecesTypes.KNIGHT, PiecesTypes.ROOK);

        setMultiplePieces(56, CellColor.LIGHT, PiecesTypes.ROOK, PiecesTypes.KNIGHT, PiecesTypes.BISHOP, PiecesTypes.QUEEN,
                PiecesTypes.KING, PiecesTypes.BISHOP, PiecesTypes.KNIGHT, PiecesTypes.ROOK);

        setPawns(8, 16, CellColor.DARK);
        setPawns(48, 56, CellColor.LIGHT);
    }

    private void setMultiplePieces(int row, CellColor cellColor, PiecesTypes... pieces) {
        for (int i = 0; i < pieces.length; i++) {
            cellsList.get(row + i).setPieceAndUpdate(pieces[i], cellColor);
        }
    }

    private void setPawns(int start, int end, CellColor status) {
        for (int i = start; i < end; i++) {
            cellsList.get(i).setPieceAndUpdate(PiecesTypes.PAWN, status);
        }
    }

    public List<Cell> getCellsList() {
        return cellsList;
    }

    public void reset() {
        cellsList.forEach(Cell::reset); // for each with stream is better , i test it in the past

    }
}
