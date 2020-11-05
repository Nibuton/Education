package Chapter_9.Composite;

public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent macMenu = new Menu("MacDn Menu", "FastFood Restaurant");
        MenuComponent karavaeyviMenu = new Menu("Karavayevi Menu", "Familiy Reataurant");
        MenuComponent murkameMenu = new Menu("Murakame Menu", "Koreyan Restaurant");
        MenuComponent murakameVeggieMenu = new Menu("Murakame Veggie Menu", "For Veggies");

        MenuComponent allMenus = new Menu("All Menus", "All menus of all restaurants");
        allMenus.add(macMenu);
        allMenus.add(karavaeyviMenu);
        allMenus.add(murkameMenu);

        macMenu.add(new MenuItem("Big Mac", 3.99));
        karavaeyviMenu.add(new MenuItem("Chicken eith peanuts", 9.99));
        murkameMenu.add(new MenuItem("Chicken Curry Rice", 8.99));
        murkameMenu.add(murakameVeggieMenu);
        murakameVeggieMenu.add(new MenuItem("Beans", 19.99));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
