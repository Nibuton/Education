package Chapter_4.SimpleFactoryTraining;

public class PepperoniPizza extends Pizza {

    @Override
    public void cut() {
        System.out.println("Cutting pepperoni pizza...");
    }

    @Override
    public void box() {
        System.out.println("Putting pepperoni pizza in a box...");
    }
}
