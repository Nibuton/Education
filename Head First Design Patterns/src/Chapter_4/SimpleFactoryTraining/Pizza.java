package Chapter_4.SimpleFactoryTraining;

public abstract class Pizza {

    public void bake() {
        System.out.println("Baking pizza...");
    }

    public void prepare(){
        System.out.println("Preparing pizza...");
    }
    public abstract void cut();

    public abstract void box();
}
