package com.youcode.ui.component.text;

import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.TextsSizes;
import com.youcode.ui.guide.Component;

import javax.swing.*;
import java.awt.*;

public class TimerView extends Component {

    public final JLabel label = new JLabel();
    public final Timer timer = new Timer(1000, null);

    public TimerView() {
        label.setText("00:00");
        init();
    }

    @Override
    public void config() {

    }

    @Override
    public void style() {
        label.setFont(new Font("Arial", Font.BOLD, TextsSizes.Timer.get("fontSize")));
        label.setForeground(AppColors.TEXT);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(200, 50));
        label.setBackground(AppColors.header.get("background"));
        label.setOpaque(true);
    }
}
