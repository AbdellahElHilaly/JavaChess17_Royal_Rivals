package com.youcode.app.game.root;


import com.youcode.app.game.controller.ClickDetector;
import com.youcode.app.game.controller.Starter;

public class GameMain {



    public static void main(String[] args) {

        Starter.drawBoard();
        Starter.arrangePieces();
        ClickDetector.startDetection(Starter.getCellsList());


    }
}


