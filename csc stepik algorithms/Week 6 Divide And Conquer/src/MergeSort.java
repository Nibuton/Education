import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSort {

    public static long counter = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] numbers = bufferedReader.readLine().split(" ");
        bufferedReader.close();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(numbers[i]);
        }
        Sort(arr);
        System.out.println(counter);
    }

    public static int[] Sort(int[] arr){
        int len = arr.length;
        if(len > 1){
            int a = len/2;
            int[] left = Arrays.copyOfRange(arr, 0, a);
            int[] right = Arrays.copyOfRange(arr,a,arr.length);
            return Merge(Sort(left), Sort(right));
        }
        else{
            return arr;
        }
    }

    public static int[] Merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int[] arr = new int[left.length + right.length];
        while(i != left.length && j != right.length){
            if (left[i] <= right[j]){
                arr[i+j] = left[i];
                i++;
            }
            else{
                arr[i+j] = right[j];
                j++;
                counter+= left.length - i;
            }
        }
       if (i == left.length){
            endWrite(arr, right, j);
        }
        else{
            endWrite(arr,left,i);
        }
        return arr;
    }

    public static void endWrite(int[] target, int[] tail, int index){
        for (int i = index; i < tail.length; i++){
            target[target.length - tail.length + i] = tail[i];
        }
        return;
    }

}
