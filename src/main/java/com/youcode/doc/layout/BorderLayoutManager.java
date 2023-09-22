package com.youcode.doc.layout;

import com.youcode.app.ui.layout.BoardContainer;
import com.youcode.app.ui.layout.Footer;
import com.youcode.app.ui.layout.Header;
import com.youcode.app.ui.shared.Const.AppSizes;
import com.youcode.app.ui.shared.config.PanelConfig;

import javax.swing.*;
import java.awt.*;

/**
 * BorderLayoutManager have 5 areas:
 * 1. North
 * 2. South
 * 3. East
 * 4. West
 * 5. Center
 */
public class BorderLayoutManager extends JFrame {


    public BorderLayoutManager() {


        int width = 1200;
        int height = 850;
        int header_footer_height = (int) (width - 0.95 * width);

        int board_size = height - (2 * header_footer_height);




        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);



        JPanel north = new JPanel();
        north.setBackground(Color.RED);
        north.setPreferredSize(new Dimension(width, header_footer_height));

        JPanel south = new JPanel();
        south.setBackground(Color.BLUE);
        south.setPreferredSize(new Dimension(width, header_footer_height));



        JPanel center = new JPanel();


        center.setBackground(Color.ORANGE);
        center.setPreferredSize(new Dimension(width, board_size));
        center.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        center.add(board(board_size));



        this.add(north, BorderLayout.NORTH);
//        this.add(south, BorderLayout.SOUTH);
        this.add(center, BorderLayout.CENTER);


    }


    private  JPanel board(int size){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(size, size));
        panel.setBackground(Color.BLACK);
        return panel;
    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(BorderLayoutManager::new);
    }














}
