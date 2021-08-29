package com.liujia.command;


import com.liujia.command.impl.NoCommand;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands ;
    private Command command;

    public RemoteController() {
        this.onCommands  = new Command[3];
        this.offCommands = new Command[3];
        Command no = new NoCommand();
        for (int i = 0; i < offCommands.length; i++) {
            onCommands[i] = no;
            offCommands[i] = no;
        }
    }

    public void setCommand(int i,Command onCommand,Command offCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void OnButtonDown(int i) {
        onCommands[i].execute();
        command = onCommands[i];
    }
    public void OnButtonUp(int i) {
        offCommands[i].execute();
        command = onCommands[i];
    }

    public void undo() {
        command.undo();
    }

}
