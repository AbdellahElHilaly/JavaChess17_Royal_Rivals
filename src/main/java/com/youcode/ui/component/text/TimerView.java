package com.youcode.ui.component.text;

import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.TextsSizes;
import com.youcode.ui.guide.Component;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

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

        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("resources/fonts/electron/TypoDigitDemoItalic-JRogn.ttf"));
            customFont = customFont.deriveFont(Font.BOLD, TextsSizes.Timer.get("fontSize"));
            label.setFont(customFont);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }


        label.setForeground(AppColors.TEXT);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBackground(AppColors.board.get("foreground"));
        label.setForeground(AppColors.TEXT_DARK);

        label.setOpaque(true);
    }
}
