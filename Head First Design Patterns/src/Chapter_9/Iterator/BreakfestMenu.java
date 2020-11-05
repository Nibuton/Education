package Chapter_9.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class BreakfestMenu implements Menu{
    List<MenuItem> menuItems;

    public BreakfestMenu() {
        menuItems = new ArrayList<>();
        addItem("Eggs", 2.99);
        addItem("Porige", 3.46);
        addItem("Coffee", 1.54);
    }

    public void addItem(String name, double price){
        menuItems.add(new MenuItem(name, price));
    }

    @Override
    public Iterator createIterator(){
        // return new BreakfestMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
