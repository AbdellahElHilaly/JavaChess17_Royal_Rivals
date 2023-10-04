package com.youcode.app.game.model.entity;

import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.ui.component.text.TimerView;
import com.youcode.libs.print.Printer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Player {
    private String name;
    private int score;
    private CellColor color;
    private String time;

    public Player(String name, CellColor color) {
        this.name = name;
        this.color = color;
        this.score = 0;
        this.time = "00:00:00:00";

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public CellColor getColor() {
        return color;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setColor(CellColor color) {
        this.color = color;
    }

    public void addScore(Integer integer) {
        this.score += integer;
    }
}
