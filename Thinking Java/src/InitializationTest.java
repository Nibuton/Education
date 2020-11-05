import ivanova.katya.Access;

public class InitializationTest extends Access{
    public static void main(String[] args) {
        Access access = new Access();
        InitializationTest initializationTest = new InitializationTest();
        initializationTest.test();
    }

    public void test(){
        method();
    }

    @Override
    protected void method() {
        super.method();
    }
}

class A1{
    static String s1 = "abc";
    static String s2;
    static{
        s2 = "def";
    }
    public static void print(){
        System.out.println(s1 + " " + s2);
    }
}
