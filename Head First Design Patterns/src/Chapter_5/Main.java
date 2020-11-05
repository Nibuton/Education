package Chapter_5;

public class Main {
    public static void main(String[] args) {
        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        ClassicSingleton classicSingleton1 = ClassicSingleton.getInstance();
        System.out.println(classicSingleton == classicSingleton1);
    }
}
