package com.youcode.game;

import javax.swing.*;
import java.awt.*;

public class MyPanel1 {

    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JButton button = new JButton();
    public void init() {
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        panel.setVisible(true);
    }


}
