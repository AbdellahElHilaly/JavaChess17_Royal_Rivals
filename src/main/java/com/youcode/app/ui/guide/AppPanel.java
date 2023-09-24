package com.youcode.app.ui.guide;

import javax.swing.*;
import java.awt.*;

public abstract class AppPanel extends JPanel {

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
