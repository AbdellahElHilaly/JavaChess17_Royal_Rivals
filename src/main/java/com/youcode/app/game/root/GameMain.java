package com.youcode.app.game.root;


import com.youcode.app.game.controller.CellDetector;
import com.youcode.app.game.controller.PieceMover;
import com.youcode.app.game.controller.Starter;

public class GameMain {



    public static void main(String[] args) {

        Starter.drawBoard();
        Starter.arrangePieces();
        CellDetector.startDetection(Starter.getCellsList());


    }
}


