import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
        int a = ReadIntArgument();
        boolean answer = NegativeCheck1(a);
        System.out.println(answer);
    }

    static int ReadIntArgument() {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert number");
        int argument = UserInput.nextInt();
        return argument;
    }

    static boolean NegativeCheck1(int a) {
        return a < 0 ? true : false;
    }
}