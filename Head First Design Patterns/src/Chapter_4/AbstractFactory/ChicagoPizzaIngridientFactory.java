package Chapter_4.AbstractFactory;

public class ChicagoPizzaIngridientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ParmeggiannoCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Mushrooms()};
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
