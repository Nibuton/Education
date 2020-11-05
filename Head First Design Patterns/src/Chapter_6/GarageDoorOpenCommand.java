package Chapter_6;

import Chapter_6.Applications.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) { this.garageDoor = garageDoor;}

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
