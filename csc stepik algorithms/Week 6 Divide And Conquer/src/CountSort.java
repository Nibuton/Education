import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = scanner.nextInt();
        }
        int[] C = countSort(A, 11);
        printArray(C);
    }

    public static int[] countSort(int[] A, int m){
        int[] B = new int[m];
        int n = A.length;
        int[] C = new int[n];
        for (int i = 0; i < n; i++){
            B[A[i]] += 1;
        }
        for (int i = 1; i < m; i++){
            B[i] += B[i-1];
        }
        for (int i = n - 1; i >= 0; i--){
            C[B[A[i]] - 1] = A[i];
            B[A[i]] = B[A[i]] - 1;
        }
        return C;
    }

    public static void printArray(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}
