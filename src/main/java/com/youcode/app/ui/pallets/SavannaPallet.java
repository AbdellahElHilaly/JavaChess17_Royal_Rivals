package com.youcode.app.ui.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class SavannaPallet implements Pallet {
    @Override
    public Color primary() {
        return Color.decode("#475c6c");
    }

    @Override
    public Color secondary() {
        return Color.decode("#8a8583");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#cd8b62");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#f7efd2");
    }

    @Override
    public Color background() {
        return Color.decode("#eed7a1");
    }

}
