package Chapter_4.AbstractFactory;

public class NYPizzaIngridientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Mushrooms(), new Tomatoes()};
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
