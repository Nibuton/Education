package chapter13;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {

    public static Formatter formatter = new Formatter(System.err);

    public static void main(String[] args) {
        formatter.format("%-15s The turtle", "NikitaNikitaNikitaNikita");
    }
}
