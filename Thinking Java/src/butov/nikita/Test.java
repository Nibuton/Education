package butov.nikita;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        InInAccess inInAccess = new InInAccess();
        inInAccess.say("a");
        InAccess inAccess = inInAccess;
        inAccess.say("b");
        Access access = inAccess;
        access.say("c");
        Long val = new Long("123");
        System.out.println(val);
        // IntStream.range(0,10).map((a) -> (9 - a)).forEach((a) -> System.out.print((a + " ")));
        for (int i = 9; i >= 0; i--){
            System.out.print( i+ " ");
        }

    }
}

class Controls{

    Controls b;

    void right(){

    };

    void left() {

    }

}

class Car{

    private String name;
    private Controls controls = new Controls();
    public Car (String name){
         this.name = name;
    }
    public void right (){
        controls.right();
    }
    public void left (){
        controls.left();
    }

    public void Beep(int i){
        System.out.println("Beep " + i + " times");
    }

    public void Beep(double d){
        System.out.println("Beep " + d + " times");
    }

    public void Beep(String s){
        System.out.println("Beep " + s + " bastard");
    }
}

class Audi extends Car{

    public Audi(){
        super("Audi");
    }

    public void Beep(char c){
        System.out.println("Audi beep " + c);
    }

}






