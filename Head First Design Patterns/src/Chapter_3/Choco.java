package Chapter_3;

public class Choco extends CondimentDecorator{
    public Choco(Beverage beverage){ this.beverage = beverage; }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Choco";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.BIG) {
            cost += .99;
        }
        else if (beverage.getSize() == Size.MEDIUM){
            cost += .79;
        }
        else{
            cost += .59;
        }
        return cost;
    }
}
