package com.liujia.command.impl;

import com.liujia.command.Command;
import com.liujia.command.domain.Television;

public class TelevisionOffCommand implements Command {
    private Television television;


    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.lightOff();
    }

    public void undo() {
        television.lightOn();
    }
}
