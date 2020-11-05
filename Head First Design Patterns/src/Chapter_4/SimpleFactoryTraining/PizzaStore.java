package Chapter_4.SimpleFactoryTraining;

import Chapter_4.Main;
import Chapter_4.PizzaTypes;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }
    public Pizza orderPizza(PizzaTypes pizzaType){
        Pizza pizza = simplePizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
