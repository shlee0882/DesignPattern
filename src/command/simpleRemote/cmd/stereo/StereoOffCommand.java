package command.simpleRemote.cmd.stereo;

import command.simpleRemote.cmd.itf.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }

}
