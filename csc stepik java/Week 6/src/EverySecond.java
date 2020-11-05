import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class EverySecond {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = bufferedReader.readLine();
        bufferedReader.close();
        if (s != null){
            String[] numbers = s.split(" ");
            int n = numbers.length;
            if (numbers.length % 2 == 1){
                n--;
            }
            for (int i = n - 1; i >=0; i-=2){
                System.out.print(numbers[i] + " ");
            }
        }
        else{
            System.out.println();
        }
    }
}
