package command.simpleRemote.cmd.stereo;

import command.simpleRemote.cmd.itf.Command;
import command.simpleRemote.cmd.stereo.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
