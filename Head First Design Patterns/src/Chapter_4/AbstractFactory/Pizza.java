package Chapter_4.AbstractFactory;


public abstract class Pizza {
    String name;
    Cheese cheese;
    Clams clams;
    Dough dough;
    Pepperoni pepperoni;
    Veggies[] veggies;
    Sauce sauce;

    abstract void prepare();

    void bake(){
        System.out.println("Baking pizza...");
    }

    void cut(){
        System.out.println("Cutting pizza...");
    }

    void box(){
        System.out.println("Boxing pizza...");
    }

    void setName(String name){ this.name = name; }

    String getName(String name){ return name; }

    @Override
    public String toString() {
        return "Pizza";
    }
}
