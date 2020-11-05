package Chapter_4.FactoryMethod;

import java.util.Arrays;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza(){
        name = "NYCheesePizza";
        sauce = "Marinara Sauce";
        toppings.addAll(Arrays.asList(new String[]{"Mozarella", "ExtraCheese"}));
    }
}
