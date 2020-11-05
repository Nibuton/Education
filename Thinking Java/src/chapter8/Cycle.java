package chapter8;

public class Cycle {

    public void balance(){
        System.out.println("Cycle balance");
    }

    public static void main(String[] args) {
        Cycle[] cycles = {new UniCycle(), new BiCycle(), new TriCycle()};
        for(Cycle c : cycles){ c.balance(); }
        UniCycle uniCycle = (UniCycle) cycles[0];
        BiCycle bicycle = (BiCycle) cycles[1];
        TriCycle triCycle = (TriCycle) cycles[2];
        uniCycle.balance();
        bicycle.balance();
        triCycle.balance();
    }
}

class UniCycle extends Cycle{
    @Override
    public void balance() {
        System.out.println("UniCeycle balance");
    }
}

class BiCycle extends Cycle{
    @Override
    public void balance() {
        System.out.println("bicycle balance");
    }
}

class TriCycle extends Cycle{

}
