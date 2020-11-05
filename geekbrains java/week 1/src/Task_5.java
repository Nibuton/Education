import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args){
        int a = ReadIntArgument();
        String answer = PositiveCheck(a);
        System.out.println(answer);
    }

    static int ReadIntArgument(){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Insert number");
        int argument = UserInput.nextInt();
        return argument;
    }

    static String PositiveCheck(int a){
        return a>=0?"Positive":"Negative";
    }
}