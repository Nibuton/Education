import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args){
        // task_3
        double a = ReadDoubleArgument('a');
        double b = ReadDoubleArgument('b');
        double c = ReadDoubleArgument('c');
        double d = ReadDoubleArgument('d');
        double answer = Calculation(a,b,c,d);
        System.out.println(answer);
    }

    static double ReadDoubleArgument(char letter){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert " + letter);
        double argument = UserInput.nextDouble();
        return argument;
    }

    static double Calculation(double a, double b, double c, double d){
        return a*(b+(c/d));
    }
}

