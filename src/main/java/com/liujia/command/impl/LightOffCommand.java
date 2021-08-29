package com.liujia.command.impl;

import com.liujia.command.Command;
import com.liujia.command.domain.Light;

public class LightOffCommand implements Command {
    private  Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.lightOff();
    }

    public void undo() {
        light.lightOn();
    }
}
