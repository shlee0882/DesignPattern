package command.simpleRemote.cmd.stereo;

import command.simpleRemote.cmd.itf.Command;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
    }
}
