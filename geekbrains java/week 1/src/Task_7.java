import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        String name = ReadStringArgument();
        String answer = Hello(name);
        System.out.println(answer);
    }

    static String ReadStringArgument() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert name");
        String argument = UserInput.nextLine();
        return argument;
    }

    static String Hello(String name){
        return "Hello, " + name + "!";
    }
}