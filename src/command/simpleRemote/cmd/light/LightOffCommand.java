package command.simpleRemote.cmd.light;

import command.simpleRemote.cmd.itf.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
