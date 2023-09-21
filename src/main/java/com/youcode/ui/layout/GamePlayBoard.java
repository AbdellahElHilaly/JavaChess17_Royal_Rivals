package com.youcode.ui.layout;
import com.youcode.ui.config.AppColors;
import com.youcode.ui.guide.PanelComponent;

import java.awt.*;

public class GamePlayBoard extends PanelComponent {

    public GamePlayBoard() {
        init();
    }

    @Override
    public void config() {
    }
    @Override
    public void style() {
        this.panel.setBackground(AppColors.board.get("background"));
    }

    @Override
    public void layout() {
        this.panel.setLayout(new GridLayout(1, 1));
    }

    @Override
    public void compose() {
    }
}
