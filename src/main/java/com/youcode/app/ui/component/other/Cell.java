package com.youcode.app.ui.component.other;

import com.youcode.app.game.model.entity.CellInfo;
import com.youcode.app.ui.guide.AppPanel;
import com.youcode.app.ui.shared.utils.config.PanelConfig;
import com.youcode.app.ui.shared.utils.enums.PiecesNames;
import com.youcode.libs.print.ObjectPrinter;
import com.youcode.libs.print.Printer;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cell extends AppPanel {

    private final int row;
    private final char col;

    private final Boolean isBackgroundLight;
    private Piece piece;

    public Cell(Boolean isBackgroundLight, int row, char col) {
        this.isBackgroundLight = isBackgroundLight;
        this.row = row;
        this.col = col;
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new BorderLayout());
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Cell.getBackground(isBackgroundLight));
    }

    @Override
    public void build() {

    }

    @Override
    public void addComponents() {

    }

    public void setPieceAndUpdate(PiecesNames piecesNames , Boolean isPieceLight) {
        piece = new Piece(isPieceLight, isBackgroundLight, piecesNames);
        add(piece, BorderLayout.CENTER);
        updateCell();
    }

    private void updateCell() {
        revalidate();
        repaint();
    }

    public Piece getPiece() {
        return piece;
    }

    public CellInfo getCellInfo() {
        return new CellInfo(row, col, piece == null);
    }




    public boolean isEmpty() {
        return piece == null;
    }


}
