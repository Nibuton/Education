import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.LongStream;

public class SpeedTest {
    public static void main(String[] args) {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        /*long[] ans = new long[n/100];
        for (int i = 0; i < n/100; i++){
            ans[i] = streamTest(arr) - foreachTest(arr);
        }*/
        System.out.println("Streamtest: " + streamTest(arr) + " foreachTest: " +  foreachTest(arr));
    }

    public static long foreachTest(int[] arr){
        int curr = 1;
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
            curr = curr + i;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long streamTest(int[] arr){
        long start = System.currentTimeMillis();
        Arrays.stream(arr).parallel().reduce(1,(a,b) -> a+b);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
