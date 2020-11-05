import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter(new File("input.txt"))) {
            int n = 300;
            int W = 10000;
            Random random = new Random();
            printWriter.println(W + " " + n);
            for (int i = 0; i < n; i++) {
                printWriter.println(random.nextInt(W));
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
