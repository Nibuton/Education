package chapter9;

abstract class Task4 {
    abstract void normalPrint();
}

class SonOfTask4 extends Task4{

    public void print(){
        System.out.println("I'm in print in SonOfTask4");
    }

    public static void reference(Task4 task4){
        ((SonOfTask4) task4).print();
    }

    @Override
    void normalPrint() {
        System.out.println("I'm in normalPrint in SonOfTask4");
    }

    public static void normalReference(Task4 task4){
        task4.normalPrint();
    }
}
