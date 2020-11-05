package chapter10;
public class Main {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Selector selector = outer2.getInner3WithUpcastToInterface();
        Task13 task13 = SecondClass.getTask13("Nikita", 15);
        task13.print();
    }
}
