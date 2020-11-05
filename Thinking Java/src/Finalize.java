public class Finalize {

    boolean empty = true;

    public Finalize(boolean empty){ this.empty = empty;};

    public void finalize(){
        if (empty == false) {
            System.out.println("boom");
        }
    }
}
