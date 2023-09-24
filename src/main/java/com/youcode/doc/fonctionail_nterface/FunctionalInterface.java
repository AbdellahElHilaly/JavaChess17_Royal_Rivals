package com.youcode.doc.fonctionail_nterface;

@java.lang.FunctionalInterface
public  interface FunctionalInterface {
    public void doSomething();
    public default void  doWork(){
        System.out.println("do work");
    }
    public static void doStaticWork(){
        System.out.println("do static work");
    }
}


