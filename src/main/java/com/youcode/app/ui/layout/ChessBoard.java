package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.AppPanel;
import com.youcode.app.ui.shared.config.PanelConfig;

import javax.swing.border.LineBorder;
import java.awt.*;

public class ChessBoard extends AppPanel {

    public ChessBoard() {
        init();
    }

    @Override
    public void setLayout() {
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
    }
}
