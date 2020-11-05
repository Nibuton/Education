package chapter14;

public class Test {
    public static void main(String[] args) {
        new Kui();
    }
}

class Kui{
    static int a = 100;
    static{
        System.out.println("i'm kui + " + a);
    }
}
