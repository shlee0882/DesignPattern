package command.simpleRemote.executor;

import command.simpleRemote.cmd.garage.GarageDoor;
import command.simpleRemote.cmd.garage.GarageDoorOpenCommand;
import command.simpleRemote.cmd.light.Light;
import command.simpleRemote.cmd.light.LightOnCommand;
import command.simpleRemote.cmd.control.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("living");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
