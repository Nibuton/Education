package Chapter_1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.perfomFly();
        mallardDuck.perfomQuack();
        Duck modelDuck = new ModelDuck();
        modelDuck.perfomQuack();
        modelDuck.perfomFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.perfomFly();
    }
}
