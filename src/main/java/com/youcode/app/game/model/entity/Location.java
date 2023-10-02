package com.youcode.app.game.model.entity;


public class Location {
    private  int X;
    private  int Y;

    public Location(int x, int y) {
        X = x;
        Y = y;
    }

    public Location() {

    }


    public  int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public  void setX(int x) {
        X = x;
    }

    public  void setY(int y) {
        Y = y;
    }
}
