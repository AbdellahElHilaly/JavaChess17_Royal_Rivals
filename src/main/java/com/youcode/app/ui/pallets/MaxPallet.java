package com.youcode.app.ui.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class MaxPallet implements Pallet {

    @Override
    public Color primary() {
        return Color.decode("#720026");
    }

    @Override
    public Color secondary() {
        return Color.decode("#ce4257");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#4f000b");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#ff9b54");
    }

    @Override
    public Color background() {
        return Color.decode("#ff7f51");
    }

}
