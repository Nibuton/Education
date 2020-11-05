package chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Task19 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Toy.class;
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }
        constructors[1].newInstance(100);
    }
}
