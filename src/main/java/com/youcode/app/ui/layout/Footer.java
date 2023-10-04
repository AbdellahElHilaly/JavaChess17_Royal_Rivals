package com.youcode.app.ui.layout;

import com.youcode.app.ui.component.text.TimerView;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;

import java.awt.*;

public class Footer extends AppPanelImpl {

    private  static   final TimerView timerViewDark = new TimerView();
    private  static   final TimerView timerViewLight = new TimerView();
    public Footer() {
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new GridLayout(1, 2));
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Footer.BACKGROUND);
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.Footer.WIDTH, PanelConfig.Footer.HEIGHT));
    }

    @Override
    public void addComponents() {
        timerViewDark.setMarginLeft(60);
        timerViewLight.setMarginLeft(306);
        add(timerViewDark);
        add(timerViewLight);
    }

    public TimerView getTimerViewDark() {
        return timerViewDark;
    }

    public TimerView getTimerViewLight() {
        return timerViewLight;
    }
}


