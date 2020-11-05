package Chapter_9.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BreakfestMenuIterator implements Iterator<MenuItem> {

    List<MenuItem> menuItems = new ArrayList<>();
    int position = 0;

    public BreakfestMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position+=1;
        return menuItem;
    }
}
