package Chapter_4.FactoryMethod;

import Chapter_4.PizzaTypes;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaTypes pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaTypes pizzaType);

}