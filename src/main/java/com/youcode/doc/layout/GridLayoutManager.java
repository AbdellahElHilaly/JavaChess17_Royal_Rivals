package com.youcode.doc.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutManager extends JFrame {

    public GridLayoutManager() {

        super("Grid Layout Manager");
        setSize(1200, 850);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //center the frame


        setLayout(new GridLayout(3, 3));

        add(getPannel(Color.red));
        add(getPannel(Color.blue));
        add(getPannel(Color.green));

        add(getPannel(Color.yellow));
        add(getPannel(Color.pink));
        add(getPannel(Color.orange));

        add(getPannel(Color.cyan));
        add(getPannel(Color.magenta));
        add(getPannel(Color.gray));


        setVisible(true);
    }


    private JPanel getPannel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        return panel;
    }

    public static void main(String[] args) {
        new GridLayoutManager();
    }


}
