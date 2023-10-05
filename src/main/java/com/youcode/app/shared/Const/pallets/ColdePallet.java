package com.youcode.app.shared.Const.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class ColdePallet implements Pallet {
    @Override
    public Color primary() {
        return Color.decode("#2667ff");
    }

    @Override
    public Color secondary() {
        return Color.decode("#3f8efc");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#3b28cc");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#add7f6");
    }

    @Override
    public Color background() {
        return Color.decode("#87bfff");
    }
}
