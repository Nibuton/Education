package chapter9;

public class Task14 extends BaseForTask implements InterfaceD {

    @Override
    public void a() {
        System.out.println(this.getClass().getSimpleName() + ".a()");
    }

    @Override
    public void b() {
        System.out.println(this.getClass().getSimpleName() + ".b()");
    }

    @Override
    public void c() {
        System.out.println(this.getClass().getSimpleName() + ".c()");
    }

    @Override
    public void d() {
        System.out.println(this.getClass().getSimpleName() + ".d()");
    }

    public void MethodForInterfaceA(InterfaceA interfaceA){
        interfaceA.a();
    }

    public void MethodForInterfaceB(InterfaceB interfaceB){
        interfaceB.b();
    }

    public void MethodForInterfaceC(InterfaceC interfaceC){
        interfaceC.c();
    }

    public void MethodForInterfaceD(InterfaceD interfaceD){
        interfaceD.d();
    }

    public static void main(String[] args) {
        Task14 task14 = new Task14();
        task14.MethodForInterfaceA(task14);
        task14.MethodForInterfaceB(task14);
        task14.MethodForInterfaceC(task14);
        task14.MethodForInterfaceD(task14);
    }
}

interface InterfaceA{
    public void a();
}

interface InterfaceB{
    public void b();
}

interface InterfaceC{
    public void c();
}

interface InterfaceD extends InterfaceA, InterfaceB, InterfaceC{
    public void d();
}

abstract class BaseForTask{
    
    public BaseForTask(){
        System.out.println("I make BaseForTask");
    }
}

