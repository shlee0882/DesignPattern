package command.simpleRemote.cmd.control;

import command.simpleRemote.cmd.itf.Command;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
