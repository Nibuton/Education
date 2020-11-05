package chapter12;

public class Task10_11 {

    public static void main(String[] args) {
        try{
            f();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void f() throws MySecondException{
        try{
           g();
        } catch(MyException e){
            MySecondException mySecondException = new MySecondException("MySecondExc from f()");
            mySecondException.initCause(e);
            mySecondException.fillInStackTrace();
            throw mySecondException;
        }
    }

    private static void g() throws MyException{
        throw new MyException("My Exception from g()");
    }

}
