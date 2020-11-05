package chapter12;

import java.lang.reflect.Array;

public class Task2 {
    public static void main(String[] args) {
        try{
            Array array = null;
            array.toString();
        }
        catch (NullPointerException e){
            System.out.println("caught");
        }
    }
}
