package com.youcode.app.ui.component.text;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.ui.shared.utils.config.TextConfig;

import javax.swing.*;
import java.util.Date;

public class TimerView extends JLabel implements AppComponent {

    private Date time;

    public TimerView() {
        super("00:00:00");
        init();
    }
    @Override
    public void setStyle() {
        setFont(TextConfig.Timer.FONT);
        setForeground(TextConfig.Timer.FOREGROUND);
    }

    @Override
    public void build() {
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        setPreferredSize(TextConfig.Timer.DIMENSION);
        setOpaque(false);
    }

    @Override
    public void addComponents() {

    }
}
