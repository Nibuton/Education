package Chapter_6;

import Chapter_6.Applications.Fan;

public class FanOffCommand implements Command{

    private Fan fan;
    private int prevSpeed;

    public FanOffCommand(Fan fan){ this.fan = fan;}

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == Fan.HIGH){
            fan.high();
        }
        else if(prevSpeed == Fan.LOW){
            fan.low();
        }
        else if (prevSpeed == Fan.OFF){
            fan.off();
        }
    }
}
