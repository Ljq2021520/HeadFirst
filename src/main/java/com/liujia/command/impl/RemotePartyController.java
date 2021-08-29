package com.liujia.command.impl;


import com.liujia.command.Command;

public class RemotePartyController {
    private PartyOnCommand partyOnCommand;
    private PartyOffCommand partyOffCommand;
    public RemotePartyController() {
    }

    public void setPartyOnCommand(Command partyOnCommand) {
        this.partyOnCommand = (PartyOnCommand) partyOnCommand;
    }

    public void setPartyOffCommand(Command partyOffCommand) {
        this.partyOffCommand = (PartyOffCommand) partyOffCommand;
    }

    public void open() {
        partyOnCommand.execute();
    }

    public void close() {
        partyOffCommand.execute();
    }


}
