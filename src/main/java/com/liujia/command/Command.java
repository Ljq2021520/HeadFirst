package com.liujia.command;

public interface Command {
    void execute();

    void undo();
}
