package com.youcode.ui.guide;

import javax.swing.*;

public abstract class PanelComponent {

    public JPanel panel = new JPanel();

    public abstract void layout();
    public abstract void compose();
    public abstract void config();
    public abstract void style();

    public void init() {

        config();
        layout();
        style();
        compose();

    }
    public void  close() {
        this.panel.setVisible(false);
    }


}
