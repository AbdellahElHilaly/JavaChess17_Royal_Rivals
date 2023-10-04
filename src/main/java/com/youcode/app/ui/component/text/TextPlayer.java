package com.youcode.app.ui.component.text;

import com.youcode.app.shared.config.PanelConfig;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.shared.config.TextConfig;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

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
        setBackground(PanelConfig.Header.BACKGROUND);

        int padding_w = 80;
        int padding_h = PanelConfig.Header.HEIGHT;
        setBorder(new EmptyBorder(padding_h, padding_w, padding_h, padding_w));
    }

    @Override
    public void build() {
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setOpaque(true);

    }

    @Override
    public void addComponents() {

    }

    public void setPlayerInfo(String name, CellColor color) {
        String icon = color == CellColor.DARK ? "⚫" : "⚪";
        setText(icon + " " + name);
    }
}
