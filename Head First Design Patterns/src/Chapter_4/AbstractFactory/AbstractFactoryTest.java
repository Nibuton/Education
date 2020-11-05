package Chapter_4.AbstractFactory;

import Chapter_4.PizzaTypes;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza(PizzaTypes.CLAM);
    }
}
