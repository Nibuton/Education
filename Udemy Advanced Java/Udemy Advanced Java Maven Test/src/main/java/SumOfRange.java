import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfRange {
    public static void main(String[] args) {
    }

    public static int sum(int a, int b){
        return IntStream.rangeClosed(a,b).reduce(0, (c,d) -> c + d);
    }
}
