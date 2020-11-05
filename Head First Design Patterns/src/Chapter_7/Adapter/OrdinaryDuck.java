package Chapter_7.Adapter;

public class OrdinaryDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
