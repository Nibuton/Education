package Chapter_4.SimpleFactoryTraining;

import Chapter_4.PizzaTypes;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza(PizzaTypes.CHEESE);
    }
}
