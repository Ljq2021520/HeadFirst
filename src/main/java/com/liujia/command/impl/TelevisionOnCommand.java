package com.liujia.command.impl;

import com.liujia.command.Command;
import com.liujia.command.domain.Light;
import com.liujia.command.domain.Television;

public class TelevisionOnCommand implements Command {
    private Television television;


    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.lightOn();
    }

    public void undo() {
        television.lightOff();
    }
}
