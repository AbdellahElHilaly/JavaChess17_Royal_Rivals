package com.youcode.app.ui.guide.impl;

import com.youcode.app.ui.guide.AppFrame;

import javax.swing.*;

public abstract class AppFrameImpl extends JFrame implements AppFrame {

    public void init(){
        setStyle();
        setLayout();
        build();
        addComponents();
        this.setVisible(true);
    }



}
