package com.youcode.app.ui.layout;

import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.ui.shared.utils.config.PanelConfig;

import java.awt.*;

public class Header extends AppPanelImpl {

    public Header() {
        init();
    }

    @Override
    public void setLayout() {
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Header.BACKGROUND);
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.Header.WIDTH, PanelConfig.Header.HEIGHT));
    }

    @Override
    public void addComponents() {

    }
}
