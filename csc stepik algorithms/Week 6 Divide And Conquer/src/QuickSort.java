import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Testing.txt"));
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort2(arr, 0 , arr.length - 1);
        long end = System.currentTimeMillis();
        for (int a : arr){
            System.out.println(a);
        }
        System.out.println(end - start + " ms");
    }

    public static void quickSort1(int[] A, int l, int r){
        int m;
        if (l >= r){
            return;
        }
        m = partition(A, l , r);
        quickSort1(A, m + 1, r);
        quickSort1(A, l, m-1);
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

    public static int partition(int[] A, int l, int r){
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
        changePlaces(A,l,j-1);
        return j - 1;
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

    public static void printArray(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}

