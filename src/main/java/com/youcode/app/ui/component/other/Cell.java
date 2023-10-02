package com.youcode.app.ui.component.other;

import com.youcode.app.game.model.entity.CellInfo;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.ui.shared.utils.config.PanelConfig;
import com.youcode.app.ui.shared.utils.enums.CellColor;
import com.youcode.app.ui.shared.utils.enums.PiecesTypes;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.awt.*;

public class Cell extends AppPanelImpl {

    private final int row;
    private final char col;
    private  CellColor cellColor;
    private Piece piece;
    private boolean isCellEmpty;

    public Cell(CellColor status, int row, char col) {
        this.cellColor = status;
        this.row = row;
        this.col = col;
        this.isCellEmpty = true;
        init();
    }



    @Override
    public void setLayout() {
        setLayout(new BorderLayout());
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Cell.getBackground(cellColor));
    }

    @Override
    public void build() {

    }

    @Override
    public void addComponents() {
        addVirtualPiece();
    }

    private void addVirtualPiece() {
        piece = new Piece(cellColor);
        add(piece, BorderLayout.CENTER);
    }


    public void setPieceAndUpdate(PiecesTypes piecesType, CellColor PieceStatus) {
        remove(piece);
        piece = new Piece(PieceStatus, cellColor, piecesType, false);
        add(piece, BorderLayout.CENTER);
        isCellEmpty = false;
        updatePanel();
    }




    public Piece getPiece() {
        return piece;
    }

    public CellInfo getCellInfo() {
        return new CellInfo(row, col, isCellEmpty, cellColor, piece.getPieceStatus(), piece.getPiecesType());
    }

    public boolean isEmpty() {
        return isCellEmpty;
    }

    public void setEmptyClickedStyle() {
        setBorder(PanelConfig.Cell.CLICKED_EMPTY_BORDER);
    }
    public  void setPieceClickedStyle() {
        setBorder(PanelConfig.Cell.CLICKED_PIECE_BORDER);
    }

    public void setDefaultStyle() {
        setBackground(PanelConfig.Cell.getBackground(cellColor));
        setBorder(null);
    }

    public void setValidStyle() {
        setBorder(PanelConfig.Cell.VALID_MOVE_BORDER);
    }

    public void setInvalidStyle() {
        setBorder(PanelConfig.Cell.INVALID_MOVE_BORDER);
    }

    public CellColor getCellColor() {
        return cellColor;
    }

    public void removePieceAndUpdate() {

        piece.initialize();
        isCellEmpty = true;
        updatePanel();
    }

    public void setMovingPieceAndUpdate(PiecesTypes piecesType, CellColor pieceStatus) {
        piece.addPieceIcon(piecesType, pieceStatus);
        piece.setPieceStatus(pieceStatus);
        piece.setPiecesType(piecesType);
        isCellEmpty = false;
        updatePanel();
    }
}