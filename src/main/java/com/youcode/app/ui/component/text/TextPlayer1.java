package com.youcode.app.ui.component.text;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.ui.shared.utils.config.TextConfig;

import javax.swing.*;

public class TextPlayer1 extends JLabel implements AppComponent {

    public TextPlayer1() {
        super("Player 1");
        init();
    }

    @Override
    public void setStyle() {
        setFont(TextConfig.PlayerName.FONT);
        setForeground(TextConfig.PlayerName.COLOR);
    }

    @Override
    public void build() {
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setPreferredSize(TextConfig.PlayerName.DIMENSION);
        setOpaque(false);

    }

    @Override
    public void addComponents() {

    }
}
