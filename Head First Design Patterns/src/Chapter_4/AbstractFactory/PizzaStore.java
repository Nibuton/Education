package Chapter_4.AbstractFactory;

import Chapter_4.PizzaTypes;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaTypes type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaTypes type);
}
