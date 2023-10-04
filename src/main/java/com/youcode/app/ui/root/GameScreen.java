package com.youcode.app.ui.root;

import com.youcode.app.ui.guide.impl.AppFrameImpl;
import com.youcode.app.ui.layout.BoardContainer;
import com.youcode.app.ui.layout.Footer;
import com.youcode.app.ui.layout.Header;
import com.youcode.app.shared.Const.AppSizes;
import com.youcode.libs.util.config.AppConfig;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends AppFrameImpl {

    private final Header header = new Header();
    private final BoardContainer boardContainer = new BoardContainer();
    private final Footer footer = new Footer();


    public GameScreen() {
    }


    @Override
    public void setLayout() {
        this.setLayout(new BorderLayout());
    }

    @Override
    public void setStyle() {

    }

    @Override
    public void build() {
        setTitle(AppConfig.APP_NAME);
        setSize(AppSizes.MAX_WIDTH, AppSizes.FRAM_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width - AppSizes.MAX_WIDTH + 10, 0);
    }

    @Override
    public void addComponents() {
        add(header, BorderLayout.NORTH);
        add(boardContainer, BorderLayout.CENTER);
        add(footer, BorderLayout.SOUTH);
    }

    public BoardContainer getBoardContainer() {
        return boardContainer;
    }

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }


}


