package com.liujia.command.impl;

import com.liujia.command.Command;
import com.liujia.command.domain.Fan;
import com.liujia.command.domain.Light;

public class LightOnCommand implements Command {
    private  Light light;


    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }

    public void undo() {
        light.lightOff();
    }
}
