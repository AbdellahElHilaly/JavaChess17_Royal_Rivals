package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.AppPanel;
import com.youcode.app.ui.shared.Const.AppSizes;
import com.youcode.app.ui.shared.config.PanelConfig;
import com.youcode.libs.util.config.AppConfig;

import java.awt.*;

public class BoardContainer extends AppPanel {

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
        setPreferredSize(new Dimension(AppSizes.MAX_WIDTH, PanelConfig.BoardContainer.HEIGHT));
    }

    @Override
    public void addComponents() {
        add(chessBoard);
    }
}
