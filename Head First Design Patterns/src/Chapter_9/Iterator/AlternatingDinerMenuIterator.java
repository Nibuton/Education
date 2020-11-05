package Chapter_9.Iterator;
import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove isn't supported");
    }
}
