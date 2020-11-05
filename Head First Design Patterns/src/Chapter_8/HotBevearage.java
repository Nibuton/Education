package Chapter_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class HotBevearage {
    final public void prepareBevereage(){
        boil();
        intoTheCup();
        if (condiments()){
            addCondiments();
        }
        serve();
    }

    abstract void addCondiments();
    // hook

    protected boolean condiments(){
        System.out.println("Would you like some condiments?");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String answer = bufferedReader.readLine();
            if (answer.toLowerCase().startsWith("y")){
                return true;
            }
            System.out.println("Well, no condiments :)");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void intoTheCup(){
        System.out.println("Into the cup...");
    }
    private void boil(){
        System.out.println("Boiling water...");
    }

    private void serve(){
        System.out.println("Served");
    }
}
