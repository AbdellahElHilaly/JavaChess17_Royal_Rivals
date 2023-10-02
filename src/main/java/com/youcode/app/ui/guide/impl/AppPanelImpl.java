package com.youcode.app.ui.guide.impl;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.ui.guide.AppPanel;

import javax.swing.*;
import java.awt.*;

public abstract class AppPanelImpl extends JPanel implements AppPanel {

    @Override
    public void init(){
        setStyle();
        setLayout();
        build();
        addComponents();
        this.setVisible(true);
    }

    @Override
    public void updatePanel() {
        revalidate();
        repaint();
    }






}
