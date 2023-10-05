package com.youcode.app.shared.Const.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class GirlPallet implements Pallet {

    @Override
    public Color primary() {
        return Color.decode("#d972ff");
    }

    @Override
    public Color secondary() {
        return Color.decode("#ffb2e6");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#8447ff");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#8cffda");
    }

    @Override
    public Color background() {
        return Color.decode("#ffffe8");
    }
}
