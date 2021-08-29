package com.liujia.command;

import com.liujia.command.domain.Fan;
import com.liujia.command.domain.Light;
import com.liujia.command.domain.Television;
import com.liujia.command.impl.*;

public class RemoteControllerMain {
    public static void main(String[] args) {
        Light light = new Light("卧室");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Fan fan = new Fan("大厅");
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        Television television = new Television("天台");
        TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(television);
        TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(television);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.setCommand(1, fanOnCommand, fanOffCommand);
        remoteController.setCommand(2, televisionOnCommand, televisionOffCommand);

       // remoteController.OnButtonDown(2);

        System.out.println("======");
        Command[] oncommand = {lightOnCommand, fanOnCommand};
        Command[] offcommand = {lightOffCommand, lightOffCommand};
        PartyOnCommand partyOnCommand = new PartyOnCommand(oncommand);
        PartyOffCommand partyOffCommand = new PartyOffCommand(offcommand);
        RemotePartyController remotePartyController = new RemotePartyController();

        remotePartyController.setPartyOnCommand(partyOnCommand);
        remotePartyController.setPartyOffCommand(partyOffCommand);

        remotePartyController.open();
        remotePartyController.close();
    }
}
