package com.youcode.app.ui.layout;

import com.youcode.app.ui.component.text.BoardInformation;
import com.youcode.app.ui.component.text.TextPlayer;
import com.youcode.app.ui.guide.impl.AppPanelImpl;
import com.youcode.app.shared.config.PanelConfig;

import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Header extends AppPanelImpl {
    private  final TextPlayer textPlayerDark = new TextPlayer(10, 0);
    private  final TextPlayer textPlayerLight = new TextPlayer(0, 50);
    private  final BoardInformation boardInformation = new BoardInformation();
    public Header() {
        init();
    }

    @Override
    public void setLayout() {
        setLayout(new BorderLayout());
    }

    @Override
    public void setStyle() {
        setBackground(PanelConfig.Header.BACKGROUND);
        int pd = 10;
        setBorder(new EmptyBorder(pd, pd, pd, pd));
    }

    @Override
    public void build() {
        setPreferredSize(new Dimension(PanelConfig.Footer.WIDTH, PanelConfig.Footer.HEIGHT));
        setOpaque(true);

    }

    @Override
    public void addComponents() {
        add(textPlayerDark, BorderLayout.WEST);
        add(boardInformation, BorderLayout.CENTER);
        add(textPlayerLight, BorderLayout.EAST);

    }

    public BoardInformation getBoardInformation() {
        return boardInformation;
    }

    public TextPlayer getTextPlayerDark() {
        return textPlayerDark;
    }
    public TextPlayer getTextPlayerLight() {
        return textPlayerLight;
    }
}
