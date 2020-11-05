import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String s1 = "abcdef";
        Class classString = s1.getClass();
        Class classStringBuilder = Class.forName("java.lang.StringBuilder");
        Class classThre = Thre.class;

        String s2 = (String) classString.getConstructor(String.class).newInstance("abcd");
        System.out.println(s2);
        System.out.println(classString.getMethod("charAt", int.class).invoke(s1, 0));
    }
}
