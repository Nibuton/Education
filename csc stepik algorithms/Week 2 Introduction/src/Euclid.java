import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        long a;
        long b;
        Scanner userInput = new Scanner(System.in);
        a = userInput.nextLong();
        b = userInput.nextLong();
        System.out.println(Ecd(a,b));
    }

    public static long Ecd(long a, long b){
        long result;
        if (a == 0){
            return b;
        }
        else if (b == 0){
            return a;
        }
        else if (a >= b){
            return Ecd(a % b, b);
        }
        else {
            return Ecd(b % a,a);
        }
    }
}
