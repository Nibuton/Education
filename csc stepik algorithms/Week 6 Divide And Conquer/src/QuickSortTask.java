import java.io.*;
import java.util.Scanner;

public class QuickSortTask {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] lefts = new int[n];
        int[] rights = new int[n];

        int[] dots = new int[m];

        for (int i = 0; i < n; i++){
            lefts[i] = scanner.nextInt();
            rights[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++){
            dots[i] = scanner.nextInt();
        }

        // long start = System.currentTimeMillis();

        quickSort2(lefts, 0, n - 1);
        quickSort2(rights, 0, n - 1);

        for (int i = 0; i < m; i++){
            System.out.print((bisect_right(lefts, dots[i]) - bisect_left(rights, dots[i])) + " ");
        }
       // System.out.println();
       // long end = System.currentTimeMillis();
      //  System.out.println((start - end) + " ms");
    }

    public static int bisect_right(int[] A, int x) {
        return bisect_right(A, x, 0, A.length);
    }

    public static int bisect_right(int[] A, int x, int lo, int hi) {
        int N = A.length;
        if (N == 0) {
            return 0;
        }
        if (x < A[lo]) {
            return lo;
        }
        if (x > A[hi - 1]) {
            return hi;
        }
        for (;;) {
            if (lo + 1 == hi) {
                return lo + 1;
            }
            int mi = (hi + lo) / 2;
            if (x < A[mi]) {
                hi = mi;
            } else {
                lo = mi;
            }
        }
    }

    public static int bisect_left(int[] A, int x) {
        return bisect_left(A, x, 0, A.length);
    }

    public static int bisect_left(int[] A, int x, int lo, int hi) {
        int N = A.length;
        if (N == 0) {
            return 0;
        }
        if (x < A[lo]) {
            return lo;
        }
        if (x > A[hi - 1]) {
            return hi;
        }
        for (;;) {
            if (lo + 1 == hi) {
                return x == A[lo] ? lo : (lo + 1);
            }
            int mi = (hi + lo) / 2;
            if (x <= A[mi]) {
                hi = mi;
            } else {
                lo = mi;
            }
        }
    }

    public static void quickSort2(int[] A, int l, int r){
        int[] arr;
        int m1;
        int m2;
        while(l < r) {

            arr = partition2(A, l, r);
            m1 = arr[0];
            m2 = arr[1];
            if (m1 - 1 - l > r - m2 - 1) {
                quickSort2(A, m2 + 1, r);
                r = m1 - 1;
            } else {
                quickSort2(A, l, m1 - 1);
                l = m2 + 1;
            }
        }
    }

    public static int[] partition2(int[] A, int l, int r){
        int index = l;
        int j = l + 1;
        int temp;
        int a = A[l];
        int b = A[(r-l)/2];
        int c = A[r];

        // Медина из середины начала и конца

        if (a >= b){
            if (a >= c){
                if (b >= c){
                    changePlaces(A, (r-l)/2, l);
                }
                else{
                    changePlaces(A,r,l);
                }
            }
        }
        else{
            if (b > c){
                if (c > a){
                    changePlaces(A,r,l);
                }
            }
            else{
                changePlaces(A,(r-l)/2, l);
            }
        }
        int x = A[l];

        for (int i = l+1; i <= r; i++){
            if (A[i] <= x){
                changePlaces(A,i,j);
                j++;
            }
        }

        // еще один проход по той части, где элементы меньше либо равны x

        int k = j - 2;

        changePlaces(A,l,j-1);

        for (int i = l; i < k; i ++){
            if (A[i] == A[j-1]){
                if (A[i] != A[k]) {
                    changePlaces(A, i, k);
                }
                k--;
            }
        }
        int[] indexes = {k + 1, j - 1};
        return indexes;
    }

    public static void changePlaces(int[] A, int i, int j){
        int temp;
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}

