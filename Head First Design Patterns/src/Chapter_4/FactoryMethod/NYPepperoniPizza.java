package Chapter_4.FactoryMethod;

import java.util.Arrays;

public class NYPepperoniPizza extends Pizza {
    public NYPepperoniPizza(){
        name = "NYPepperoniPizza";
        sauce = "Tomato Sauce";
        toppings.addAll(Arrays.asList(new String[]{"Mozarella", "ExtraPepperoni"}));
    }
}
