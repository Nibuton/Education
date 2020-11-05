package chapter14;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Task20 {

    public static void main(String[] args) {
        classFullInformation(ArrayList.class);
    }


    public static void classFullInformation(Class<?> c){
        Field[] fields = c.getFields();
        Method[] methods = c.getMethods();
        Constructor[] constructors = c.getConstructors();
        AnnotatedType[] annotatedInterfaces = c.getAnnotatedInterfaces();
        Annotation[] annotations = c.getAnnotations();
        System.out.println("Canonical name: " + c.getCanonicalName());
        System.out.println("Simple name: " + c.getSimpleName());

        printArray(fields);
        printArray(methods);
        printArray(constructors);
        printArray(annotatedInterfaces);
        printArray(annotations);
    }

    public static void printArray(Object[] objects){
        if (objects.length == 0){ return; }
        System.out.println("    " + objects[0].getClass().getSimpleName());
        for (Object obj : objects){
            System.out.println("        " + obj);
        }
    }

}


