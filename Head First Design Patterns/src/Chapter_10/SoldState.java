package Chapter_10;

public class SoldState implements State {

    private GumMachine gumMachine;

    public SoldState(GumMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, you will receive your gum soon");
    }

    @Override
    public void ejectCoin() {
        System.out.println("You have already paid");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait, you will receive your gum soon");
    }

    @Override
    public void dispense() {
        gumMachine.releaseBall();
        if (gumMachine.getCount() > 0){
            gumMachine.setState(gumMachine.getNoCoinState());
        }
        else{
            System.out.println("Out of gums now");
            gumMachine.setState(gumMachine.getSoldOutState());
        }
    }
}
