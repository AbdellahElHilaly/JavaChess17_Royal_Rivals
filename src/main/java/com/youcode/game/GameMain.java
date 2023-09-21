package com.youcode.game;

import com.youcode.shared.print.ObjectPrinter;
import com.youcode.ui.root.ChessBoard;

import java.util.ArrayList;
import java.util.List;


public class GameMain {
    public static void main(String[] args) {


//        ChessBoard board = new ChessBoard();
//        board.init();



         Person me = new Person( 20, "Mfojireoijfoijerohamed", "Rabat");


        List<Person> peoples = new ArrayList<>();
        peoples.add(me);
        peoples.add(me);
        peoples.add(me);
        peoples.add(me);
        peoples.add(me);

        ObjectPrinter.tableList(peoples , "test");



    }


    private static class Person {
        int a;
        String b;
        String c;


        public Person(int age, String name, String adress) {
            this.a = age;
            this.b = name;
            this.c = adress;
        }
    }
}

