package chapter12;

public class MyException extends Exception{
    String msg;
    // public MyException(){};
    public MyException(String msg){this.msg = msg;}

    @Override
    public String getMessage() {
        return "Расширенное сообщение об ошибке: " + msg + " ";
    }
}
