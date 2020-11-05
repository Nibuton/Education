package Chapter_4.FactoryMethod;

import Chapter_4.PizzaTypes;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(PizzaTypes.CHEESE);
        System.out.println("I ordered " + pizza.getName());
    }
}
