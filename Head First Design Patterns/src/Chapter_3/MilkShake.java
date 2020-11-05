package Chapter_3;

public class MilkShake extends Beverage{

    public MilkShake(){ description = "Milkshake"; }

    @Override
    public double cost() {
        return 3.99;
    }
}
