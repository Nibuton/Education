package chapter10;

public class Outer {

    private String b;

    public Outer(String b){
        this.b = b;
    }

    private void method(){
        Inner inner = new Inner(100);
        System.out.println(inner.a);
    }

    public static void main(String[] args) {
        Outer outer = new Outer("Nikita");
        Outer.Inner inner = outer.makeInner(3);
        System.out.println(inner);
    }

    class Inner {
        private int a;
        public Inner(int a){
            this.a = a;
        }
        public String toString(){ return b; }
    }

    public Inner makeInner(int a){
        return new Inner(a);
    }
}

class Task5{

    public static void main(String[] args) {
        Outer outer = new Outer("abc");
        Outer.Inner inner = outer.new Inner(9);
    }
}
