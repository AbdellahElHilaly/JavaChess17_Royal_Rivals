package com.youcode.ui.root;

import com.youcode.ui.config.AppColors;
import com.youcode.ui.config.AppSizes;
import com.youcode.ui.layout.GamePlayFooter;
import com.youcode.ui.layout.GamePlayHeader;
import com.youcode.ui.guide.FrameComponent;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends FrameComponent {

    GamePlayHeader headerPanel = new GamePlayHeader();
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
        this.frame.setLayout(new GridLayout(3, 1));
    }

    @Override
    public void compose() {
        this.frame.add(headerPanel.panel);
        this.frame.add(footerPanel.panel);
    }

}


