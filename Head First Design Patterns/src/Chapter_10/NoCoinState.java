package Chapter_10;

public class NoCoinState implements State {
    private GumMachine gumMachine;

    public NoCoinState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted...");
        gumMachine.setState(gumMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("There is no coin inside");
    }

    @Override
    public void turnCrank() {
        System.out.println("You should pay first");
    }

    @Override
    public void dispense() {
        System.out.println("Nothing was dispensed");
    }
}
