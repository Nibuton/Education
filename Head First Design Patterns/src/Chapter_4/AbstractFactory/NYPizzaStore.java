package Chapter_4.AbstractFactory;

import Chapter_4.PizzaTypes;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(PizzaTypes type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngridientFactory();
        switch(type){
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("NY Cheese pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("NY Clam pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("NY Pepperoni pizza");
                break;
        }
        return pizza;
    }
}
