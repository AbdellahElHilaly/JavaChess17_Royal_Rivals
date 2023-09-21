package com.youcode.ui.root;

import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.AppSizes;
import com.youcode.ui.layout.GamePlayBoard;
import com.youcode.ui.layout.GamePlayFooter;
import com.youcode.ui.layout.GamePlayHeader;
import com.youcode.ui.guide.FrameComponent;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends FrameComponent {

    GamePlayHeader headerPanel = new GamePlayHeader();
    GamePlayBoard boardPanel = new GamePlayBoard();
    GamePlayFooter footerPanel = new GamePlayFooter();


    @Override
    public void config() {
        this.frame.setTitle("Chess Game");
        this.frame.setSize(AppSizes.board.get("width"), AppSizes.board.get("height"));
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
    }

    @Override
    public void style() {
        this.frame.getContentPane().setBackground(AppColors.board.get("background"));
    }

    @Override
    public void layout() {
        this.frame.setLayout(new GridBagLayout());
    }
    @Override
    public void compose() {
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.weighty = 0.05;
        this.frame.add(headerPanel.panel, gbc);

        gbc.gridy = 1;
        gbc.weighty = 0.9;
        gbc.weightx = 1.0;
        this.frame.add(boardPanel.panel, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0.05;
        gbc.weightx = 1.0;
        this.frame.add(footerPanel.panel, gbc);
    }

}


