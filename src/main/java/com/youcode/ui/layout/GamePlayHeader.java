package com.youcode.ui.layout;

import com.youcode.shared.print.Printer;
import com.youcode.ui.component.text.TextGameInformation;
import com.youcode.ui.component.text.TextPlayerName;
import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.AppSizes;
import com.youcode.ui.guide.PanelComponent;


import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class GamePlayHeader extends PanelComponent {

    public GamePlayHeader() {
        init();
    }

    @Override
    public void config() {
        this.panel.setBounds(AppSizes.header.get("x"), AppSizes.header.get("y"), AppSizes.header.get("width"), AppSizes.header.get("height"));
    }

    @Override
    public void style() {
        this.panel.setBackground(AppColors.header.get("background"));
    }

    @Override
    public void layout() {
        this.panel.setLayout(new GridLayout(1, 1));
    }



    @Override
    public void compose() {

        TextPlayerName player1 = new TextPlayerName("Player 1");
        TextPlayerName player2 = new TextPlayerName("Player 2");
        TextGameInformation gameInfo = new TextGameInformation();

        this.panel.add(player1.label);
        this.panel.add(gameInfo.label);
        this.panel.add(player2.label);

    }
}
