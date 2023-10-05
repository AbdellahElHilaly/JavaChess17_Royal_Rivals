package com.youcode.app.shared.Const.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class DefaultPallet implements Pallet {
    @Override
    public Color primary() {
        return Color.decode("#985277");
    }

    @Override
    public Color secondary() {
        return Color.decode("#ce6a85");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#5c374c");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#faa275");
    }

    @Override
    public Color background() {
        return Color.decode("#ff8c61");
    }
}
