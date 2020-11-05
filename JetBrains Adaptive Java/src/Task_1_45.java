/*
Given number N. Print all integer powers of two, not exceeding N, in ascending order.
 */

import java.util.Scanner;

public class Task_1_45 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n){
            System.out.println(i);
            i*=2;
        }
    }

    public static int square(int a){
        return a*a;
    }
}
