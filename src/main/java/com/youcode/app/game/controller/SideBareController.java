package com.youcode.app.game.controller;

import com.youcode.app.game.root.Starter;
import com.youcode.app.shared.enums.CellColor;
import com.youcode.app.shared.enums.PiecesTypes;
import com.youcode.app.ui.layout.SideBare;

public class SideBareController {
    private  static  final SideBare sideBareDark = Starter.getGameScreen().getBoardContainer().getSideBareDark();
    private  static  final SideBare sideBareLight = Starter.getGameScreen().getBoardContainer().getSideBareLight();


    public  void  reset() {
        sideBareDark.reset();
        sideBareLight.reset();
    }

    public static void collectPiece(PiecesTypes piecesTypes, CellColor pieceColor) {
        if(pieceColor == CellColor.LIGHT) sideBareDark.collectPiece(piecesTypes, pieceColor);
        else sideBareLight.collectPiece(piecesTypes, pieceColor);
    }


}
