package com.youcode.app.ui.layout;

import com.youcode.app.ui.component.text.TimerView;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;

import java.awt.*;

public class Footer extends AppPanelImpl {

    private  static  final TimerView timerView1 = new TimerView();
    private  static  final TimerView timerView2 = new TimerView();
    public Footer() {
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new BorderLayout());
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
        add(timerView1, BorderLayout.WEST);
        add(timerView2, BorderLayout.EAST);
    }
}
