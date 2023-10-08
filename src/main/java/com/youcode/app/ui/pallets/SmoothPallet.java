package com.youcode.app.ui.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class SmoothPallet implements Pallet {
    @Override
    public Color primary() {
        return Color.decode("#d6ccc2");
    }

    @Override
    public Color secondary() {
        return Color.decode("#f5ebe0");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#d5bdaf");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#edede9");
    }

    @Override
    public Color background() {
        return Color.decode("#e3d5ca");
    }
}
