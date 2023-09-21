package com.youcode.ui.component.text;

import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.AppSizes;
import com.youcode.ui.config.TextsSizes;
import com.youcode.ui.guide.Component;

import javax.swing.*;
import java.awt.*;

public class TextGameInformation extends Component {

    public final JLabel label = new JLabel();

    public TextGameInformation() {
        label.setText("Game Information");
        init();
    }

    @Override
    public void config() {
        label.setBounds(AppSizes.board.get("x"), AppSizes.board.get("y"), AppSizes.board.get("width"), AppSizes.board.get("height"));
    }

    @Override
    public void style() {
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(0);
        label.setPreferredSize(new Dimension(200, 50));
        label.setBackground(AppColors.LIGHT);
        label.setForeground(AppColors.PRIMARY_DARK);
        label.setOpaque(true);

    }


}
