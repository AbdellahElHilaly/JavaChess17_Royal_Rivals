package com.youcode.app.ui.component.text;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.shared.config.TextConfig;

import javax.swing.*;

public class TextPlayer extends JLabel implements AppComponent {

    private final int marginLeft;
    private final int marginRight;
    public TextPlayer(int marginLeft, int marginRight) {
        super("Player 1");
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
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
        setBorder(BorderFactory.createEmptyBorder(0, marginLeft, 0, marginRight));
        setOpaque(false);

    }

    @Override
    public void addComponents() {

    }
}
