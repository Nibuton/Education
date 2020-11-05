import java.util.Arrays;

public class TestForNewBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,10,10,100,200};
        System.out.println(bisect_right(arr, 10));
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
}
