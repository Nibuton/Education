package Chapter_9.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuItem extends MenuComponent{

    /* неверная реализция */
    Iterator<MenuComponent> iterator = null;
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    /* неверная реализция */

    String name;
    double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getPrice());
    }

    /* неверная реализция */
    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
    /* неверная реализция */
}
