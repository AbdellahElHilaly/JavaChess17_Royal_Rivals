package com.youcode.app.shared.Const.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class MaxPallet implements Pallet {

    @Override
    public Color primary() {
        return Color.decode("#780000");
    }

    @Override
    public Color secondary() {
        return Color.decode("#c1121f");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#003049");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#fdf0d5");
    }

    @Override
    public Color background() {
        return Color.decode("#669bbc");
    }

}
