package Chapter_10;

public class GumMachineTestDrive {
    public static void main(String[] args) {
        GumMachine gumMachine = new GumMachine(5);

        gumMachine.turnCrank();
        gumMachine.ejectCoin();
        gumMachine.insertCoin();
        gumMachine.ejectCoin();

        gumMachine.insertCoin();
        gumMachine.turnCrank();
        gumMachine.insertCoin();
        gumMachine.turnCrank();
        gumMachine.insertCoin();
        gumMachine.turnCrank();
        gumMachine.insertCoin();
        gumMachine.turnCrank();
        gumMachine.insertCoin();
        gumMachine.turnCrank();

        gumMachine.insertCoin();
        gumMachine.turnCrank();


    }
}
