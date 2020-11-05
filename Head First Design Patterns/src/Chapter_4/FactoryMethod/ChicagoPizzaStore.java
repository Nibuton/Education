package Chapter_4.FactoryMethod;

import Chapter_4.PizzaTypes;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaTypes type) {
        Pizza pizza = null;
        switch (type) {
            case PEPPERONI:
                pizza = new ChicagoPepperoniPizza();
                break;
            case CLAM:
                pizza = new ChicagoClamPizza();
                break;
            case CHEESE:
                pizza = new ChicagoCheesePizza();
                break;
        }
        return pizza;
    }
}
