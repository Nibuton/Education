import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Generator {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("Testing.txt");
        int n = 50000;
        int m = 50000;
        int a;
        int b;
        Random random = new Random();
        /*
        printWriter.println(n);
        for (int i = 0; i < n; i++){
            printWriter.print(random.nextInt() + " ");
        }
        */
        printWriter.println(n + " " + m);
        for (int i = 0; i < n; i++){
            /*a = random.nextInt();
            b = random.nextInt();
            int c = Math.max(a,b);
            int d = Math.min(a,b);*/
            int c = 10000000;
            int d = 1000;
            printWriter.println(d + " " + c);
        }

        for (int i = 0; i < m; i++){
            printWriter.print(random.nextInt(5000) + " ");
        }
        printWriter.close();
    }
}
