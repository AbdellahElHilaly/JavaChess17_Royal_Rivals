package com.youcode.app.game.root;


import com.youcode.app.game.actions.PieceClicked;

public class GameMain {

    public static void main(String[] args) {

        Starter.drawBoard();
        Starter.arrangePieces();
        PieceClicked.startDetection(Starter.getCellsList());

    }
}


