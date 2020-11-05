package chapter10;

public class Task19 {
    public static void main(String[] args) {
        InterfaceWithInnerClass.InnerInsideTheInterface.callInterface(new InterfaceWithInnerClass() {
            @Override
            public void print() {
                System.out.println("I print shit");
            }
        });
    }
}
