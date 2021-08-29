package com.liujia.command.impl;

import com.liujia.command.Command;
import com.liujia.command.domain.Fan;

public class FanOffCommand implements Command {
    private Fan fan;


    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.lightOff();
    }

    public void undo() {
        fan.lightOn();
    }
}
