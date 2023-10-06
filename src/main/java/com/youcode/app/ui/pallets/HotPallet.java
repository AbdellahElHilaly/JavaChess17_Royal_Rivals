package com.youcode.app.ui.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class HotPallet implements Pallet {
    @Override
    public Color primary() {
        return Color.decode("#fb8500");
    }

    @Override
    public Color secondary() {
        return Color.decode("#ffb703");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#023047");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#8ecae6");
    }

    @Override
    public Color background() {
        return Color.decode("#219ebc");
    }
}
