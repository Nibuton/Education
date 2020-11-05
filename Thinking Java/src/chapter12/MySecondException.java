package chapter12;

public class MySecondException extends Exception{
    String msg;

    public MySecondException(String msg){ this.msg = msg; }

    @Override
    public String getMessage() {
        return "MySecondException: " + msg;
    }
}
