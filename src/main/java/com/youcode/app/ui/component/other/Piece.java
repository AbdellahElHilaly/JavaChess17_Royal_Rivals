package com.youcode.app.ui.component.other;

import com.youcode.app.ui.component.Buttons.PieceButton;
import com.youcode.app.ui.component.icons.PieceIcon;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.helper.IconsHandler;

import javax.swing.*;
import java.awt.*;

public class Piece extends AppPanelImpl {

    private  CellColor pieceColor;
    private final   CellColor cellColor;
    private PiecesTypes piecesType;
    private final PieceButton pieceButton;
    private  PieceIcon pieceIcon;
    private final boolean isCellEmpty;

    public Piece(CellColor pieceColor, CellColor cellColor, PiecesTypes piecesType, boolean isCellEmpty) {
        this.pieceColor = pieceColor;
        this.cellColor = cellColor;
        this.piecesType = piecesType;
        this.isCellEmpty = isCellEmpty;
        pieceButton = new PieceButton(cellColor);
        init();
    }

    public Piece(CellColor cellColor) {
        this.cellColor = cellColor;
        this.pieceColor = null;
        this.piecesType = null;
        this.isCellEmpty = true;
        pieceButton = new PieceButton(cellColor);
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
        if (isCellEmpty) addEmptyButton(); else addButtonIcon();

    }

    private void addEmptyButton() {
        add(pieceButton, BorderLayout.CENTER);
    }


    private void addButtonIcon() {
        if(pieceIcon == null) pieceIcon = new PieceIcon();
        pieceIcon.getIcon(IconsHandler.get(pieceColor == CellColor.LIGHT, piecesType));
        pieceButton.setIcon(pieceIcon);
        add(pieceButton, BorderLayout.CENTER);
    }


    public JButton getPieceButton() {
        return pieceButton;
    }


    public CellColor getPieceColor() {
        return pieceColor;
    }

    public PiecesTypes getPiecesType() {
        return piecesType;
    }



    public void addPieceIcon(PiecesTypes piecesType, CellColor pieceStatus) {
        if(pieceIcon == null) pieceIcon = new PieceIcon();
        pieceIcon.getIcon(IconsHandler.get(pieceStatus == CellColor.LIGHT, piecesType));
        pieceButton.setIcon(pieceIcon);
    }

    public void  initialize() {
        pieceButton.destroyIcon();
        pieceButton.updateComponentUI();
        piecesType = null;
        pieceColor = null;
    }

    public void setPieceColor(CellColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public void setPiecesType(PiecesTypes piecesType) {
        this.piecesType = piecesType;
    }
}
