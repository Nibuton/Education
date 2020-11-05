package Chapter_6;

import Chapter_6.Applications.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;
    public GarageDoorCloseCommand(GarageDoor garageDoor){ this.garageDoor = garageDoor; }
    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
