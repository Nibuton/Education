package Chapter_4.FactoryMethod;

import java.util.Arrays;

public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza(){
        name = "ChicagoCheesePizza";
        sauce = "Marinara Sauce";
        toppings.addAll(Arrays.asList(new String[]{"Meat"}));
    }
}
