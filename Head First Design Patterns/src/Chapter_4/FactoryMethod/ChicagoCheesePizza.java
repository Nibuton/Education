package Chapter_4.FactoryMethod;

import java.util.Arrays;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(){
        name = "ChicagoCheesePizza";
        sauce = "Tomato Basilico";
        toppings.addAll(Arrays.asList(new String[]{"Mozarella", "Rokfor"}));
    }
}
