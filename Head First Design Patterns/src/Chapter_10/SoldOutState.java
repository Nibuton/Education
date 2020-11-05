package Chapter_10;

public class SoldOutState implements State {

    public SoldOutState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    private GumMachine gumMachine;

    @Override
    public void insertCoin() {
        System.out.println("Sorry we are out of gums");
    }

    @Override
    public void ejectCoin() {
        System.out.println("There is no coin inside");
    }

    @Override
    public void turnCrank() {
        System.out.println("There is no coin inside and no balls");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing was dispensed");
    }
}
