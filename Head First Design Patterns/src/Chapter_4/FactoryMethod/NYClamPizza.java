package Chapter_4.FactoryMethod;

import java.util.Arrays;

public class NYClamPizza extends Pizza {
    public NYClamPizza(){
        name = "NYCLamPizza";
        sauce = "Marinara Sauce";
        toppings.addAll(Arrays.asList(new String[]{"Clams", "Crabs"}));
    }
}
