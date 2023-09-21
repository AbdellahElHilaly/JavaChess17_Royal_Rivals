package com.youcode.ui.layout;

import com.youcode.ui.component.text.TimerView;
import com.youcode.ui.guide.PanelComponent;

import javax.swing.*;
import java.awt.*;

public class GamePlayFooter extends PanelComponent {

    private TimerView timerView;

    public GamePlayFooter() {
        timerView = new TimerView();
        init();
    }

    @Override
    public void config() {
    }

    @Override
    public void style() {
    }

    @Override
    public void layout() {
    }

    @Override
    public void compose() {
        panel.add(timerView.label);
    }

    public TimerView getTimerView() {
        return timerView;
    }
}
