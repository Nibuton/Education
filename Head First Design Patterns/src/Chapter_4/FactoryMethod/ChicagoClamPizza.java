package Chapter_4.FactoryMethod;

import java.util.Arrays;

public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza(){
        name = "ChicagoClamPizza";
        sauce = "Original";
        toppings.addAll(Arrays.asList(new String[] {"Octopus"}));
    }
}
