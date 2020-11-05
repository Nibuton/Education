package Chapter_9.Iterator;

import java.util.Iterator;

public class Waitress {
    Menu breakfestMenu;
    Menu dinerMenu;

    public Waitress(Menu breakfestMenu, Menu dinerMenu) {
        this.breakfestMenu = breakfestMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator breakfestIterator = breakfestMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("BREAKFEST MENU\n");
        printMenu(breakfestIterator);
        System.out.println("\nDINER MENU\n");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
        }
    }
}
