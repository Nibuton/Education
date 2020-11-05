package chapter9;

abstract class Task3 {

    public Task3() {
        System.out.println("I make Task3");
        this.print();
    }

    abstract public void print();
}

class Son extends Task3{

    private int i = 10;

    public Son(){
        System.out.println("I make Son");
    }

    @Override
    public void print() {
        System.out.println("I'm son " + i);
    }
}
