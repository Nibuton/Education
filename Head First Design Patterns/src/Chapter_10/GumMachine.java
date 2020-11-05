package Chapter_10;

public class GumMachine {
    State state;
    int count = 0;

    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
    State winnerState;

    public GumMachine(int count) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0){
            state = noCoinState;
        }
        else{
            state = soldOutState;
        }
    }

    public void insertCoin(){
        state.insertCoin();
    }
    public void ejectCoin(){
        state.ejectCoin();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void releaseBall(){
        System.out.println("A gum comes rolling from the slot...");
        if (count != 0){
            count-=1;
        }
    }
    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
