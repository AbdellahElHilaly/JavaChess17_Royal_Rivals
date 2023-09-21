package com.youcode.ui.component.text;

import com.youcode.shared.util.config.AppConfig;
import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.AppSizes;
import com.youcode.ui.config.TextsSizes;
import com.youcode.ui.guide.Component;

import javax.swing.*;
import java.awt.*;

public class TextPlayerName extends Component {

    public final JLabel label = new JLabel();

    public TextPlayerName(String text) {
        label.setText(text);
        init();
    }

    @Override
    public void config() {
    }

    @Override
    public void style() {
        label.setFont(new Font("Arial", Font.BOLD, TextsSizes.PlayerName.get("fontSize")));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(0);
        label.setPreferredSize(new Dimension(300, 50));
        label.setBackground(AppColors.header.get("foreground"));
        label.setOpaque(true);
    }


}
