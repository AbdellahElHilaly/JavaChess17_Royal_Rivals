package com.youcode.ui.guide;

public abstract class Component {
    public abstract void config();
    public abstract void style();
    public void init() {
        config();
        style();
    }

}
