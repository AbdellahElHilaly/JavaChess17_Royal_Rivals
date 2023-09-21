package com.youcode.ui.layout;

import com.youcode.ui.component.text.TimerView;
import com.youcode.ui.config.AppColors;
import com.youcode.ui.guide.PanelComponent;

import javax.swing.*;
import java.awt.*;

public class GamePlayFooter extends PanelComponent {

    private final TimerView timerView;

    public GamePlayFooter() {
        timerView = new TimerView();
        init();
    }

    @Override
    public void config() {
        this.panel.setBounds(0, 0, 200, 50);
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
        panel.add(timerView.label);
    }


}
