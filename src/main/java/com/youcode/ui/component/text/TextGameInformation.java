package com.youcode.ui.component.text;

import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.AppSizes;
import com.youcode.ui.config.TextsSizes;
import com.youcode.ui.guide.Component;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

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
        // Load a custom font (assuming you have the font file)
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("resources/fonts/roboto/Roboto-Bold.ttf"));
            customFont = customFont.deriveFont(Font.BOLD, TextsSizes.Information.get("fontSize"));
            label.setFont(customFont);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(0);
        label.setPreferredSize(new Dimension(200, 50));
        label.setBackground(AppColors.board.get("foreground"));
        label.setForeground(AppColors.TEXT_DARK);
        label.setOpaque(true);
    }



}
