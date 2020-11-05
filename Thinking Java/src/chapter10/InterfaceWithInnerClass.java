package chapter10;

public interface InterfaceWithInnerClass {
    public void print();
    class InnerInsideTheInterface{
        public InnerInsideTheInterface(){
            System.out.println("I'm inside the constructor of a nested class inside an interface");
        }
        public void sayHello(){
            System.out.println("Hello");
        }
        public static void callInterface(InterfaceWithInnerClass interfaceWithInnerClass){
            interfaceWithInnerClass.print();
        }
    }
}
