package chapter10;

public class Outer2 {
    private int i;
    private void method(){
        System.out.println("Fucks");
        System.out.println(i);
    }

    public Selector getInner3WithUpcastToInterface(){ return new Inner3(); };

    class Inner2{
        void innerMethod(){
            i++;
            Outer2.this.method();
        }
    }

    private void SecondMethod(){
        Inner2 inner2 = new Inner2();
        inner2.innerMethod();
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.SecondMethod();
    }

    private class Inner3 implements Selector{
        @Override
        public Object current() {
            return null;
        }

        @Override
        public void next() {
        }

        @Override
        public boolean end() {
            return false;
        }
    }
}
