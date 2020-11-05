package Chapter_6;

import Chapter_6.Applications.Fan;
import Chapter_6.Applications.GarageDoor;
import Chapter_6.Applications.Light;
import Chapter_6.Applications.Stereo;

public class Main {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");
        Fan fan = new Fan("Living room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCdCommand livingRoomStereoOnWithCdCommand = new StereoOnWithCdCommand(stereo);
        StereoOffCommand livingRoomStereoOffCommand = new StereoOffCommand(stereo);

        FanHighCommand livingRoomFanHighCommand = new FanHighCommand(fan);
        FanLowCommand livingRoomFanLowCommand = new FanLowCommand(fan);
        FanOffCommand livingRoomFanOffCommand = new FanOffCommand(fan);

        /*remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenRoomLightOnCommand, kitchenRoomLightOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, livingRoomStereoOnWithCdCommand, livingRoomStereoOffCommand);
        remoteControl.setCommand(4, livingRoomFanLowCommand, livingRoomFanOffCommand);
        remoteControl.setCommand(5, livingRoomFanHighCommand,livingRoomFanOffCommand);

        System.out.println(remoteControl);
        System.out.println();

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(3);
        remoteControl.offButtonWasPushed(4);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(5);
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl); */

        Command[] partyOn = {kitchenRoomLightOffCommand, livingRoomStereoOnWithCdCommand, livingRoomLightOffCommand, livingRoomFanHighCommand};
        Command[] partyOff = {kitchenRoomLightOnCommand, livingRoomStereoOffCommand, livingRoomLightOnCommand, livingRoomFanLowCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
    }
}
