package Chapter_5;

public class PreCreatedSingleton {
    private static PreCreatedSingleton singleton = new PreCreatedSingleton();

    private PreCreatedSingleton(){}

    public static PreCreatedSingleton getInstance(){ return singleton; }
}
