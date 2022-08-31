package command.simpleRemote.cmd.light;

import command.simpleRemote.cmd.itf.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
