package command.simpleRemote.cmd.control;

import command.simpleRemote.cmd.itf.Command;
import command.simpleRemote.cmd.nocomm.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----------리모콘------------\n");
        for(int i=0; i< onCommands.length; i++){
            stringBuffer.append("[slot "+i+"]" + onCommands[i].getClass().getName()+"   "+offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}

