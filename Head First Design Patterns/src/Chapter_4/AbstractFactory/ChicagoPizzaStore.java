package Chapter_4.AbstractFactory;

import Chapter_4.PizzaTypes;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaTypes type) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngridientFactory();
        Pizza pizza = null;
        switch(type){
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago cheese pizza");
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago clam pizza");
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago pepperoni pizza");
        }
        return pizza;
    }
}
