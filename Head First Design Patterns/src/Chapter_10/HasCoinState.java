package Chapter_10;

import java.util.Random;

public class HasCoinState implements State {

    private GumMachine gumMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasCoinState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("There is a coin inside, can't take two at once");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Ejecting the coin...");
        gumMachine.setState(gumMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumMachine.getCount() > 1)){
            gumMachine.setState(gumMachine.getWinnerState());
        }
        else {
            gumMachine.setState(gumMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Nothing was dispensed");
    }
}
