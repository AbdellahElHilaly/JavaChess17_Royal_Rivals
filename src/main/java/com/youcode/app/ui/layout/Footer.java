package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.AppPanel;
import com.youcode.app.ui.shared.config.PanelConfig;

import java.awt.*;

public class Footer extends AppPanel {

    public Footer() {
        init();
    }

    @Override
    public void setLayout() {

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

    }
}
