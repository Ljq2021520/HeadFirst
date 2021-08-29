package com.liujia.command.domain;

public class Television {
    private String name;

    public Television(String name) {
        this.name = name;
    }

    public void lightOn() {
        System.out.println("I am "+name+" Television,Now is open!");
    }

    public void lightOff() {
        System.out.println("I am  "+name+" Television,Now is Off!");
    }
}
