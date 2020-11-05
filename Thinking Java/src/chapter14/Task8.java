package chapter14;

import java.lang.reflect.Field;

public class Task8 {
    public static void main(String[] args) {
        Circle s = new Circle();
        recursiceGetClass(s.getClass());
    }

    public static void recursiceGetClass(Class c){
        System.out.println(c.getSimpleName());
        for(Field field: c.getDeclaredFields()){
            System.out.println("    " + field.getType() + " " + field.getName());
        }
        if (c == Object.class){
            return;
        }
        else{
            recursiceGetClass(c.getSuperclass());
        }
    }
}
