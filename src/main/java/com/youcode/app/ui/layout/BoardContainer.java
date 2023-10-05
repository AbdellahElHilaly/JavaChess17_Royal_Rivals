package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;

import java.awt.*;

public class BoardContainer extends AppPanelImpl {

    private final ChessBoard chessBoard = new ChessBoard();
    private  final SideBare sideBareDark = new SideBare();
    private  final SideBare sideBareLight = new SideBare();

    public BoardContainer() {
        init();
    }
    @Override
    public void setLayout() {
        setLayout(new BorderLayout());
    }

    @Override
    public void setStyle() {
        this.setBackground(PanelConfig.BoardContainer.BACKGROUND);
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.BoardContainer.WIDTH, PanelConfig.BoardContainer.HEIGHT));
    }

    @Override
    public void addComponents() {
        add(sideBareDark, BorderLayout.WEST);
        add(chessBoard, BorderLayout.CENTER);
        add(sideBareLight, BorderLayout.EAST);
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public SideBare getSideBareDark() {
        return sideBareDark;
    }

    public SideBare getSideBareLight() {
        return sideBareLight;
    }
}
