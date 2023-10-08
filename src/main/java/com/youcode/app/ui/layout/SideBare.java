package com.youcode.app.ui.layout;

import com.youcode.app.shared.config.PanelConfig;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.component.icons.PieceIcon;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.ui.helper.IconsHandler;

import javax.swing.*;
import java.awt.*;


public class SideBare extends AppPanelImpl {

    /**
     * this bar will contain the pieces that the player had killed
     */

    private final PieceIcon pieceIcon = new PieceIcon();

    SideBare() {
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new GridLayout(6,3));
    }

    @Override
    public void setStyle() {
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.SideBar.WIDTH, PanelConfig.SideBar.HEIGHT));
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    @Override
    public void addComponents() {

    }

    public  void  collectPiece(PiecesTypes piecesTypes, CellColor pieceColor) {
        pieceIcon.getIcon(IconsHandler.getPieces(pieceColor, piecesTypes));
        add(new JLabel(pieceIcon));
    }

    public void reset() {
        removeAll();
        updatePanel();
    }


}
