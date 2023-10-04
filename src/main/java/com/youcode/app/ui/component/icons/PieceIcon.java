package com.youcode.app.ui.component.icons;

import com.youcode.app.ui.guide.AppComponent;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class PieceIcon extends ImageIcon implements AppComponent {

    public PieceIcon() {
        init();
    }

    @Override
    public void setStyle() {

    }

    @Override
    public void build() {

    }

    @Override
    public void addComponents() {

    }

    public  void getIcon(BufferedImage image){
        super.setImage(image);
    }
}
