package com.youcode.app.ui.shared.utils.Const;

import com.youcode.libs.print.Printer;

import java.awt.*;
import java.io.File;
import java.util.Objects;

public class AppFonts {

    private static Font tempFont;

    public static final Font PRIMARY = new Font("Roboto", Font.BOLD, 20);
    public static final Font ELCTRONIC =  getElectronicFont();


    private static Font getElectronicFont() {
        try {
            if (tempFont == null) tempFont = new Font("Roboto", Font.BOLD, 60);
            tempFont = Font.createFont(Font.TRUETYPE_FONT, new File("resources/fonts/electron/TypoDigitDemo-VG9lV.ttf"));
            return tempFont.deriveFont(Font.PLAIN, 60);
        } catch (Exception e) {
            Printer.error("Error while loading font");
            e.printStackTrace();
            return PRIMARY;
        }
    }


}
