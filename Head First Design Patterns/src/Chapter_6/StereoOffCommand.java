package Chapter_6;

import Chapter_6.Applications.Stereo;

public class StereoOffCommand implements Command{
    Stereo stereo;
    public StereoOffCommand(Stereo stereo){ this.stereo = stereo;}

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
