package com.youcode.docs.images;

import javax.swing.*;
import java.awt.*;

public class SvgIcons {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Load the image icon
        ImageIcon icon = new ImageIcon("resources/assets/image/pieces-svg/dark-king.svg");
        // Create a JLabel with the image icon
        JLabel label = new JLabel(icon);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);

        frame.add(panel);
    }
}




