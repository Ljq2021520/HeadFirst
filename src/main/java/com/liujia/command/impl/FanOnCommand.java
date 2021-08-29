package com.liujia.command.impl;

import com.liujia.command.Command;
import com.liujia.command.domain.Fan;

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.lightOn();
    }

    public void undo() {
        fan.lightOff();
    }
}
