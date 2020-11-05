package Chapter_6.Applications;

public class Stereo {
    String room;

    public Stereo(String room){ this.room = room; }

    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCd(){
        System.out.println("Stereo received a CD");
    }
    public void setVolume(int volume){
        System.out.println("Stereo volume is " + volume);
    }
}
