package Chapter_7.Adapter;

import Chapter_7.Adapter.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Turkey turkey = new OrdinaryTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Object> iterator = list.iterator();

        Enumeration<Object> iteratorEnumeration = new IteratorEnumeration(iterator);

        while (iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}

