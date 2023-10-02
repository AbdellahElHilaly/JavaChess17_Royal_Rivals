package com.youcode.app.ui.component.text;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.shared.config.TextConfig;
import com.youcode.libs.util.config.AppConfig;

import javax.swing.*;

public class BoardInformation extends JLabel implements AppComponent {

    public BoardInformation() {
        super(AppConfig.APP_NAME);
        init();
    }

    @Override
    public void setStyle() {
        setFont(TextConfig.GameInfo.FONT);
        setForeground(TextConfig.GameInfo.COLOR);
        setBackground(TextConfig.GameInfo.BACKGROUND);



    }

    @Override
    public void build() {
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setOpaque(false);
    }

    @Override
    public void addComponents() {

    }
}
