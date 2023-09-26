package com.youcode.app.game.model.entity;

import com.youcode.app.ui.shared.helper.LogicHelper;

public class Location {
    private static int X;
    private static int Y;
    private final static Location location = new Location();

    public static Location setX_Y(CellInfo cellInfo) {
        X = LogicHelper.generateX(cellInfo.getCol());
        Y = LogicHelper.generateY(cellInfo.getRow());
        return location;

    }

}
