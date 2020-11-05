package Chapter_6;

public class SimpleRemoteControl {

    Command slot;
    public SimpleRemoteControl(){};

    public void setCommand(Command command){ slot = command;}

    public void buttonWsPressed(){ slot.execute(); }
}
