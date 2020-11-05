package chapter12;

public class Task1 {
    public static void main(String[] args) {
        try{
            throw new Exception("This is bad");
        }
        catch(Exception e){
           System.err.print(e.getMessage());
        }
        finally {
            System.out.println("I'm in finally");
        }
    }
}
