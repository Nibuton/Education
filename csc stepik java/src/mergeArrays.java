import java.math.BigInteger;

public class mergeArrays {
    public static void main(String[] args) {
        int[] a1 = {1,2,20};
        int[] a2 = {1,5,88};
        int[] arr = merge(a1,a2);
        printArray(arr);
    }

    public static int[] merge(int[] a1, int[] a2) {
        int length = a1.length + a2.length;
        int i = 0;
        int j = 0;
        int[] arr = new int[length];
        while (i < a1.length & j < a2.length){
            if (a1[i] <= a2[j]){
                arr[i+j] = a1[i];
                i++;
            }
            else{
                arr[i+j] = a2[j];
                j++;
            }
        }
        if (i == a1.length) {
            while (j < a2.length) {
                arr[i + j] = a2[j];
                j++;
            }
        }
        else {
            while (i < a1.length){
                arr[i + j] = a1[i];
                i++;
            }
        }
        return arr;
    }


    public static void printArray(int[] arr){
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}

