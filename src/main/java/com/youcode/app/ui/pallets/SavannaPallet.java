package com.youcode.app.ui.pallets;

import com.youcode.app.ui.guide.Pallet;

import java.awt.*;

public class SavannaPallet implements Pallet {

    @Override
    public Color primary() {
        return Color.decode("#191D88");
    }

    @Override
    public Color secondary() {
        return Color.decode("#1450A3");
    }

    @Override
    public Color tertiary() {
        return Color.decode("#337CCF");
    }

    @Override
    public Color quaternary() {
        return Color.decode("#FFC436");
    }

    @Override
    public Color background() {
        return Color.decode("#FFFFFF");
    }
}
