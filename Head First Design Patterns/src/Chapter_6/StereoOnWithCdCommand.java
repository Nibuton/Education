package Chapter_6;

import Chapter_6.Applications.Stereo;

public class StereoOnWithCdCommand implements Command{
    Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo){ this.stereo = stereo;}


    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(60);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
