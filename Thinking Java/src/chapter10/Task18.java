package chapter10;

public class Task18 implements InterfaceWithInnerClass{
    @Override
    public void print() {
        System.out.println("Hey, i overrided print");
    }

    public static void main(String[] args) {
        new InnerInsideTheInterface().sayHello();
    }
}
