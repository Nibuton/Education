package Chapter_9.Composite;

import java.util.Iterator;

public class CompositeIterator implements Iterator<MenuComponent> {

    public CompositeIterator(Iterator<MenuComponent> iterator) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
