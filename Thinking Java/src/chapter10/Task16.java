package chapter10;

public class Task16 {

    static class InnerNested{

    }

    public static InnerNested getInnerNested(){ return new InnerNested(); }

    public static void main(String[] args) {
        InnerNested innerNested = getInnerNested();
    }
}
