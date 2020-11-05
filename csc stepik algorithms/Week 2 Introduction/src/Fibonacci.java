import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger n;
        int m;
        Scanner userInput = new Scanner(System.in);
        n = userInput.nextBigInteger();
        m = userInput.nextInt();
        System.out.println(Fib(n,m));
    }

    public static int Fib(BigInteger n, int m){
        int result;
        if (n.compareTo(BigInteger.valueOf(3)) < 0){
            result = 1;
        }
        else{
            int[] piz = new int [6*m];
            piz[0] = 0;
            piz[1] = 1;
            piz[2] = 1;
            int f1 = 1;
            int f2 = 1;
            int f3;
            int counter = 3;
            for (int i = 3; i < 6*m; i++){
                f3 = f2 + f1;
                piz[i] = f3 % m;
                // System.out.println(piz[i]);
                f1 = f3 - f1;
                f2 = f3;
                if (piz[i] == 1 && piz[i-1] == 1 && piz[i-2] == 0){
                    counter = i-2;
                    break;
                }
            }
            result =  piz[n.mod(BigInteger.valueOf(counter)).intValue()]; // отстаток от деления номера числа на период Пизано
        }
        return result;
    }
}
