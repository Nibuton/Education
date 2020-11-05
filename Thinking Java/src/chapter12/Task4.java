package chapter12;

public class Task4 {
    public static void main(String[] args){
        try {
            throw new MyException("My Message");
        }
        catch (Exception e){
            System.out.println(e.getClass().getName());
        }
    }
}
