package com.youcode.app.ui.guide;

import java.awt.*;

public interface Pallet {
    public Color primary();

    public Color secondary();

    public Color tertiary();

    public Color quaternary();

    public Color background();

    default Color light() {
        return Color.decode("#ffffff");
    }

    default Color dark() {
        return Color.decode("#000000");
    }

    default Color error() {
        return Color.decode("#ff0000");
    }
    default Color success() {
        return Color.decode("#00ff00");
    }
    default Color warning() {
        return Color.decode("#ffff00");
    }

}
