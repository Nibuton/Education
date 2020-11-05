package Chapter_4.SimpleFactoryTraining;

public class CheesePizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting cheese pizza...");
    }

    @Override
    public void box() {
        System.out.println("Putting cheese pizza in a box...");
    }
}
