import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = readArray(scanner);
        int[] B = readArray(scanner);
        printArray(searchArray(B, A));
    }

    public static void printArray(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
    }

    public static int[] readArray(Scanner scanner){
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }
        return A;
    }

    public static int[] searchArray (int[] B, int[] A){
        int[] indexes = new int[B.length];
        for (int i = 0; i < B.length; i++){
            indexes[i] = binarySearch(B[i], A);
        }
        return indexes;
    }

    public static int binarySearch(int k, int[] arr){
        int l = 0;
        int r = arr.length - 1;
        int index;
        while (l <= r){
            index = (int) Math.floor((double) l + (double)(r-l)/2);
            if (k > arr[index]){
                l = index + 1;
            }
            else if (k < arr[index]){
                r = index - 1;
            }
            else{
                return index + 1; // +1 только из-за условий задачи
            }
        }
        return -1;
    }
}
