package com.youcode.docs.layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutManager extends JFrame {

    FlowLayoutManager() {

        super("FlowLayout");
        setSize(850, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(new FlowLayout());


        add(getPannel(100, 100, Color.blue));











    }


    private JPanel getPannel(int w, int h, Color color) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(w, h));
        panel.setBackground(color);
        return panel;
    }


    public static void main(String[] args) {
        new FlowLayoutManager();
    }
}
