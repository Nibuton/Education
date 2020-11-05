package Chapter_3;

public class Cream extends CondimentDecorator{

    public Cream(Beverage beverage){ this.beverage = beverage; }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.BIG) {
            cost += .85;
        }
        else if (beverage.getSize() == Size.MEDIUM){
            cost += .65;
        }
        else{
            cost += .40;
        }
        return cost;
    }
}
