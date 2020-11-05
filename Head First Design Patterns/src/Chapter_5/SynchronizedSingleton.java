package Chapter_5;

public class SynchronizedSingleton {
    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance(){
        if (singleton == null)
            singleton = new SynchronizedSingleton();
        return singleton;
    }
}
