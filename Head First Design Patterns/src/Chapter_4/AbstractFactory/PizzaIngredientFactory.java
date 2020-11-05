package Chapter_4.AbstractFactory;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Clams createClams();
    public Dough createDough();
    public Veggies[] createVeggies();
    public Sauce createSauce();
    public Pepperoni createPepperoni();
}
