package Chapter_4.SimpleFactoryTraining;

public class ClamPizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting clam pizza...");
    }

    @Override
    public void box() {
        System.out.println("Putting clam pizza in a box...");
    }
}
