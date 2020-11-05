package Chapter_4.FactoryMethod;

import Chapter_4.PizzaTypes;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaTypes type){
        Pizza pizza = null;
        switch (type) {
            case PEPPERONI:
                pizza = new NYPepperoniPizza();
                break;
            case CLAM:
                pizza = new NYClamPizza();
                break;
            case CHEESE:
                pizza = new NYCheesePizza();
                break;
        }
        return pizza;
    }
}
