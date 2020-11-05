package chapter10;

public class Task13 {
    private String name;
    private long id;

    public Task13(String name, long id){ this.name = name; this.id = id; }
    public void print(){
        System.out.println("i'm here");
    }
}

class SecondClass{
    public static Task13 getTask13(final String name, final int id){
        return new Task13(name, id){
            @Override
            public void print() {
                System.out.println("i'm not here");
            }
        };
    }
}
