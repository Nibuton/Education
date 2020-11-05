package chapter8;

public class Rodent {

    Plate plate;
    private static long counter = 0;
    private final long id = counter++;

    public Rodent(Plate plate){
        System.out.println("I made a Rodent");
        this.plate = plate;
        this.plate.addRef();
    }

    public void makeSound(){
        System.out.println("Abstract Sound");
    }

    public void dispose(){
        System.out.println("I disposed Rodent" + this.getId());
        plate.dispose();
    }

    /*@Override
    public String toString() {
        return "Rodent " + id;
    }*/

    public long getId(){return id;}

    public static void main(String[] args) {
        Plate plate = new Plate();
        Rodent[] rodents = {new Lion(plate), new Mouse(plate), new Lion(plate), new Mouse(plate)};
        for (Rodent r : rodents){
            r.dispose();
        }
    }

}

class Lion extends Rodent{

    Plate plate;

    public Lion(Plate plate) {
        super(plate);
        System.out.println("I made a lion");
        this.plate = plate;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void dispose(){
        System.out.println("I disposed Lion" + this.getId());
        super.dispose();
    }

   /* @Override
    public String toString() {
        return "Lion " + this.getId();
    } */

}

class Mouse extends Rodent{

    Plate plate;

    public Mouse(Plate plate) {
        super(plate);
        System.out.println("I made a mouse");
        this.plate = plate;
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a mouse");
    }

    @Override
    public void dispose(){
        System.out.println("I disposed Mouse" + this.getId());
        super.dispose();
    }

    /*@Override
    public String toString() {
        return "Mouse " + this.getId();
    }*/

}

class Plate{

    private int refcount = 0;

    private static long counter = 0;

    private final long id = counter++;

    public void addRef(){ refcount++; }

    public Plate(){
        System.out.println("I made a plate " + id);
    }

    protected void finalize() throws Throwable {
        if (refcount != 0){
            throw new Exception("You didn't delete an object with active refs");
        }
    }

    public void dispose(){
        refcount--;
        if (refcount == 0){
            System.out.println("I disposed Plate" + this.id);
        }
    }

}



