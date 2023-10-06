package com.youcode.app.ui.helper;

import com.youcode.app.shared.config.PanelConfig;
import com.youcode.libs.print.Printer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UiHelper {
    public static BufferedImage resizeImage(BufferedImage myPicture, int width, int height) {

        Image tmp = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }


    public static BufferedImage getImage(String path) {
        try {
            return resizeImage(ImageIO.read(new File(path)), PanelConfig.Piece.WIDTH, PanelConfig.Piece.HEIGHT);
        } catch (IOException e) {
            Printer.error("Image not found in : " + path);
            throw new RuntimeException(e);
        }
    }



}


