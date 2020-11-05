package Chapter_7.Adapter;

public class OrdinaryTurkey implements Turkey{
    @Override
    public void fly() {
        System.out.println("Turkey is flying");
    }

    @Override
    public void gobble() {
        System.out.println("GobbleGobble");
    }
}
