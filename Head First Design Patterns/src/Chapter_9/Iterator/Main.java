package Chapter_9.Iterator;

public class Main {
    public static void main(String[] args) {
        BreakfestMenu breakfestMenu = new BreakfestMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(breakfestMenu, dinerMenu);
        waitress.printMenu();
    }
}
