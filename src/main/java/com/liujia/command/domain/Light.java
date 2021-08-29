package com.liujia.command.domain;

public class Light {
    private String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void lightOn() {
        System.out.println("I am  "+name+" Light,Now is open!");
    }

    public void lightOff() {
        System.out.println("I am  "+name+"  Light,Now is Off!");
    }
}
