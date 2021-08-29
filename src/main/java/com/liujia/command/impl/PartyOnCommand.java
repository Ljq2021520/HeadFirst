package com.liujia.command.impl;

import com.liujia.command.Command;

public class PartyOnCommand implements Command {
    Command[] commands;

    public PartyOnCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
