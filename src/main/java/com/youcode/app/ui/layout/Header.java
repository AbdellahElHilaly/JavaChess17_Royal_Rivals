package com.youcode.app.ui.layout;

import com.youcode.app.ui.component.text.BoardInformation;
import com.youcode.app.ui.component.text.TextPlayer;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;

import java.awt.*;

public class Header extends AppPanelImpl {
    private static final TextPlayer textPlayer1 = new TextPlayer(50, 0);
    private static final TextPlayer textPlayer2 = new TextPlayer(0, 50);
    private static final BoardInformation boardInformation = new BoardInformation();
    public Header() {
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 30));
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Header.BACKGROUND);
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.Footer.WIDTH, PanelConfig.Footer.HEIGHT));

    }

    @Override
    public void addComponents() {
        add(textPlayer1);
        add(boardInformation);
        add(textPlayer2);

    }
}
