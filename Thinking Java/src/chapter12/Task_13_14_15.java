package chapter12;

public class Task_13_14_15 {
    private static boolean isOn = false;
    private static void setOn(){ isOn = true; }
    private static void setOff(){ isOn = false; }
    public static void main(String[] args) {
        try{
            setOn();
            f();
        }
        catch(Exception e){
            e.printStackTrace();
            g();
        }
        finally{
            System.out.println("finally");
            setOff();
        }
    }

    private static void f() throws RuntimeException{
        throw new RuntimeException("From f()");
    }
    private static void g() throws NullPointerException{
        throw new NullPointerException("From g()");
    }
}
