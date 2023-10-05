package com.youcode.app.shared.Const.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class SharpPallet implements Pallet {
    @Override
    public Color primary() {
        return Color.decode("#f19c79");
    }

    @Override
    public Color secondary() {
        return Color.decode("#d4e09b");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#a44a3f");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#f6f4d2");
    }

    @Override
    public Color background() {
        return Color.decode("#cbdfbd");
    }
}
