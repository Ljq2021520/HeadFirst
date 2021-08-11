package com.liujia.danli;

public class SingleTan {
    private static SingleTan singleTan;

    private SingleTan() {
    }

    public static SingleTan  getInstance() {
        if (singleTan == null) {
            singleTan = new SingleTan();
        }
        return singleTan;
    }

    public  void show() {
        System.out.println("单例mos");

    }

}
