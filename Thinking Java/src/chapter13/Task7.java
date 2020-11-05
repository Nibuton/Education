package chapter13;

public class Task7 {
    public static void main(String[] args) {
        String s = "i like reading books, playing drums, eating shit";
        boolean b1 = s.matches("[a-z].*\\.");
        System.out.println(b1);
    }
}
