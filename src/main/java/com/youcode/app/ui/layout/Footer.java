package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.ui.shared.utils.config.PanelConfig;

import java.awt.*;

public class Footer extends AppPanelImpl {

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
