// https://www.academia.edu/35657374/Annotated_Solution_Guide_for_Thinking_in_Java_Fourth_Edition
import butov.nikita.Access;

import java.io.StringReader;
import java.util.Collections;

public class Test {
    static String s = "abc";
    static String s2;
    static{
        s2 = "def";
    }
    static void method(){
        System.out.println(s + s2);
        Test test = new Test("a","b", new String("c"));
        for (testEnum e : testEnum.values()){
            System.out.println(e + " ordinal, " + e.ordinal());
        }
        testEnum e = testEnum.JAVA;
        switch(e){
            case JAVA:
                System.out.println("It's JAVA");
                break;
            case C:
                System.out.println("It's C");
                break;
            case PYTHON:
                System.out.println("It's PYTHON");
                break;
        }
    }
    public static void main(String[] args) {
        new Finalize(false);
        method();
        System.gc();
    }

    public Test(String... st){
        for (String s : st){
            System.out.println(s);
        }
    }
}
