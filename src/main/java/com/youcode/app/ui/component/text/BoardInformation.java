package com.youcode.app.ui.component.text;

import com.youcode.app.game.model.entity.Player;
import com.youcode.app.shared.Const.AppSizes;
import com.youcode.app.shared.config.PanelConfig;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.shared.config.TextConfig;
import com.youcode.libs.util.config.AppConfig;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

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

        int padding_w = 0;
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

    public void info(String message) {
        setForeground(TextConfig.GameInfo.COLOR);
        setText(message);
    }

    public void warn(String message) {
        setForeground(TextConfig.GameInfo.COLOR_WARN);
        setText(message);
    }

    public void error(String message) {
        setForeground(TextConfig.GameInfo.COLOR_ERROR);
        setText(message);
    }

    public void success(String message) {
        setForeground(TextConfig.GameInfo.COLOR_SUCCESS);
        setText(message);
    }

    public void reset() {
        setForeground(TextConfig.GameInfo.COLOR);
        setText(AppConfig.APP_NAME);
    }


}
