package Chapter_5;

public class ClassicSingleton {
    private static ClassicSingleton singleton;

    private ClassicSingleton(){};

    public static ClassicSingleton getInstance(){
        if (singleton == null){
            singleton = new ClassicSingleton();
        }
        return singleton;
    }
}
