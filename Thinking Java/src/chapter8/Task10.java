package chapter8;

public class Task10 {

    public static void main(String[] args) {
        Father son = new Son();
        Father father = new Father();
        System.out.println(son.multiply(2));
        System.out.println(father.multiply(2));
        son = (Father) son;
        System.out.println(son.multiply(2));
    }

}

class Father{
    public int increment(int a){return a + 1;}
    public int multiply(int a){return increment(a) * 2;}
}


class Son extends Father{

    public int increment(int a){return a + 10;}
}