package Chapter_6;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n ------ Remote Comtrol -------- \n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuilder.append("[slot " + i + " ON button: " + onCommands[i].getClass().getSimpleName()
                    + "    OFF button: " + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return stringBuilder.toString();
    }
}
