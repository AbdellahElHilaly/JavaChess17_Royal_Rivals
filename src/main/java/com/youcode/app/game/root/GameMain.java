package com.youcode.app.game.root;


import com.youcode.app.game.actions.PieceClicker;

public class GameMain {

    public static void main(String[] args) {

        Starter.drawBoard();
        Starter.arrangePieces();
        PieceClicker.startDetection(Starter.getCellsList());

    }
}


