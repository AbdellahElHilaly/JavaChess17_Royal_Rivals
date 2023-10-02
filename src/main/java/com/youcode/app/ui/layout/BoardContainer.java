package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;

import java.awt.*;

public class BoardContainer extends AppPanelImpl {

    private final ChessBoard chessBoard = new ChessBoard();

    public BoardContainer() {
        init();
    }
    @Override
    public void setLayout() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
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
        add(chessBoard);
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}
