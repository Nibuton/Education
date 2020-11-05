package Chapter_4.FactoryMethod;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Adding sauce..." );
        System.out.println("Adding toppings");
        for (String topping: toppings){
            System.out.println(" " + topping);
        }
    }

    void bake(){
        System.out.println("Baking...");
    }

    void cut(){
        System.out.println("Cutting...");
    }

    void box(){
        System.out.println("Boxing...");
    }

    public String getName(){ return name; }

}
