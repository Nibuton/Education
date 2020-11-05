package Chapter_6.Applications;

public class Fan {

    public static final int HIGH = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String room;
    private int speed;

    public Fan(String room){
        this.room = room;
        speed = OFF;
    }

    public void high(){ speed = HIGH;
        System.out.println("Fan is at high speed");}
    public void low(){ speed = LOW;
        System.out.println("Fan is at low speed");}
    public void off(){speed = OFF;
        System.out.println("Fan is off");}

    public int getSpeed() {
        return speed;
    }
}
