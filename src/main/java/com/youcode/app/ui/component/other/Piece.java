package com.youcode.app.ui.component.other;

import com.youcode.app.ui.guide.AppPanel;
import com.youcode.app.ui.shared.utils.Const.PiecesImages;
import com.youcode.app.ui.shared.utils.config.PanelConfig;
import com.youcode.app.ui.shared.utils.enums.PiecesNames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;

public class Piece extends AppPanel {

    private final Boolean isPieceLight;
    private final Boolean isBackgroundLight;
    private final PiecesNames piecesNames;
    private JButton pieceButton;

    public Piece(Boolean isPieceLight, Boolean isBackgroundLight, PiecesNames piecesNames) {
        this.isPieceLight = isPieceLight;
        this.isBackgroundLight = isBackgroundLight;
        this.piecesNames = piecesNames;
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
        BufferedImage icon = PiecesImages.get(isPieceLight, piecesNames);
        pieceButton = handelPieceButton(icon);
        add(pieceButton, BorderLayout.CENTER);
    }

    private JButton handelPieceButton(BufferedImage icon) {
        JButton button = new JButton(new ImageIcon(icon));
        button.setBorder(null);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        return button;
    }

    public JButton getPieceButton() {
        return pieceButton;
    }


}
