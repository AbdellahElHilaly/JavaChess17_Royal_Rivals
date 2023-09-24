package com.youcode.app.ui.shared.utils.Const;

import java.awt.*;
import java.util.Objects;

public class AppFonts {

    private static Font tempFont;

    public static final Font PRIMARY = new Font("Roboto", Font.BOLD, 20);
    public static final Font ELCTRONIC =  getElectronicFont();


    private static Font getElectronicFont() {
        try {
            if (tempFont == null) tempFont = new Font("Roboto", Font.BOLD, 20);
            tempFont = Font.createFont(Font.TRUETYPE_FONT, Objects.requireNonNull(AppFonts.class.getResourceAsStream("resources/fonts/electron/TypoDigitDemo-VG9lV.ttf")));
            return tempFont.deriveFont(Font.PLAIN, 20);
        } catch (Exception e) {
            e.printStackTrace();
            return PRIMARY;
        }
    }


}
