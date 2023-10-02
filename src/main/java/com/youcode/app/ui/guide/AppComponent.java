package com.youcode.app.ui.guide;


public interface AppComponent {
    void setStyle();
    void build();
    void addComponents();
    default  void init(){
        setStyle();
        build();
        addComponents();
    }
}
