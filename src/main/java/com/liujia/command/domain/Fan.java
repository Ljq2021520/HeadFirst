package com.liujia.command.domain;

public class Fan {
    private String name;

    public Fan(String name) {
        this.name = name;
    }

    public void lightOn() {
        System.out.println("I am "+name+" Fan,Now is open!");
    }

    public void lightOff() {
        System.out.println("I am "+name+" Fan,Now is Off!");
    }
}
