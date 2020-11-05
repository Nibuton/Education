package Chapter_4.SimpleFactoryTraining;

import Chapter_4.Main;
import Chapter_4.PizzaTypes;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaTypes type){
        Pizza pizza = null;
        switch (type) {
            case PEPPERONI:
                pizza = new PepperoniPizza();
                break;
            case CLAM:
                pizza = new ClamPizza();
                break;
            case CHEESE:
                pizza = new CheesePizza();
                break;
        }
        return pizza;
    }
}
