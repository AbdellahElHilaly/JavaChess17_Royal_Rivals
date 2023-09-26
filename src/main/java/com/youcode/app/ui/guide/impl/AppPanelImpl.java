package com.youcode.app.ui.guide.impl;

import com.youcode.app.ui.guide.AppPanel;

import javax.swing.*;

public abstract class AppPanelImpl extends JPanel implements AppPanel {

    public void init(){
        setStyle();
        setLayout();
        build();
        addComponents();
        this.setVisible(true);
    }






}
