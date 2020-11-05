package chapter10;

public class Sequence{

    private Object items[];
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object o){
        if (next < items.length){
            items[next++] = o;
        }
    }
    private class SequenceSelector implements Selector{

        private int i = 0;

        @Override
        public Object current() { return items[i]; }

        @Override
        public void next() { if(i < items.length) i++; }

        @Override
        public boolean end() { return i == items.length; }

        public Sequence sequence(){ return Sequence.this; }
    }

    public Selector selector(){ return new SequenceSelector(); }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        Selector selector = sequence.selector();
        SequenceSelector selector2 = sequence.new SequenceSelector();
        selector2.sequence().add(new Task2("Nikita"));
        sequence.add(new Task2("Katya"));
        sequence.add(new Task2("Love"));
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }

    }
}

class Task2{
    private String s;
    public Task2(String s){ this.s = s; }
    public String toString(){ return s; }
}