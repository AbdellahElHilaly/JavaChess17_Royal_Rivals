package com.youcode.app.ui.guide;

import javax.swing.*;

public abstract class AppFrame extends JFrame {

    public void init(){
        setStyle();
        setLayout();
        build();
        addComponents();
        this.setVisible(true);
    }

    public abstract void setLayout();
    public abstract void setStyle();
    public abstract void build();
    public abstract void addComponents();

}
