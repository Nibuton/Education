package Chapter_9.Iterator;
import java.util.Iterator;

public class DinerMenu implements Menu{
    final int MAX_ITEMS = 6;
    int numOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Sausages", 3.45);
        addItem("Potatoes", 1.99);
        addItem("Bacon", 3.99);
    }

    public void addItem(String name, double price){
        if (numOfItems >= MAX_ITEMS){
            System.err.println("Sorry, but dinner menu is full :(");
        }
        else{
            MenuItem newItem = new MenuItem(name, price);
            menuItems[numOfItems] = newItem;
            numOfItems+=1;
        }
    }

    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
