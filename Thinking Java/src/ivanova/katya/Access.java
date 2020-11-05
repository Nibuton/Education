package ivanova.katya;

public class Access {
    public Access(){
        System.out.println("Hello from here now");
        sum(1,2);
    }

    protected void method(){
        System.out.println("I'm avaliable!");
    }

    private int sum(int a, int b){
        return a + b;
    }
}
