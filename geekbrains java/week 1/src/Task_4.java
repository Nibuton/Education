import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args){
        double a = ReadDoubleArgument("first");
        double b = ReadDoubleArgument("second");
        boolean answer = SumCheck(a,b);
        System.out.println(answer);
    }

    static double ReadDoubleArgument(String th){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert " + th + " number");
        double argument = UserInput.nextDouble();
        return argument;
    }

    static boolean SumCheck(double a, double b){
        return a+b >= 10 && a+b <= 20?true:false;
    }
}
